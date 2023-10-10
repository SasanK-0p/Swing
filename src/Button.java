import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Button extends JFrame {
    JButton button;

    Button() {
    	setUndecorated(true);
        //ImageIcon exi = new ImageIcon("C:\\JAVA\\Java Program\\Big Project\\Swing\\src\\exit (close).jpeg");

        ImageIcon icon = new ImageIcon("C:\\JAVA\\Java Program\\Big Project\\Swing\\src\\Blue (Icon).jpg");
        ImageIcon VScode = new ImageIcon("C:\\JAVA\\Java Program\\Big Project\\Swing\\src\\Vs code (Icon).png");
        ImageIcon Int = new ImageIcon("C:\\JAVA\\Java Program\\Big Project\\Swing\\src\\IntelliJ (Icon).png");
        ImageIcon eclipse = new ImageIcon("C:\\JAVA\\Java Program\\Big Project\\Swing\\src\\download (Icon).jpeg");
        this.button = new JButton();
        button.setRequestFocusEnabled(false);
        this.button.setContentAreaFilled(false);
        this.button.setBounds(30, 15, 100, 100);
        this.button.setIcon(icon);
        this.button.setFocusable(false);
        this.button.setHorizontalTextPosition(0);
        this.button.setVerticalTextPosition(3);
        this.button.setFont(new Font("Comic Sans",1, 25));
        this.button.setIconTextGap(-11);
        this.button.setForeground(Color.BLACK);
        this.button.setBackground(new Color(255, 255, 255));
        this.button.setBorder(BorderFactory.createEmptyBorder());
        String[] s = {"C:\\Program Files\\BlueJ\\BlueJ.exe"};
        Runtime runTime = Runtime.getRuntime();
        this.button.addActionListener(e -> {
            try {
                runTime.exec(s);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            this.button.setEnabled(true);
            runTime.exit(1);
        });
        JButton button1 = new JButton();
        button1.setContentAreaFilled(false);
        button1.setBounds(260, 15, 100, 100);
        button1.setIcon(VScode);
        button1.setFocusable(false);
        button1.setHorizontalTextPosition(0);
        button1.setVerticalTextPosition(3);
        button1.setFont(new Font("Comic Sans", 1, 25));
        button1.setIconTextGap(-11);
        button1.setForeground(Color.BLACK);
        button1.setBackground(new Color(255, 255, 255));
        button1.setBorder(BorderFactory.createEmptyBorder());
        String[] a = { "C:\\Users\\Sasank\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe" };
        Runtime runner = Runtime.getRuntime();
        button1.addActionListener(e -> {
            try {
                runner.exec(a);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            runner.exit(1);
        });
        JButton button2 = new JButton();
        button2.setContentAreaFilled(false);
        button2.setBounds(510, 15, 100, 100);
        button2.setIcon(Int);
        button2.setFocusable(false);
        button2.setHorizontalTextPosition(0);
        button2.setVerticalTextPosition(3);
        button2.setFont(new Font("Comic Sans", 1, 25));
        button2.setForeground(Color.BLACK);
        button2.setBackground(new Color(255, 255, 255));
        button2.setBorder(BorderFactory.createEmptyBorder());
        String[] b = { "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2022.2.3\\bin\\idea64.exe" };
        Runtime runn = Runtime.getRuntime();
        button2.addActionListener(e -> {

            try {
                runn.exec(b);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            runn.exit(1);
        });
        JButton button3 = new JButton();
        button3.setContentAreaFilled(false);
        button3.setBounds(766, 18, 100, 100);
        button3.setIcon(eclipse);
        button3.setFocusable(false);
        button3.setHorizontalTextPosition(0);
        button3.setVerticalTextPosition(3);
        button3.setFont(new Font("Comic Sans", 1, 25));
        button3.setIconTextGap(-11);
        button3.setForeground(Color.BLACK);
        button3.setBackground(new Color(255, 255, 255));
        button3.setBorder(BorderFactory.createEmptyBorder());
        String[] c = { "C:\\Program Files\\eclipse\\eclipse.exe" };
        Runtime ec = Runtime.getRuntime();
        button3.addActionListener(e-> {
            try {
                ec.exec(c);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            ec.exit(1);
        });
        JButton exit = new JButton();
        exit.setContentAreaFilled(false);
        exit.setBounds(859, -10, 56, 26);
//        exit.setIcon(exi);
//        exit.setBackground(Color.PINK);
           exit.setText("close");
        exit.setFocusable(false);
        exit.setHorizontalTextPosition(0);
        exit.setVerticalTextPosition(3);
        exit.setFont(new Font("Calibra", 1, 11));
        exit.setIconTextGap(-11);
//        exit.setIcon(exi);
        exit.setForeground(Color.BLACK);
        exit.setBackground(new Color(255, 255, 255));
        exit.setBorder(BorderFactory.createEtchedBorder());
        Runtime close = Runtime.getRuntime();
        exit.addActionListener(e ->{

            close.exit(1);
                }
                );




        setDefaultCloseOperation(3);
        getContentPane().setLayout((LayoutManager)null);
         this.setBounds(180, 218, 914, 142);
        setVisible(true);
        setTitle("Program Opener");
        setVisible(true);
        setResizable(true);
        setAlwaysOnTop(true);
        ImageIcon image = new ImageIcon("C:\\JAVA\\Java Program\\Big Project\\Swing\\src\\Jupiter.png");
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(255, 255, 255));
        setResizable(false);
        getContentPane().add(this.button, BorderLayout.WEST);
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        this.add(exit);
    }
}
