package Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JTextField;

public class SimpleCalculator extends JFrame implements ActionListener {


		// TODO Auto-generated method stub
		private JButton bt1, bt2, bt3, bt4;
		private JTextField tf1, tf2, tf3, tf4;
		private double result;
		private Container cont;
		private JPanel panel1, panel2;
		
	public SimpleCalculator(String s) {
		super(s);
		cont = this. getContentPane();
		
		JLabel num1lb = new JLabel("Num1: ");
		tf1 = new JTextField();
		JLabel num2lb = new JLabel("Num2: ");
		tf2 = new JTextField();
		JLabel num3lb = new JLabel("Num3: ");
		tf3 = new JTextField();
		
		tf3.setEditable(false);
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3,2));
		
		panel1.add(num1lb);
		panel1.add(tf1);
		panel1.add(num2lb);
		panel1.add(tf2);
		panel1.add(resultlb)
		panel1.add(tf3);
		
		bt1 = new JButton("+");
		bt2 = new JButton("-");
		bt3 = new JButton("*");
		bt4 = new JButton("/");
		
		panel2 = new JPanel();
		panel2.add(bt1);
		panel2.add(bt2);
		panel2.add(bt3);
		panel2.add(bt4);
		cont.add(panel1);
		
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		
		this.pack();
		this.setVisible(true);
		
		
		 
	}


		
		
	}


