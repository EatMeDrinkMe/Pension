package pension.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class SearchAction 
	extends AbstractAction 
{
	public SearchAction(
		String name
	)
	{
		putValue(AbstractAction.NAME, name);
	}
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println("SEARCH CASE");
	}

}
