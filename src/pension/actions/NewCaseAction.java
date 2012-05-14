package pension.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import pension.dialogs.CaseDialog;

public class NewCaseAction 
	extends AbstractAction
{
	public NewCaseAction(
		String name
	)
	{
		putValue(AbstractAction.NAME, name);
	}
	
	public void actionPerformed(
		ActionEvent ae
	)
	{
		dialog.setVisible(true);
	}
	
	public void setDialog(
		CaseDialog dialog
	) 
	{
		this.dialog = dialog;
	}

	protected CaseDialog dialog;
}
