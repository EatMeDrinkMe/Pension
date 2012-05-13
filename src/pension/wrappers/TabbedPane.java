package pension.wrappers;

import  java .util       .*;
import  java.awt.Component ;
import  java .awt  .event.*;
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
		Component      comp = children.get(getTitleAt(getSelectedIndex()));
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
		Map<String,Component> children
	)
	{
		this.children = children;
	}

	protected Map<String,Component> children;
}