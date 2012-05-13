package pension.wrappers;


import  javax.swing         .*;
import  javax.swing .event  .*;

import pension.actions.ChoosedRowAction;

public class SelectionListener
  implements ListSelectionListener
{
	public void valueChanged(
		ListSelectionEvent event
	)
	{ 
		if ( !event.getValueIsAdjusting() ) {
   		if ( -1 == event.getFirstIndex() )
      		action.setSelected   (
      		  -1
      		);
   		else {
      		action.setSelected   (
      			table.convertRowIndexToModel(table.getSelectedRow())
      		);
   		}
		}
	}

	public void setAction   (
		ChoosedRowAction action
	)
	{
		this.action = action;
	}

	public void setTable    (
		JTable table
	)
	{
		this.table = table;
	}

	protected JTable           table ;
	protected ChoosedRowAction action;
}