package pension.wrappers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

public class ComboBox 
	extends JComboBox 
{
	public ComboBox(
		List<String> items
	)
	{
		this.items = items;
		for(String item: items){
			addItem(item);
		}
	}
	
	protected List<String> items = new ArrayList<String>(); 
}
