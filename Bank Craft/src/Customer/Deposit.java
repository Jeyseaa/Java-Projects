package Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame implements ActionListener {
    private int userId;
    private String userName;
    private int currentBalance;
    private static Menu menu;
    private JTextField textAmount;
    private JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n, delete, enter, exit, back;


    public Deposit(int userId, String userName, int currentBalance, Menu menu) {
        this.userId = userId;
        this.userName = userName;
        this.currentBalance = currentBalance;
        Deposit.menu = menu;

        createUI();
        initializeFrame();
    }

    private void createUI() {
        JLabel labelName11 = new JLabel("Your ID: ");
        labelName11.setFont(new Font("Raleway", Font.BOLD, 14));
        labelName11.setBounds(460, 300, 400, 30);
        add(labelName11);

        JTextField textUserID = new JTextField(String.valueOf(userId));
        textUserID.setFont(new Font("Raleway", Font.PLAIN, 14));
        textUserID.setBounds(520, 300, 200, 30);
        textUserID.setEditable(false);
        add(textUserID);

        JLabel labelName12 = new JLabel("Your Name: ");
        labelName12.setFont(new Font("Raleway", Font.BOLD, 14));
        labelName12.setBounds(430, 350, 400, 30);
        add(labelName12);

        JTextField textUserName = new JTextField(userName);
        textUserName.setFont(new Font("Raleway", Font.PLAIN, 14));
        textUserName.setBounds(520, 350, 200, 30);
        textUserName.setEditable(false);
        add(textUserName);

        textAmount = new JTextField("");
        textAmount.setFont(new Font("Raleway", Font.PLAIN, 14));
        textAmount.setBounds(520, 385, 200, 30);
        add(textAmount);

        JLabel labelName6 = new JLabel("Deposit Amount: ");
        labelName6.setFont(new Font("Raleway", Font.BOLD, 14));
        labelName6.setBounds(400, 385, 400, 30);
        add(labelName6);

        delete = new JButton("");
        delete.setBounds(590, 583, 71, 25);
        delete.setBackground(Color.black);
        delete.setForeground(Color.white);
        delete.addActionListener(this);
        delete.setOpaque(false);
        delete.setContentAreaFilled(false);
        delete.setBorderPainted(false);
        add(delete);

        back = new JButton("");
        back.setBounds(198, 435, 72, 54);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        add(back);

        JLabel labelName1 = new JLabel("BACK");
        labelName1.setFont(new Font("Railway", Font.PLAIN, 40));
        labelName1.setForeground(Color.BLACK);
        labelName1.setBounds(275, 435, 400, 60);
        add(labelName1);

        enter = new JButton("");
        enter.setBounds(580, 650, 80, 35);
        enter.setBackground(Color.black);
        enter.setForeground(Color.white);
        enter.addActionListener(this);
        enter.setOpaque(false);
        enter.setContentAreaFilled(false);
        enter.setBorderPainted(false);
        add(enter);

        exit = new JButton("");
        exit.setBounds(808, 438, 72, 54);
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        add(exit);

        JLabel labelName2 = new JLabel("LOGOUT");
        labelName2.setFont(new Font("Railway", Font.PLAIN, 40));
        labelName2.setForeground(Color.BLACK);
        labelName2.setBounds(630, 438, 400, 60);
        add(labelName2);

        n1 = new JButton("");
        n1.setBounds(405, 583, 53, 25);
        n1.setBackground(Color.black);
        n1.setForeground(Color.white);
        n1.addActionListener(this);
        n1.setOpaque(false);
        n1.setContentAreaFilled(false);
        n1.setBorderPainted(false);
        add(n1);

        n2 = new JButton("");
        n2.setBounds(464, 583, 50, 25);
        n2.setBackground(Color.black);
        n2.setForeground(Color.white);
        n2.addActionListener(this);
        n2.setOpaque(false);
        n2.setContentAreaFilled(false);
        n2.setBorderPainted(false);
        add(n2);

        n3 = new JButton("");
        n3.setBounds(519, 583, 50, 25);
        n3.setBackground(Color.black);
        n3.setForeground(Color.white);
        n3.addActionListener(this);
        n3.setOpaque(false);
        n3.setContentAreaFilled(false);
        n3.setBorderPainted(false);
        add(n3);

        n4 = new JButton("");
        n4.setBounds(400, 608, 53, 22);
        n4.setBackground(Color.black);
        n4.setForeground(Color.white);
        n4.addActionListener(this);
        n4.setOpaque(false);
        n4.setContentAreaFilled(false);
        n4.setBorderPainted(false);
        add(n4);

        n5 = new JButton("");
        n5.setBounds(457, 608, 53, 22);
        n5.setBackground(Color.black);
        n5.setForeground(Color.white);
        n5.addActionListener(this);
        n5.setOpaque(false);
        n5.setContentAreaFilled(false);
        n5.setBorderPainted(false);
        add(n5);

        n6 = new JButton("");
        n6.setBounds(512, 608, 53, 22);
        n6.setBackground(Color.black);
        n6.setForeground(Color.white);
        n6.addActionListener(this);
        n6.setOpaque(false);
        n6.setContentAreaFilled(false);
        n6.setBorderPainted(false);
        add(n6);

        n7 = new JButton("");
        n7.setBounds(390, 630, 53, 22);
        n7.setBackground(Color.black);
        n7.setForeground(Color.white);
        n7.addActionListener(this);
        n7.setOpaque(false);
        n7.setContentAreaFilled(false);
        n7.setBorderPainted(false);
        add(n7);

        n8 = new JButton("");
        n8.setBounds(450, 630, 53, 22);
        n8.setBackground(Color.black);
        n8.setForeground(Color.white);
        n8.addActionListener(this);
        n8.setOpaque(false);
        n8.setContentAreaFilled(false);
        n8.setBorderPainted(false);
        add(n8);

        n9 = new JButton("");
        n9.setBounds(510, 630, 53, 22);
        n9.setBackground(Color.black);
        n9.setForeground(Color.white);
        n9.addActionListener(this);
        n9.setOpaque(false);
        n9.setContentAreaFilled(false);
        n9.setBorderPainted(false);
        add(n9);

        n = new JButton("");
        n.setBounds(442, 653, 54, 23);
        n.setBackground(Color.black);
        n.setForeground(Color.white);
        n.addActionListener(this);
        n.setOpaque(false);
        n.setContentAreaFilled(false);
        n.setBorderPainted(false);
        add(n);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/newbg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1400, 700);
        add(l3);
    }

    private void initializeFrame() {
        getContentPane().setBackground(new Color(135, 206, 250));
        setLayout(null);
        setSize(1550, 1080);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            this.dispose();
        } else if (e.getSource() == n1) {
            textAmount.setText(textAmount.getText() + "1");
        } else if (e.getSource() == n2) {
            textAmount.setText(textAmount.getText() + "2");
        } else if (e.getSource() == n3) {
            textAmount.setText(textAmount.getText() + "3");
        } else if (e.getSource() == n4) {
            textAmount.setText(textAmount.getText() + "4");
        } else if (e.getSource() == n5) {
            textAmount.setText(textAmount.getText() + "5");
        } else if (e.getSource() == n6) {
            textAmount.setText(textAmount.getText() + "6");
        } else if (e.getSource() == n7) {
            textAmount.setText(textAmount.getText() + "7");
        } else if (e.getSource() == n8) {
            textAmount.setText(textAmount.getText() + "8");
        } else if (e.getSource() == n9) {
            textAmount.setText(textAmount.getText() + "9");
        } else if (e.getSource() == n) {
            textAmount.setText(textAmount.getText() + "0");
        } else if (e.getSource() == delete) {
            handleDelete();
        } else if (e.getSource() == enter) {
            handleDeposit();
        } else if (e.getSource() == back) {
            goBackToMenu();
        }
    }

    private void handleDelete() {
        char[] currentText = textAmount.getText().toCharArray();
        if (currentText.length > 0) {
            textAmount.setText(new String(currentText, 0, currentText.length - 1));
        }
    }

    private void handleDeposit() {
        String amountStr = textAmount.getText();
        if (!amountStr.isEmpty()) {
            try {
                int amount = Integer.parseInt(amountStr);
                if (amount > 0) {
                    int newBalance = currentBalance + amount;
                    currentBalance += amount;
                    DatabaseManager.updateBalance(userId, newBalance);
                    updateBalanceInMenu(newBalance);
                    recordTransaction("Deposit", amount);
                    JOptionPane.showMessageDialog(this, "Deposit successful!\nNew balance: " + newBalance);
                    goBackToMenu();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid deposit amount.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a deposit amount.");
        }
    }

    private void updateBalanceInMenu(int newBalance) {
        menu.updateBalance(newBalance);
    }

    private void recordTransaction(String transactionType, int amount) {
        DatabaseManager.insertTransaction(userId, transactionType, amount);
    }

    private void goBackToMenu() {
        menu.setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // For testing purposes
            Menu menu = new Menu(0, "Test User", 1000);
            new Deposit(0, "Test User", 1000,menu);
        });
    }
}
