package pension.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class NewCaseAction 
	extends AbstractAction
{
	public NewCaseAction(
		String name
	)
	{
		putValue(AbstractAction.NAME, name);
	}
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println("NEW CASE!");
	}

}
