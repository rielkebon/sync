import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZonedDateTime;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class fe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6097759814248867031L;
	private JPanel contentPane;
	private JTextField txtTest;
	LocalTime testtime = ZonedDateTime.now().toLocalTime(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fe frame = new fe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public fe() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnOk = new JButton("OK");
		
		contentPane.add(btnOk, BorderLayout.SOUTH);
		
		txtTest = new JTextField();
		txtTest.setText("Test");
		contentPane.add(txtTest, BorderLayout.NORTH);
		txtTest.setColumns(10);
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ZonedDateTime zdt = ZonedDateTime.now();
				LocalTime fdt = zdt.toLocalTime();
				LocalTime dt = zdt.toLocalTime().minusNanos(testtime.toNanoOfDay());
				txtTest.setText(dt.toString());
				testtime = fdt;
				
			}
		});
	}

}
