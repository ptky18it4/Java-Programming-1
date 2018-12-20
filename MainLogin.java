package ptky18it4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.PasswordView;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainLogin extends JFrame {

	private JPanel contentPane;
	private JTextField text_IDStudent;
	private JTextField text_Username;
	private JPasswordField text_Password;
	// private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin frame = new MainLogin();
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
	public MainLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 259);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTieude = new JLabel("Students Information");
		lblTieude.setBounds(117, 11, 235, 26);
		lblTieude.setBackground(Color.DARK_GRAY);
		lblTieude.setForeground(new Color(0, 51, 204));
		lblTieude.setFont(new Font("Arrus-Black", Font.BOLD, 17));
		contentPane.add(lblTieude);

		JLabel lbl_IDStudent = new JLabel("ID Student :");
		lbl_IDStudent.setBounds(25, 65, 85, 27);
		lbl_IDStudent.setFont(new Font("Sitka Text", Font.BOLD, 14));
		contentPane.add(lbl_IDStudent);

		text_IDStudent = new JTextField();
		text_IDStudent.setBounds(120, 68, 248, 20);
		contentPane.add(text_IDStudent);
		text_IDStudent.setColumns(10);

		JButton btn_Login = new JButton("Login");
		btn_Login.setBounds(120, 167, 99, 23);
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn_Login == btn_Login) {
					String ID = text_IDStudent.getText().toString();
					String Username = text_Username.getText().toString();
					// String Password = text_Password.getPassword().toString(); /*Ma hoa mat khau*/
					char[] c = text_Password.getPassword(); /* hien thi mat khau */
					String Password = new String(c); /* hien thi mat khau */
					JOptionPane.showMessageDialog(null,
							"ID:     " + ID + "\nUsername : " + Username + "\nPassword : " + Password);

				}
			}
		});
		btn_Login.setBackground(new Color(224, 255, 255));
		btn_Login.setFont(new Font("Sitka Text", Font.BOLD, 13));
		contentPane.add(btn_Login);

		JButton btn_Taomoi = new JButton("Create new");
		btn_Taomoi.setBounds(248, 167, 120, 23);
		btn_Taomoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateSV obj = new CreateSV();
				obj.setVisible(true);
			}
		});
		btn_Taomoi.setBackground(new Color(224, 255, 255));
		btn_Taomoi.setFont(new Font("Sitka Small", Font.BOLD, 13));
		contentPane.add(btn_Taomoi);

		JLabel lbl_Username = new JLabel("Username  :");
		lbl_Username.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lbl_Username.setBounds(25, 99, 85, 20);
		contentPane.add(lbl_Username);

		text_Username = new JTextField();
		text_Username.setBounds(120, 99, 248, 20);
		contentPane.add(text_Username);
		text_Username.setColumns(10);

		JLabel lbl_Password = new JLabel("Password   :");
		lbl_Password.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lbl_Password.setBounds(25, 135, 85, 14);
		contentPane.add(lbl_Password);

		text_Password = new JPasswordField();
		text_Password.setBounds(120, 130, 248, 20);
		contentPane.add(text_Password);
		text_Password.setColumns(10);

	}
}
