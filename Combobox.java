import javax.swing.*;
import java.awt.event.*;
class ComboBox implements ItemListener
{
    static JLabel item;
    static JComboBox<String> box; 
   
            public static void main(String args[])
            {
	   
	        JFrame frame = new JFrame("Combo Box example");
	        frame.setSize(500,500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(null);

           
            ComboBox cb = new ComboBox();
          	
                    item = new JLabel("Select an IDE");
                    item.setBounds(175,50,200,50);
            frame.add(item);
            
            String ide[]={"Eclipse","Netbeans","Intellij","JDeveloper","Greenfoot"};
        
            box = new JComboBox<String>(ide);
            box.setBounds(200,200,100,50);
            box.addItemListener(cb);
            frame.add(box);
         
             frame.setVisible(true);
            }
   
    public void itemStateChanged(ItemEvent e)
    {
	item.setText("Selected IDE's : "+box.getSelectedItem());
    }
}
