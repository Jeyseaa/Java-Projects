package Customer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class History extends JFrame implements ActionListener {
    private final int userId;
    private final String userName;
    private final Menu menu;
    private final JTable table;

    public History(int userId, String userName, Menu menu) {
        this.userId = userId;
        this.userName = userName;
        this.menu = menu;

        JLabel label = new JLabel("Transaction History");
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        label.setBounds(580, 50, 200, 30);
        add(label);

        table = new JTable();
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setFont(new Font("Arial", Font.PLAIN, 15));
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"User ID", "Transaction ID", "Transaction Type", "Amount", "Timestamp"}
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(80, 80, 1200, 400);
        add(scrollPane);

        JButton backButton = new JButton("Back");
        backButton.setBounds(620, 490, 100, 30);
        backButton.addActionListener(this);
        add(backButton);

        fetchTransactionHistory(userId);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1500, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void fetchTransactionHistory(int userId) {
        System.out.println("Inside fetchTransactionHistory method.");

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM transaction_history WHERE user_id = ?")) {

            preparedStatement.setInt(1, userId);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int transactionId = resultSet.getInt("id");
                    String transactionType = resultSet.getString("transaction_type");
                    int amount = resultSet.getInt("amount");
                    String timestamp = resultSet.getString("timestamp");

                    System.out.println("Transaction ID: " + transactionId +
                            ", Type: " + transactionType +
                            ", Amount: " + amount +
                            ", Timestamp: " + timestamp);

                    model.addRow(new Object[]{userId, transactionId, transactionType, amount, timestamp});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error in SQL: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            menu.setVisible(true);
            showResultAndTransactions();
            this.dispose();
        }
    }

    private void showResultAndTransactions() {
        fetchTransactionHistory(userId);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            int userId = 1;
            String userName = "Test User";
            int initialBalance = 1000;

            Menu menu = new Menu(userId, userName, initialBalance);
            new History(userId, userName, menu);
        });
    }
}
