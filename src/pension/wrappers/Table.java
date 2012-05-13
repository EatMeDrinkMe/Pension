package pension.wrappers;

import  java .awt    .event.*;
import  javax.swing  .table.*;
import  java .util         .*;

public class Table
     extends javax.swing.JTable
{
	public Table                     (
		TableModel       model
     ,TableColumnModel columnModel
	)
	{
		super     (model,columnModel  );
		addFocusListener    (
			new FocusListener() {
				public void focusGained(FocusEvent event) {
      			if ( -1 == getSelectedRow()) {
      				try   {
      					setRowSelectionInterval   (0,0);
							setColumnSelectionInterval(1,1);
      				}
      				catch ( Exception _ )     {}
      			}
				}
				public void focusLost  (FocusEvent event) {}
			}
		);
	}

	public void setComparators       (
		Map<Integer,Comparator> comparators
	)
	{
		TableRowSorter sorter = new TableRowSorter  (getModel());
		for ( Map.Entry<Integer,Comparator> entry : comparators.entrySet() ) {
			sorter.setComparator(entry.getKey(),entry.getValue());
		}
		setRowSorter  (sorter);
	}

	public void setMouseListener     (
      MouseListener mouseListener
	)
	{
		addMouseListener(mouseListener);
	}

	public void setMouseListeners    (
      List<MouseListener> mouseListeners
	)
	{
		for (MouseListener  listener : mouseListeners ) {
			addMouseListener(listener);
		}
	}

	public void setKeyListener       (
      KeyListener keyListener
	)
	{
		addKeyListener  (keyListener  );
	}

	public void setSelectionListener (
      SelectionListener listener
	)
	{
		listener.setTable(this);
		getSelectionModel().addListSelectionListener(listener); 
	}

	public void setSelectionListeners(
      List<SelectionListener>listeners
	)
	{
		for (SelectionListener listener : listeners) {
			listener.setTable(this);
			getSelectionModel().addListSelectionListener(listener);
		}
	}

	public void setDefaultRowHeight  (
		int height
	)
	{
		setRowHeight(height);
	}

	volatile
	protected int sortKey = -1;
}