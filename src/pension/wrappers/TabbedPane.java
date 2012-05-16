package pension.wrappers;

import  java .util       .*;
import  java .awt  .event.*;

import   javax.swing.JComponent;
import  javax.swing.event.*;

public class TabbedPane
     extends javax.swing.JTabbedPane
{
	public TabbedPane      () {
		super();
		addFocusListener    (
			new FocusListener() {
				public void focusGained(FocusEvent _) {
					switchToTab();
				}
				public void focusLost  (FocusEvent _) {}
			}
		);
	}

	public void switchToTab(){
		JComponent      comp = children.get(getTitleAt(getSelectedIndex()));
		if ( null!= comp ) {
			comp.requestFocusInWindow     ();
		}
	}

	public void setTabChangeListeners(
      List<ChangeListener> listeners
	)
	{
		for ( ChangeListener listener : listeners ) {
			addChangeListener(listener);
		}
	}

	public void setChildren (
		Map<String,JComponent> children
	)
	{
		this.children = children;
	}

	protected Map<String,JComponent> children;
}