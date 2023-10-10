import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.SimpleDateFormat;

public class Clo {
	Calendar calendar;
	SimpleDateFormat timeFormat;
	String time;
	JLabel timelabel = new JLabel();
	Clo() {


		JFrame frame = new JFrame();
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setFocusable(false);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(600, 0, 300, 30);//Change to 30;
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		timelabel = new JLabel();
		timelabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		timelabel.setForeground(Color.BLACK);
		timelabel.setOpaque(true);
		timelabel.setSize(300,30);
		timelabel.setBackground(new Color(42, 33, 57));

//		frame.setBackground(new Color(59, 33, 90));
		frame.add(timelabel);
		frame.setVisible(true);

		setTime();
	}

	public  void setTime() {
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timelabel.setText(time);
			timelabel.setHorizontalTextPosition(JLabel.CENTER);
			timelabel.setVerticalTextPosition(JLabel.CENTER);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}}}}

