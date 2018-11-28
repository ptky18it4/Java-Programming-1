package Display;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class GiaiThua  extends JFrame{
  JLabel lblSoN;
  JTextField tfSoN;
  JLabel lblKQ;
  JTextField tfKQ;
  JButton btnGt;
  JButton btnPS;
  public GiaiThua(){
	  lblSoN=new JLabel("SoN");
	  tfSoN=new JTextField(10);
	  lblKQ=new JLabel("Ket Qua");
	  tfKQ = new JTextField(10);
      btnGt= new JButton("Tinh giai thua");
      btnPS= new JButton("Tinh phan so");
      btnGt.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		 String so=tfSoN.getText();
             int n=Integer.parseInt(so);
             int gt=1;
             for(int i=1;i<n;i++)
            	 gt=gt*i;
             tfKQ.setText(String.valueOf(gt));
    	  }
      });
      btnPS.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		 String so=tfSoN.getText();
             int n=Integer.parseInt(so);
             int ps=0;
             for(int i=2;i<n;i++)
            	 ps=ps+1/i;
             tfKQ.setText(String.valueOf(ps));
    	  }
      });
  Container cont=this.getContentPane();
  
  setSize(500,400);
  setLayout(new FlowLayout());
  cont.add(lblSoN);
  cont.add(tfSoN);
 cont.add(lblKQ);
 cont.add(tfKQ);
 cont.add(btnGt);
 cont.add(btnPS);
 setVisible(true);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
new GiaiThua();

	
	}
}