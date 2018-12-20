package ptky18it4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.lang.management.MemoryNotificationInfo;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;

public class CreateSV extends JFrame {

	/**
	 * @return
	 * 
	 */
	// --
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_IDStudent;
	// private JTextField textField_Passwords; /*hien thi mat khau khi nhap*/
	private JPasswordField text_Username;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField text_Password;
	private JTextField text_Dateofbirth;
	private JTextField text_Address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		 * khong nen khai bao truc tiep trong "void main". vi doi khi "void main" no gap
		 * van de --> giao dien khong hien len duoc
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateSV frame = new CreateSV();
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
	public CreateSV() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* an nut x thi dong giao dien */
		setBounds(100, 100, 501, 420);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);/* contentPane : khung nội dung */
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// contentPane.setBackground(Color.lightGray); /*Tạo màu cho khung nội dung*/

		/** Create heading **/

		JLabel lbl_CRNSV = new JLabel("Create New Students"); /* CRNSV : viet tat cua : Create New Students */
		lbl_CRNSV.setForeground(Color.RED);
		lbl_CRNSV.setBackground(SystemColor.menu);
		lbl_CRNSV.setFont(new Font("Arrus-Black", Font.BOLD, 20));
		lbl_CRNSV.setBounds(120, 11, 273, 29);
		contentPane.add(lbl_CRNSV);

		/** Create ID Student **/
		JLabel lbl_ID = new JLabel("ID Student  :");
		lbl_ID.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lbl_ID.setBounds(45, 81, 116, 20);
		contentPane.add(lbl_ID);

		/** Create text_IDStudent **/
		text_IDStudent = new JTextField();
		text_IDStudent.setBounds(164, 81, 214, 20);
		contentPane.add(text_IDStudent);
		text_IDStudent.setColumns(10);

		/** Create lbl_Username **/
		JLabel lbl_Username = new JLabel("Username :");
		lbl_Username.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lbl_Username.setBounds(45, 112, 116, 17);
		contentPane.add(lbl_Username);

		/** Create text_IDStudent **/
		text_IDStudent = new JTextField();
		text_IDStudent.setBounds(164, 110, 214, 20);
		contentPane.add(text_IDStudent);
		text_IDStudent.setColumns(10);

		/** Create lbl_Password **/
		JLabel lbl_Password = new JLabel("Password : ");
		lbl_Password.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lbl_Password.setBounds(45, 140, 116, 20);
		contentPane.add(lbl_Password);

		/** Create text_Password **/
		text_Password = new JPasswordField();
		text_Password.setBounds(164, 140, 214, 20);
		contentPane.add(text_Password);
		text_Password.setColumns(10);

		/** Create lbl_Gender **/
		JLabel lbl_Gender = new JLabel("Gender :");
		lbl_Gender.setBounds(45, 171, 116, 19);
		lbl_Gender.setFont(new Font("Sitka Small", Font.BOLD, 15));
		contentPane.add(lbl_Gender);

		/** Create rdbtnRadioButton_Male **/
		JRadioButton rdbtnRadioButton_Male = new JRadioButton("Male");
		buttonGroup.add(rdbtnRadioButton_Male);
		rdbtnRadioButton_Male.setBounds(164, 167, 100, 23);
		rdbtnRadioButton_Male.setFont(new Font("Sitka Text", Font.BOLD, 14));
		contentPane.add(rdbtnRadioButton_Male);

		/** Create rdbtnRadioButton_Female **/
		JRadioButton rdbtn_Female = new JRadioButton("Female");
		buttonGroup.add(rdbtn_Female);
		rdbtn_Female.setBounds(269, 167, 109, 23);
		rdbtn_Female.setFont(new Font("Sitka Text", Font.BOLD, 14));
		contentPane.add(rdbtn_Female);

		/** Create lbl_Dateofbirth **/
		JLabel lbl_Dateofbirth = new JLabel("Date of birth :");
		lbl_Dateofbirth.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lbl_Dateofbirth.setBounds(45, 195, 116, 20);
		contentPane.add(lbl_Dateofbirth);

		/** Create text_Dateofbirth **/
		text_Dateofbirth = new JTextField();
		text_Dateofbirth.setBounds(164, 195, 214, 20);
		contentPane.add(text_Dateofbirth);
		text_Dateofbirth.setColumns(10);

		/** Create lbl_Add **/
		JLabel lbl_Add = new JLabel("Address :");
		lbl_Add.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lbl_Add.setBounds(45, 223, 116, 20);
		contentPane.add(lbl_Add);

		/** Create text_Address **/
		text_Address = new JTextField();
		text_Address.setBounds(164, 223, 214, 20);
		contentPane.add(text_Address);
		text_Address.setColumns(10);

		/** Create btnCreate **/
		JButton btn_Create = new JButton("Create");
		btn_Create.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn_Create.setBounds(164, 321, 89, 23);
		contentPane.add(btn_Create);
		btn_Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(btn_Create,
						" Make sure you enter the correct information of 'Student' before the press 'Create' !");
			}
		});
		
		JButton btn_Update = new JButton("Update ");
		btn_Update.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btn_Update.setBounds(264,321,89,23);
		contentPane.add(btn_Update);
		btn_Update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Create Event for button Update
				JOptionPane.showInputDialog("Update", "Input information");
				
			}
		});
	}
}
