package pension.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;

public class Window 
	extends JFrame
{	
	public Window(
		String tittle
	)
	{
		super(tittle);
	}
	public void beforehand() {
		add(mkToolbar   (),BorderLayout.NORTH );
		add(mkTabbedPane(),BorderLayout.CENTER);
		
	}
	
	protected Component mkToolbar     () {
		JToolBar toolbar = new JToolBar();
		for (  Component component : toolbarComponents ) {
			  toolbar.add(component);
			  toolbar.addSeparator(new Dimension(15,20));
		}
		toolbar.setBorder       (new EmptyBorder(1,0,0,0));
		toolbar.setBorderPainted(false);
		toolbar.setFloatable    (false);
		toolbar.setRollover     (false);
		return toolbar;
	}
	
	protected Component mkTabbedPane  () {
		int indx = 0;
		for (  Component component : tabbedComponents  ) {
             tabbedPane.add             (component);
             tabbedPane.setMnemonicAt   (indx,KeyEvent.VK_0 + indx + 1);
             indx++;
		}
		return tabbedPane;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(
		JTabbedPane tabbedPane
	) 
	{
		this.tabbedPane = tabbedPane;
	}

	public List<Component> getToolbarComponents() {
		return toolbarComponents;
	}

	public void setToolbarComponents(
		List<Component> toolbarComponents
	) 
	{
		this.toolbarComponents = toolbarComponents;
	}

	public List<Component> getTabbedComponents() {
		return tabbedComponents;
	}

	public void setTabbedComponents(
		List<Component> tabbedComponents
	) 
	{
		this.tabbedComponents = tabbedComponents;
	}

	protected JTabbedPane     tabbedPane       ;
	protected List<Component> toolbarComponents;
	protected List<Component> tabbedComponents ;
}
