package pension.model;

import java.util.ArrayList;
import  java .util  .List;
import  javax.swing .event.TableModelListener;
import javax.swing.table.AbstractTableModel;

abstract 
public class RemoteDataModel
	  extends AbstractTableModel
{
	abstract
	protected List query();

	protected void   fireDataChanged() {
		fireTableDataChanged         ();
	}

	public void refresh(){
	List list = query();
	if (null != list)
		this.list = list;
	else
		RemoteDataModel.this.list = new ArrayList();
	fireDataChanged(); 
	}

	public void setModelListener(
		TableModelListener listener
	)
	{
		addTableModelListener(listener);
	}

	volatile protected List list = new ArrayList();
}

