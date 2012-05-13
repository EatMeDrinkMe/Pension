package pension.actions;

import  java .awt  .event.ActionEvent;
import  javax.swing.*;

abstract 
public class ChoosedRowAction
	  extends AbstractAction
{
	
	abstract
	protected void actionPerformed(
		int viewRow
     ,int modelRow
	);

	public    void actionPerformed(
		ActionEvent event
	)
	{
		int viewRow  = table.getSelectedRow();
		if ( -1 == viewRow   )
			throw new RuntimeException("Ошибка выбора!");
		else
   		actionPerformed(
   			viewRow
           ,table.convertRowIndexToModel (viewRow)
   		);
	}

	public void setVisible (
		boolean visible
	)
	{
		this.visible  = visible;
		setEnabled(visible && -1 != row);
	}

	public void setSelected(
		int row
	)
	{
		this.row = row;
		setEnabled(visible && -1 != row);
	}

	public void setTable   (
		JTable table
	)
	{
		this.table = table;
	}

	public int  getSelected() {
		return row;
	}

	protected boolean visible ;
	protected int     row     = -1;
	protected JTable  table   ;
}