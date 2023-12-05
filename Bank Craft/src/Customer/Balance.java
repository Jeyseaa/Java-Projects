package Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Balance extends JFrame implements ActionListener {
    private JTextField textuserName, textuserID, textcurrentBalance;
    private String userName;
    private int user_id;
    private int current_balance;
    private JButton exit, back;
    private Menu menu;

    private static final Font FONT_PLAIN_15 = new Font("Raleway", Font.PLAIN, 15);
    private static final Font FONT_BOLD_40 = new Font("Railway", Font.BOLD, 40);
    private static final Color BUTTON_BACKGROUND = Color.black;
    private static final Color BUTTON_FOREGROUND = Color.white;

    public Balance(int user_id, String userName, int current_balance, Menu menu) {
        this.user_id = user_id;
        this.userName = userName;
        this.current_balance = current_balance;
        this.menu = menu;

        createUI();
        initializeFrame();
        updateBalanceLabel();
    }

    private void createUI() {
        JLabel labelName11 = new JLabel("User ID: ");
        labelName11.setFont(FONT_PLAIN_15);
        labelName11.setBounds(460, 300, 400, 30);
        add(labelName11);

        textuserID = new JTextField(String.valueOf(user_id));
        textuserID.setFont(new Font("Raleway", Font.PLAIN, 14));
        textuserID.setBounds(520, 300, 200, 30);
        textuserID.setEditable(false);
        add(textuserID);

        JLabel labelName12 = new JLabel("Name: ");
        labelName12.setFont(FONT_PLAIN_15);
        labelName12.setBounds(460, 350, 400, 30);
        add(labelName12);

        textuserName = new JTextField(String.valueOf(userName));
        textuserName.setFont(new Font("Raleway", Font.PLAIN, 14));
        textuserName.setBounds(520, 350, 200, 30);
        textuserName.setEditable(false);
        add(textuserName);

        JLabel labelName13 = new JLabel("Current Balance: ");
        labelName13.setFont(FONT_PLAIN_15);
        labelName13.setBounds(460, 390, 400, 30);
        add(labelName13);

        textcurrentBalance = new JTextField(String.valueOf(current_balance));
        textcurrentBalance.setFont(new Font("Raleway", Font.PLAIN, 14));
        textcurrentBalance.setBounds(570, 390, 200, 30);
        textcurrentBalance.setEditable(false);
        add(textcurrentBalance);

        exit = new JButton("");
        exit.setBounds(808, 438, 72, 54);
        exit.setBackground(BUTTON_BACKGROUND);
        exit.setForeground(BUTTON_FOREGROUND);
        exit.addActionListener(this);
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        add(exit);

        JLabel labelName2 = new JLabel("LOGOUT");
        labelName2.setFont(FONT_BOLD_40);
        labelName2.setForeground(Color.BLACK);
        labelName2.setBounds(636, 438, 400, 60);
        add(labelName2);

        back = new JButton("");
        back.setBounds(198, 435, 72, 54);
        back.setBackground(BUTTON_BACKGROUND);
        back.setForeground(BUTTON_FOREGROUND);
        back.addActionListener(this);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        add(back);

        JLabel labelName6 = new JLabel("BACK");
        labelName6.setFont(FONT_BOLD_40);
        labelName6.setForeground(Color.BLACK);
        labelName6.setBounds(275, 435, 400, 60);
        add(labelName6);

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

    private void updateBalanceLabel() {
        int updatedBalance = DatabaseManager.getBalance(user_id);
        textcurrentBalance.setText(String.valueOf(updatedBalance));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            this.dispose();
        } else if (e.getSource() == back) {
            menu.setVisible(true);
            this.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            Menu menu = new Menu(0, "Test User", 0);
            new Balance(0, "Test User", 0, menu);
        });
    }
}
