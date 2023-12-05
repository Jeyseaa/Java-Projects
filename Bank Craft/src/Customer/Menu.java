package Customer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {

    JButton exit, withdraw, transfer, change, deposit, balance, history;

    String userName;
    int user_id;
    int current_balance;

    Menu(int user_id, String userName, int current_balance) {
        this.user_id = user_id;
        this.userName = userName;
        this.current_balance = current_balance;

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

        withdraw = new JButton("");
        withdraw.setBounds(808, 370, 72, 54);
        withdraw.setBackground(Color.black);
        withdraw.setForeground(Color.white);
        withdraw.addActionListener(this);
        withdraw.setOpaque(false);
        withdraw.setContentAreaFilled(false);
        withdraw.setBorderPainted(false);
        add(withdraw);

        JLabel labelName3 = new JLabel("WITHDRAW");
        labelName3.setFont(new Font("Railway", Font.PLAIN, 40));
        labelName3.setForeground(Color.BLACK);
        labelName3.setBounds(580, 370, 400, 60);
        add(labelName3);

        transfer = new JButton("");
        transfer.setBounds(808, 300, 72, 54);
        transfer.setBackground(Color.black);
        transfer.setForeground(Color.white);
        transfer.addActionListener(this);
        transfer.setOpaque(false);
        transfer.setContentAreaFilled(false);
        transfer.setBorderPainted(false);
        add(transfer);

        JLabel labelName4 = new JLabel("TRANSFER");
        labelName4.setFont(new Font("Railway", Font.PLAIN, 40));
        labelName4.setForeground(Color.BLACK);
        labelName4.setBounds(590, 300, 400, 60);
        add(labelName4);

        change = new JButton("");
        change.setBounds(808, 235, 72, 54);
        change.setBackground(Color.black);
        change.setForeground(Color.white);
        change.addActionListener(this);
        change.setOpaque(false);
        change.setContentAreaFilled(false);
        change.setBorderPainted(false);
        add(change);

        JLabel labelName5 = new JLabel("ACCOUNT");
        labelName5.setFont(new Font("Railway", Font.PLAIN, 40));
        labelName5.setForeground(Color.BLACK);
        labelName5.setBounds(600, 235, 400, 60);
        add(labelName5);

        deposit = new JButton("");
        deposit.setBounds(198, 370, 72, 54);
        deposit.setBackground(Color.black);
        deposit.setForeground(Color.white);
        deposit.addActionListener(this);
        deposit.setOpaque(false);
        deposit.setContentAreaFilled(false);
        deposit.setBorderPainted(false);
        add(deposit);

        JLabel labelName6 = new JLabel("DEPOSIT");
        labelName6.setFont(new Font("Railway", Font.PLAIN, 40));
        labelName6.setForeground(Color.BLACK);
        labelName6.setBounds(275, 370, 400, 60);
        add(labelName6);

        balance = new JButton("");
        balance.setBounds(198, 300, 72, 54);
        balance.setBackground(Color.black);
        balance.setForeground(Color.white);
        balance.addActionListener(this);
        balance.setOpaque(false);
        balance.setContentAreaFilled(false);
        balance.setBorderPainted(false);
        add(balance);

        JLabel labelName = new JLabel("BALANCE");
        labelName.setFont(new Font("Railway", Font.PLAIN, 40));
        labelName.setForeground(Color.BLACK);
        labelName.setBounds(273, 300, 400, 60);
        add(labelName);

        history = new JButton("");
        history.setBounds(198, 235, 72, 54);
        history.setBackground(Color.black);
        history.setForeground(Color.white);
        history.addActionListener(this);
        history.setOpaque(false);
        history.setContentAreaFilled(false);
        history.setBorderPainted(false);
        add(history);

        JLabel labelName1 = new JLabel("HISTORY");
        labelName1.setFont(new Font("Railway", Font.PLAIN, 40));
        labelName1.setForeground(Color.BLACK);
        labelName1.setBounds(273, 235, 400, 60);
        add(labelName1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/newbg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1400, 700);
        add(l3);

        setSize(1550, 1080);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public void updateBalance(int newBalance) {
        current_balance = newBalance;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            this.dispose();
        } else if (e.getSource() == balance) {
            new Balance(user_id, userName, current_balance, this);
            this.dispose();
        } else if (e.getSource() == deposit) {
            new Deposit(user_id, userName, current_balance, this);
            this.dispose();
        } else if (e.getSource() == withdraw) {
            new Withraw(user_id, userName, current_balance, this);
            this.dispose();

        } else if (e.getSource() == transfer) {
            new Transfer(user_id, userName, current_balance, this);
            this.dispose();
        } else if (e.getSource() == history) {
            new History(0, "", this);
            this.dispose();
        } else if (e.getSource() == change) {
            new PinChange(user_id, userName, this);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Menu(0, "", 0);
        });
    }

}
