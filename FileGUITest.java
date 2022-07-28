import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileGUITest {
	public static void main(String[] args) {

		MyFrame mf = new MyFrame("My Notepad",100,100,400,300);
		mf.setVisible(true);

	}
}

class MyFrame extends JFrame implements ActionListener //isA
{
	JLabel jl1 = new JLabel("Enter filename : ");
	JTextField jt = new JTextField(20);

	JLabel jl2 = new JLabel("Enter data : ");

	JTextArea data = new JTextArea(5,25);
	JButton b1 = new JButton("SAVE"); //hasA
	JButton b2 = new JButton("Clear"); //hasA
	
	
	MyFrame(String title, int row, int col, int x, int y) {
		setTitle(title);
		setSize(x, y);
		setLocation(row, col);
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		add(jl1); 	add(jt);
		add(jl2);   add(data);
		add(b1);
		add(b2);
		
		b1.addActionListener(this); //where the actionPerformed() is ???
		b2.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Button is clicked...");
		
		if(e.getSource()==b1) {
			System.out.println("b1 is clicked...save");
			String filename = jt.getText();
			FileWriter fw;
			try {
				fw = new FileWriter(filename);
				System.out.println("File is ready...");
				
				
				String filesData = data.getText();
				fw.write(filesData);
				System.out.println("Data is written....");
				fw.close();
				System.out.println("File is closed.....");

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b2) {
			System.out.println("b2 is clicked...clear");

			jt.setText("");
			data.setText("");
		}
	}
}


