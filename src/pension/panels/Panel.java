package pension.panels;

import java.awt.Component;
import java.awt.LayoutManager;
import java.util.List;

import javax.swing.JPanel;

public class Panel 
	extends JPanel 
{
	public Panel(
		List<Component> components
		,LayoutManager layout
	)
	{
		for(Component component: components){
			add(component, layout);
		}
	}
	
	protected List<Component> components;
	protected LayoutManager layout      ;  
}
