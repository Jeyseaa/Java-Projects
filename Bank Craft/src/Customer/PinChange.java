package Customer;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    private JTextField textuserName, textuserID,textnewPin,textconfirmPin;
    private String userName;
    private int user_id;

    private JButton exit, back , n1, n2, n3, n4, n5, n6, n7, n8, n9, n,enter,delete;
    private Menu menu;

    private static final Font FONT_PLAIN_15 = new Font("Raleway", Font.PLAIN, 15);
    private static final Font FONT_BOLD_40 = new Font("Railway", Font.BOLD, 40);
    private static final Color BUTTON_BACKGROUND = Color.black;
    private static final Color BUTTON_FOREGROUND = Color.white;

    public PinChange(int user_id, String userName, Menu menu) {
        this.user_id = user_id;
        this.userName = userName;

        this.menu = menu;

        createUI();
        setupDocumentFilters();
        initializeFrame();
    }

    private void createUI() {
        JLabel labelName11 = new JLabel("User ID: ");
        labelName11.setFont(FONT_PLAIN_15);
        labelName11.setBounds(360, 220, 400, 30);
        add(labelName11);

        textuserID = new JTextField(String.valueOf(user_id));
        textuserID.setFont(new Font("Raleway", Font.PLAIN, 14));
        textuserID.setBounds(420, 220, 200, 30);
        textuserID.setEditable(false);
        add(textuserID);

        JLabel labelName12 = new JLabel("Name: ");
        labelName12.setFont(FONT_PLAIN_15);
        labelName12.setBounds(360, 270, 400, 30);
        add(labelName12);

        textuserName = new JTextField(String.valueOf(userName));
        textuserName.setFont(new Font("Raleway", Font.PLAIN, 14));
        textuserName.setBounds(420, 270, 200, 30);
        textuserName.setEditable(false);
        add(textuserName);



        JLabel labelName14 = new JLabel("New Pin: ");
        labelName14.setFont(FONT_PLAIN_15);
        labelName14.setBounds(360, 360, 400, 30);
        add(labelName14);

        textnewPin = new JTextField();
        textnewPin.setFont(new Font("Raleway", Font.PLAIN, 14));
        textnewPin.setBounds(420, 360, 200, 30);

        add(textnewPin);

        JLabel labelName15 = new JLabel("Confirm Pin: ");
        labelName15.setFont(FONT_PLAIN_15);
        labelName15.setBounds(330, 410, 400, 30);
        add(labelName15);

        textconfirmPin = new JTextField();
        textconfirmPin.setFont(new Font("Raleway", Font.PLAIN, 14));
        textconfirmPin.setBounds(420, 410, 200, 30);

        add(textconfirmPin);



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

        enter = new JButton("");
        enter.setBounds(580, 650, 80, 35);
        enter.setBackground(Color.black);
        enter.setForeground(Color.white);
        enter.addActionListener(this);
        enter.setOpaque(false);
        enter.setContentAreaFilled(false);
        enter.setBorderPainted(false);
        add(enter);


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

        delete = new JButton("");
        delete.setBounds(590, 583, 71, 25);
        delete.setBackground(Color.black);
        delete.setForeground(Color.white);
        delete.addActionListener(this);
        delete.setOpaque(false);
        delete.setContentAreaFilled(false);
        delete.setBorderPainted(false);
        add(delete);

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

    private void setupDocumentFilters() {

        ((AbstractDocument) textnewPin.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                    throws BadLocationException {
                if (isNumeric(string) && (fb.getDocument().getLength() + string.length() <= 4)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                if (isNumeric(text) && (fb.getDocument().getLength() + text.length() - length <= 4)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean isNumeric(String s) {
                return s.matches("\\d*");
            }
        });


        ((AbstractDocument) textconfirmPin.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
                    throws BadLocationException {
                if (isNumeric(string) && (fb.getDocument().getLength() + string.length() <= 4)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                if (isNumeric(text) && (fb.getDocument().getLength() + text.length() - length <= 4)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean isNumeric(String s) {
                return s.matches("\\d*");
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            this.dispose();
        } else if (e.getSource() == back) {
            goBackToMenu();
            this.dispose();
        } else if (e.getSource() == n1) {
            textnewPin.setText(textnewPin.getText() + "1");
        } else if (e.getSource() == n2) {
            textnewPin.setText(textnewPin.getText() + "2");
        } else if (e.getSource() == n3) {
            textnewPin.setText(textnewPin.getText() + "3");
        } else if (e.getSource() == n4) {
            textnewPin.setText(textnewPin.getText() + "4");
        } else if (e.getSource() == n5) {
            textnewPin.setText(textnewPin.getText() + "5");
        } else if (e.getSource() == n6) {
            textnewPin.setText(textnewPin.getText() + "6");
        } else if (e.getSource() == n7) {
            textnewPin.setText(textnewPin.getText() + "7");
        } else if (e.getSource() == n8) {
            textnewPin.setText(textnewPin.getText() + "8");
        } else if (e.getSource() == n9) {
            textnewPin.setText(textnewPin.getText() + "9");
        } else if (e.getSource() == n) {
            textnewPin.setText(textnewPin.getText() + "0");
        } else if (e.getSource() == delete) {
            char[] currentText = textnewPin.getText().toCharArray();
            if (currentText.length > 0) {
                textnewPin.setText(new String(currentText, 0, currentText.length - 1));
            }
        } else if (e.getSource() == enter) {

            String newPin = textnewPin.getText();
            String confirmPin = textconfirmPin.getText();

            if (newPin.equals(confirmPin)) {

                updatePinInDatabase(user_id, newPin);


                JOptionPane.showMessageDialog(this, "PIN Successfully Changed");


                new Login();
                this.dispose();
            } else {

                JOptionPane.showMessageDialog(this, "PINs Don't Match", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void updatePinInDatabase(int user_id, String newPin) {
        try {
            Customer.DatabaseManager.updatePin(user_id, Integer.parseInt(newPin));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
        private void goBackToMenu() {
            menu.setVisible(true);
            this.dispose();
        }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu menu = new Menu(0, "Test User", 0);
            new PinChange(0, "Test User", menu);
        });
    }
}