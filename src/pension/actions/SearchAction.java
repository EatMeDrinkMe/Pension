package pension.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import pension.domain.Pensioner;
import pension.service.impl.PensionerManagerServiceImpl;

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
		try{
		Pensioner p = service.getPensionerById(1L);
		System.out.println(p.getFirstName());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void setService(PensionerManagerServiceImpl service) {
		this.service = service;
	}

	protected PensionerManagerServiceImpl service;
}
