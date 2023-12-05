package Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Insert extends JFrame implements ActionListener, MouseListener, MouseMotionListener {
    JButton b1;
    JLabel image;
   String userName;
   int user_id;
 int current_balance;

    Insert(int user_id, String userName,int current_balance) {
        this.user_id = user_id;
        this.userName = userName;
        this.current_balance = current_balance;

        JLabel labelName11 = new JLabel("Bank ID: " + user_id + "*****");
        labelName11.setFont(new Font("RAILWAY", Font.PLAIN, 15));
        labelName11.setBounds(460, 300, 400, 30);
        add(labelName11);

        JLabel labelName12 = new JLabel("Name: " + userName);
        labelName12.setFont(new Font("RAILWAY", Font.PLAIN, 15));
        labelName12.setBounds(460, 360, 400, 30);
        add(labelName12);

        ImageIcon i8 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image i9 = i8.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i10 = new ImageIcon(i9);
        image = new JLabel(i10);
        image.setBounds(200, 580, 100, 100);
        image.addMouseListener(this);
        image.addMouseMotionListener(this);
        image.setOpaque(false);
        image.setBackground(new Color(0, 0, 0, 0));
        image.setBorder(BorderFactory.createEmptyBorder());
        add(image);

        ImageIcon buttonIcon = new ImageIcon(ClassLoader.getSystemResource("icon/insertcard.jpg"));
        b1 = new JButton(buttonIcon);
        b1.setText(null);
        b1.setBackground(Color.lightGray);
        b1.setForeground(Color.black);
        b1.setBounds(940, 548, 380, 120);
        b1.addActionListener(this);
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        add(b1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/finger5.png"));
        Image i5 = i4.getImage().getScaledInstance(495, 275, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l6 = new JLabel(i6);
        l6.setBounds(290, 230, 495, 270);
        add(l6);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/newbg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1400, 700);
        add(l3);


        getContentPane().setBackground(new Color(135, 206, 250));
        setLayout(null);
        setSize(1550, 1080);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            Rectangle buttonBounds = b1.getBounds();
            Rectangle imageBounds = image.getBounds();

            if (buttonBounds.intersects(imageBounds)) {
                new Menu(user_id,userName,current_balance);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Please Insert Your Card", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        image.setLocation(e.getXOnScreen() - this.getX() - image.getWidth() / 2, e.getYOnScreen() - this.getY() - image.getHeight() / 2);
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    public static void main(String[] args) {
        new Insert(0,"",0);

    }
    
}