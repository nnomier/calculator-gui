import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {
    MyCalculator calc=new MyCalculator();
	private JFrame frame;
	private JTextField txtHi;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		 String name = JOptionPane.showInputDialog("Please enter your  name");
	       if(name==null)name="";
	       JOptionPane.showMessageDialog(null, "Hello, " + name +  ", " + "Welcome to Your Calculator");

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}
    
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 422, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtHi = new JTextField();
		txtHi.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtHi.setBounds(24, 11, 370, 68);
		frame.getContentPane().add(txtHi);
		txtHi.setColumns(10);
		txtHi.setEditable(false);
		JPanel panel = new JPanel();
	    panel.setBackground(Color.BLUE);
	    panel.setMinimumSize(new Dimension(200,200));
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText()+ button7.getText();
				txtHi.setText(Number);
			}
		});
		button7.setForeground(Color.WHITE);
		button7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button7.setBackground(Color.DARK_GRAY);
		button7.setBounds(24, 223, 76, 54);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button8.getText();
				txtHi.setText(Number);
			}
		});
		button8.setForeground(Color.WHITE);
		button8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button8.setBackground(Color.DARK_GRAY);
		button8.setBounds(109, 223, 76, 54);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button9.getText();
				txtHi.setText(Number);
			}
		});
		button9.setForeground(Color.WHITE);
		button9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button9.setBackground(Color.DARK_GRAY);
		button9.setBounds(195, 223, 76, 54);
		frame.getContentPane().add(button9);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button4.getText();
				txtHi.setText(Number);
			}
		});
		button4.setForeground(Color.WHITE);
		button4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button4.setBackground(Color.DARK_GRAY);
		button4.setBounds(24, 288, 76, 54);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button5.getText();
				txtHi.setText(Number);
			}
		});
		button5.setForeground(Color.WHITE);
		button5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button5.setBackground(Color.DARK_GRAY);
		button5.setBounds(109, 288, 76, 54);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button6.getText();
				txtHi.setText(Number);
			}
		});
		button6.setForeground(Color.WHITE);
		button6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button6.setBackground(Color.DARK_GRAY);
		button6.setBounds(195, 288, 76, 54);
		frame.getContentPane().add(button6);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button1.getText();
				txtHi.setText(Number);
			}
		});
		button1.setForeground(Color.WHITE);
		button1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button1.setBackground(Color.DARK_GRAY);
		button1.setBounds(24, 353, 76, 54);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button2.getText();
				txtHi.setText(Number);
			}
		});
		button2.setForeground(Color.WHITE);
		button2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button2.setBackground(Color.DARK_GRAY);
		button2.setBounds(109, 353, 76, 54);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button3.getText();
				txtHi.setText(Number);
			}
		});
		button3.setForeground(Color.WHITE);
		button3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button3.setBackground(Color.DARK_GRAY);
		button3.setBounds(195, 353, 76, 54);
		frame.getContentPane().add(button3);
		
		JButton divisonbtn = new JButton("/");
		divisonbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + divisonbtn.getText();
				txtHi.setText(Number);
			//	calc.operation=calc.setOperation(divisonbtn.getText());
			}
		});
		divisonbtn.setForeground(Color.WHITE);
		divisonbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		divisonbtn.setBackground(new Color(0, 51, 255));
		divisonbtn.setBounds(318, 223, 76, 54);
		frame.getContentPane().add(divisonbtn);
		
		JButton multiplybtn = new JButton("x");
		multiplybtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + multiplybtn.getText();
				txtHi.setText(Number);
			//	calc.operation=calc.setOperation(multiplybtn.getText());
			}
		});
		multiplybtn.setForeground(Color.WHITE);
		multiplybtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		multiplybtn.setBackground(new Color(0, 51, 255));
		multiplybtn.setBounds(318, 288, 76, 54);
		frame.getContentPane().add(multiplybtn);
		
		JButton minusbtn = new JButton("-");
		minusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + minusbtn.getText();
				txtHi.setText(Number);
			//	calc.operation=calc.setOperation(minusbtn.getText());
			}
		});
		minusbtn.setForeground(Color.WHITE);
		minusbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		minusbtn.setBackground(new Color(0, 51, 255));
		minusbtn.setBounds(318, 353, 76, 54);
		frame.getContentPane().add(minusbtn);
		
		JButton equalbtn = new JButton("=");
		equalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(txtHi.getText().isEmpty())
						JOptionPane.showMessageDialog(frame, "Please enter operation");
				 else {
				String result=calc.Result(txtHi.getText());
				if (result==null)
				{
					JOptionPane.showMessageDialog(frame, "INVALID INPUT");
				}
			
				else 
				{
				calc.saveInArray(txtHi.getText());
				txtHi.setText(result);
					
				}
				 }
			}
		});
		equalbtn.setForeground(Color.WHITE);
		equalbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		equalbtn.setBackground(new Color(255, 204, 51));
		equalbtn.setBounds(318, 418, 76, 54);
		frame.getContentPane().add(equalbtn);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + button0.getText();
				txtHi.setText(Number);
			}
		});
		button0.setForeground(Color.WHITE);
		button0.setFont(new Font("Tahoma", Font.BOLD, 20));
		button0.setBackground(Color.DARK_GRAY);
		button0.setBounds(24, 418, 76, 54);
		frame.getContentPane().add(button0);
		
		JButton pointbutton = new JButton(".");
		pointbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=txtHi.getText() + pointbutton.getText();
				txtHi.setText(Number);
			}
		});
		pointbutton.setForeground(Color.WHITE);
		pointbutton.setFont(new Font("Tahoma", Font.BOLD, 20));
		pointbutton.setBackground(Color.DARK_GRAY);
		pointbutton.setBounds(109, 418, 76, 54);
		frame.getContentPane().add(pointbutton);
		
		JButton Previous = new JButton("previous");
		Previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   String PreviousOperation=calc.previous();
				   if(PreviousOperation==null)
					   JOptionPane.showMessageDialog(frame,"Sorry no operations in history!" );
				   else
					   txtHi.setText(PreviousOperation);
			}
		});
		Previous.setForeground(Color.WHITE);
		Previous.setFont(new Font("Tahoma", Font.BOLD, 17));
		Previous.setBackground(SystemColor.activeCaption);
		Previous.setBounds(24, 90, 123, 54);
		frame.getContentPane().add(Previous);
		
		JButton Clear = new JButton("clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHi.setText(null);
			}
		});
		Clear.setForeground(Color.WHITE);
		Clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		Clear.setBackground(SystemColor.activeCaptionBorder);
		Clear.setBounds(195, 418, 76, 54);
		frame.getContentPane().add(Clear);
		
		JButton Next = new JButton("next");
		Next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String NextOperation=calc.next();
				 if (NextOperation==null)
				   JOptionPane.showMessageDialog(frame,"Sorry no more operations avaiable " );
				 else
				   txtHi.setText(NextOperation);
			}
		});
		Next.setForeground(Color.WHITE);
		Next.setFont(new Font("Tahoma", Font.BOLD, 17));
		Next.setBackground(SystemColor.activeCaption);
		Next.setBounds(157, 90, 114, 54);
		frame.getContentPane().add(Next);
		
		/*JButton Current = new JButton("current");
		Current.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String currentResult=calc.current();
				txtHi.setText(currentResult);
			}
		});
		Current.setForeground(Color.WHITE);
		Current.setFont(new Font("Tahoma", Font.BOLD, 16));
		Current.setBackground(SystemColor.activeCaption);
		Current.setBounds(109, 90, 76, 54);
		frame.getContentPane().add(Current);
		*/
		JButton plusbtn = new JButton("+");
		plusbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Operator=txtHi.getText() + plusbtn.getText();
				txtHi.setText(Operator);
			//	calc.operation=calc.setOperation(plusbtn.getText());
			}
		});
		plusbtn.setForeground(Color.WHITE);
		plusbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		plusbtn.setBackground(new Color(0, 51, 255));
		plusbtn.setBounds(318, 158, 76, 54);
		frame.getContentPane().add(plusbtn);
		
		JButton backspaceBtn = new JButton("\u2190");
		backspaceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtHi.setText(calc.backspace(txtHi.getText()));
				
				
			}
		});
		backspaceBtn.setBackground(SystemColor.activeCaptionBorder);
		backspaceBtn.setForeground(new Color(255, 255, 255));
		backspaceBtn.setFont(new Font("Tahoma", Font.BOLD, 29));
		backspaceBtn.setBounds(318, 90, 76, 54);
		frame.getContentPane().add(backspaceBtn);
	}
}
