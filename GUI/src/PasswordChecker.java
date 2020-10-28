import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PasswordChecker {

	//Initialize Variables
	private JFrame frame;
	private JTextField uNameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordChecker window = new PasswordChecker();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PasswordChecker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Create the new Frame window
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Create the "Login" Button
		JButton btnLogin = new JButton("Login");
		//When the button is clicked check if username and password are correct
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = uNameTextField.getText();
				String password = passwordField.getText();
				
				if(username.equals("Admin") && password.equals("password123")) {
					
					System.out.println("SUCCESS >> You are now logged in!");
					
				} else {
					
					System.out.println("ERROR >> Incorrect Password!");
					
				}
				
			}
		});
		btnLogin.setBounds(159, 194, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		//Create username label
		JLabel lbluName = new JLabel("Username:");
		lbluName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbluName.setForeground(Color.WHITE);
		lbluName.setBounds(69, 77, 71, 14);
		frame.getContentPane().add(lbluName);
		
		//Create username textfield
		uNameTextField = new JTextField();
		uNameTextField.setBounds(165, 74, 121, 20);
		frame.getContentPane().add(uNameTextField);
		uNameTextField.setColumns(10);
		
		//Create password label
		JLabel lblPW = new JLabel("Password:");
		lblPW.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPW.setForeground(Color.WHITE);
		lblPW.setBounds(69, 141, 71, 14);
		frame.getContentPane().add(lblPW);
		
		//Create password textfield
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 138, 121, 20);
		frame.getContentPane().add(passwordField);
		
		//Create background img label
		JLabel lblImg = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("2.jpg")).getImage();
		lblImg.setIcon(new ImageIcon(img));
		lblImg.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblImg);
	}
}
