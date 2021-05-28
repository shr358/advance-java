import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ChooseColor implements ActionListener
{
    static JFrame f;

    public static void main(String args[])    {
	
	f = new JFrame("Choose Frame Background");
	f.setSize(400,400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.getContentPane().setBackground(Color.white);
	f.setLayout(new FlowLayout());

	ChooseColor cc = new ChooseColor();

	JButton button = new JButton("Select Color");
	button.addActionListener(cc);
	f.add(button);	

	f.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e)
    {

	Color color=JColorChooser.showDialog(f,"Select a Color",Color.white);

	f.getContentPane().setBackground(color);
    }
}
