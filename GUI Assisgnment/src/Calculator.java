import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator implements ActionListener {
	
		JFrame jf;
		JPanel mainpanel;
		JPanel jp1;
		JTextField tf;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	//	int Result=0,operand1=0,operand2=0,temp=0,temp1=0;
		String operation="0",str="";
		Calculator()
		{
			Font font=new Font("SansSerif",Font.PLAIN,40);
			Font font1=new Font("SansSerif",Font.BOLD,40);
			jf=new JFrame("Calculator");
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(510,530);
			mainpanel=new JPanel(null);
			jp1=new JPanel(new GridLayout(4,4));
			jp1.setBounds(0, 100, 500, 400);
			tf=new JTextField("9+9");
			tf.setFont(font);
			tf.setHorizontalAlignment(tf.RIGHT);
			tf.setBounds(0, 0, 500, 100);
			b1=new JButton("1");
			b1.setFont(font1);
//			b1.addActionListener(this);
			b2=new JButton("2");
			b2.setFont(font1);
	//		b2.addActionListener(this);
			b3=new JButton("3");
			b3.setFont(font1);
		//	b3.addActionListener(this);
			b4=new JButton("+");
			b4.setFont(font1);
		//	b4.addActionListener(this);
			b5=new JButton("4");
			b5.setFont(font1);
		//	b5.addActionListener(this);
			b6=new JButton("5");
			b6.setFont(font1);
		//	b6.addActionListener(this);
			b7=new JButton("6");
			b7.setFont(font1);
		//	b7.addActionListener(this);
			b8=new JButton("-");
			b8.setFont(font1);
		//	b8.addActionListener(this);
			b9=new JButton("7");
			b9.setFont(font1);
		//	b9.addActionListener(this);
			b10=new JButton("8");
			b10.setFont(font1);
		//	b10.addActionListener(this);
			b11=new JButton("9");
			b11.setFont(font1);
		//	b11.addActionListener(this);
			b12=new JButton("x");
			b12.setFont(font1);
		//	b12.addActionListener(this);
			b13=new JButton("C");
			b13.setFont(font1);
		//	b13.addActionListener(this);
			b14=new JButton("0");
			b14.setFont(font1);
		//	b14.addActionListener(this);
			b15=new JButton("=");
			b15.setFont(font1);
		//	b15.addActionListener(this);
			b16=new JButton("/");
			b16.setFont(font1);
		//	b16.addActionListener(this);
			jp1.add(b1);
			jp1.add(b2);
			jp1.add(b3);
			jp1.add(b4);
			jp1.add(b5);
			jp1.add(b6);
			jp1.add(b7);
			jp1.add(b8);
			jp1.add(b9);
			jp1.add(b10);
			jp1.add(b11);
			jp1.add(b12);
			jp1.add(b13);
			jp1.add(b14);
			jp1.add(b15);
			jp1.add(b16);
			mainpanel.add(tf);
			mainpanel.add(jp1);
			jf.add(mainpanel);
			jf.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			/*if(e.getSource()==b1 || e.getSource()==b2 || e.getSource()==b3|| e.getSource()==b5|| e.getSource()==b6|| e.getSource()==b7|| e.getSource()==b9|| e.getSource()==b10|| e.getSource()==b11|| e.getSource()==b14 )
			{
				if(temp==0 && temp1==0)
				{
					operand1=Integer.parseInt(e.getActionCommand());
					temp=1;
					str=str+e.getActionCommand();
					tf.setText(str);
				}
				else if(temp==1 && temp1==0)
				{
					JOptionPane.showMessageDialog( null, "ERROR : Only Single Digits Allowed.");
				}
				else if(temp==0 && temp1==1)
				{
					JOptionPane.showInputDialog(null,"ERROR : Type operand first than operation.");
					tf.setText(str);
				}
				else if(temp==1 && temp1==1)
				{
					tf.setText(e.getActionCommand());
					operand2=Integer.parseInt(e.getActionCommand());
					str=str+e.getActionCommand();
					tf.setText(str);
					Result=Calculation(operand1,operand2,operation);
					str=Integer.toString(Result);
					operand1=Result;
					temp1=0;
				}
			}
			else if(e.getSource()==b13)
			{
				tf.setText(null);
				str="";
				temp=0;
				temp1=0;
				Result=0;
			}
			else if(e.getSource()==b4|| e.getSource()==b8|| e.getSource()==b12|| e.getSource()==b16)
			{
				if(temp==0&&temp1==0)
				{
					JOptionPane.showInputDialog("ERROR : Type operand first than operation.");
				}
				else if(temp==1&&temp1==0)
				{
					str=str+e.getActionCommand();
					operation=e.getActionCommand();
					temp1=1;
					tf.setText(str);
				}
				
			}
			else if(e.getSource()==b15)
			{
				tf.setText(Integer.toString(Result));
				str=Integer.toString(Result);
				temp=1;
				temp1=0;
			}
			
		}
		public int Calculation(int Operand1,int Operand2,String Operation)
		{
			try
			{
				if(Operation.equals("+"))
				{
					return(Operand1 + Operand2);
				}
				else if(Operation.equals("-"))
				{
					return(Operand1 - Operand2);
				}
				else if(Operation.equals("x"))
				{
					return(Operand1 * Operand2);
				}
				else if(Operation.equals("/"))
				{
					return(Operand1 / Operand2);
				}
				
			}
			catch(ArithmeticException e)
			{
				JOptionPane.showMessageDialog(null, "Error: Division By Zero.");
			}
			return 0;*/
		}
		public static void main(String args[])
		{
			new Calculator();
		}

	}
