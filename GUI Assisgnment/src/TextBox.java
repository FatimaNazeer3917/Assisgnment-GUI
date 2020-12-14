import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class TextBox {
	JFrame jf;
	JPanel jp;
	JLabel jl;
	JLabel jl1;
	JLabel jl2;
	JLabel jl3;
	JLabel jl4;
	JTextField tf;
	JTextField tf1;
	JTextArea area;
	TextBox()
	{
		jf=new JFrame("TextBox Types");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500,300);
		jp=new JPanel(null);
		jl=new JLabel("     A multiline textbox ");
		jl.setBounds(0, 0, 140, 25);
		jl2=new JLabel("    that tabs and");
		jl2.setBounds(0, 25, 140, 25);
		jl3=new JLabel("    return keystrokes.");
		jl3.setBounds(0, 50, 140, 25);
		JButton b1=new JButton("Get Text");
		b1.setBounds(10, 75, 100, 40);
		jl1=new JLabel("Caps only!!");
		jl1.setFont(new Font("Georgia",Font.BOLD,14));
		jl1.setBounds(10, 120, 100, 100);
		tf=new JTextField();
		tf.setBounds(10, 190, 130, 30);
		area=new JTextArea("Type some stuff here(and hit the return and tab keys....)");
		area.setBounds(150,10, 320, 130);
		JScrollPane scroll=new JScrollPane(area);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(150, 10, 320, 130);
		jl4=new JLabel("Password Box");
		jl4.setFont(new Font("Georgia",Font.BOLD,14));
		jl4.setBounds(150, 120, 100, 100);
		JButton b2=new JButton("Decode Password");
		b2.setBounds(270, 150, 200, 30);
		tf1=new JTextField("$$$$$$$$$$$$$$$$$$$$$$$$");
		tf1.setBounds(150, 190, 320, 30);
		jp.add(jl);
		jp.add(jl2);
		jp.add(jl3);
		jp.add(b1);
		jp.add(jl1);
		jp.add(tf);
		jp.add(scroll);
		jp.add(jl4);
		jp.add(b2);
		jp.add(tf1);
		jf.add(jp);
		jf.setVisible(true);
	}
	public static void main(String args[])
	{
		new TextBox();
	}
}
