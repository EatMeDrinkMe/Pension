package pension.wrappers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import pension.environment.Environment;

public class ComboBox 
	extends JComboBox 
	implements ActionListener
{
	public ComboBox(
		List<String> items
	)
	{
		this.items = items;
		for(String item: items){
			addItem(item);
		}
		addActionListener(this);
	}
	
    public void actionPerformed(
    	ActionEvent e
    ) 
    {
        ComboBox cb = (ComboBox)e.getSource();
        int index = cb.getSelectedIndex();
        environment.setPensionType(index);
        
    }
    
	public void setEnvironment(
		Environment environment
	) 
	{
		this.environment = environment;
	}

	protected List<String> items = new ArrayList<String>(); 
	protected Environment environment                     ;
}
