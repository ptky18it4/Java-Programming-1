package DISPLAY;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator extends JFrame implements ActionListener {

	/* dung de bieu dien 4 nut cua 4 phep toan +,-,*,/ */ ;
	private JButton bt1, bt2, bt3, bt4;
	/* Dung de chua 2 so va mot ket qua */
	private JTextField tf1, tf2, tf3;
	/* Dung de luu tru ket qua tinh toan */
	private double result;
	/* Dung de nhan tang ContentPane cua Jframe */
	private Container cont;
	/* Dung de nhom cac thanh phan tren giao dien */
	private JPanel panel1, panel2;

	/* Ham khoi tao */
	public SimpleCalculator(String s) {
		super(s);
		/* Lay lop ContentPane dat cac doi tuong hien thi */
		cont = this.getContentPane();
		/* Tao cac thanh phan tren giao dien */
		JLabel num1lb = new JLabel("Num 1: ");
		tf1 = new JTextField();
		JLabel num2lb = new JLabel("Num 2: ");
		tf2 = new JTextField();
		JLabel resultlb = new JLabel("Result: ");
		tf3 = new JTextField();
		/* TextField chua ket qua khong cho phep sua du lieu */
		tf3.setEditable(false);
		/* Panel1 chuwa 3 Textfield */
		panel1 = new JPanel();
		/* Thiet lap layout gom 3 hang 2 cot */
		panel1.setLayout(new GridLayout(3, 2));
		/* Dat cac thanh phan vao panel1 */

		panel1.add(num1lb);
		panel1.add(tf1);
		panel1.add(num2lb);
		panel1.add(tf2);
		panel1.add(resultlb);
		panel1.add(tf3);
		/* Tao 4 nut bieu dien 4 phep toan */

		bt1 = new JButton("+");
		bt2 = new JButton("-");
		bt3 = new JButton("*");
		bt4 = new JButton("/");
		/* Panel2 chua 4 nut */
		panel2 = new JPanel();
		panel2.add(bt1);
		panel2.add(bt2);
		panel2.add(bt3);
		panel2.add(bt4);
		/* Dat panel1 vao vung Center cua ContenPane */
		cont.add(panel1);
		/* Dat panel2 vao vung South (Ben duoi cung) cua ContenPane */
		cont.add(panel2, "South");

		/* Gan ong nghe cho cac nut */
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		/* Thiet lap kich thuoc va hien thi */
		this.pack();
		this.setVisible(true);
	}
	/* Dinh nghia ham cong 2 so lay tu 2 textField */

	public void doPlus() {
		/*
		 * Gia tri lay tu Textfield o dang chuoi, do vay can phai chuyen sang so de co
		 * the cong
		 */
		result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
		/* Hien thi cac gia tri tinh duoc o Textfield ket qua */
		tf3.setText(String.valueOf(result));

	}

	/* Dinh nghia ham tru 2 so lay tu 2 textField */
	public void doMinus() {
		/*
		 * Gia tri lay tu Textfield o dang chuoi, do vay can phai chuyen sang so de co
		 * the tru
		 */
		result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
		/* Hien thi cac gia tri tinh duoc o Textfield ket qua */
		tf3.setText(String.valueOf(result));

	}

	/* Dinh nghia ham nhan 2 so lay tu 2 textField */
	public void doMult() {
		/*
		 * Gia tri lay tu Textfield o dang chuoi, do vay can phai chuyen sang so de co
		 * the nhan
		 */
		result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
		/* Hien thi cac gia tri tinh duoc o Textfield ket qua */
		tf3.setText(String.valueOf(result));

	}

	/* Dinh nghia ham chia 2 so lay tu 2 textField */
	public void doDiv() {
		/*
		 * Gia tri lay tu Textfield o dang chuoi, do vay can phai chuyen sang so de co
		 * the chia
		 */
		result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
		/* Hien thi cac gia tri tinh duoc o Textfield ket qua */
		tf3.setText(String.valueOf(result));
		
	}

	/*
	 * Dinh nghia lai ham actionPerformed cua interface ActionListener,xu ly khi
	 * nguoi dung an cac nut phep toan
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		/* Neu an nut + */
		if (e.getActionCommand() == "+") {
			doPlus();
		}
		/* Neu an nut - */
		if (e.getActionCommand() == "-") {
			doMinus();
		}
		/* Neu an nut **/
		if (e.getActionCommand() == "*") {
			doMult();
		}
		/* Neu an nut / */
		if (e.getActionCommand() == "/") {
			doDiv();
		}
	}

	public static void main(String args[]) {
		/* Tao giao dien chuong trinh */
		SimpleCalculator operator = new SimpleCalculator("SimpleCalculator");
	}

}
