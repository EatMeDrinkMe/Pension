package pension.service.impl;

import java.util.List;

import pension.dao.PensionerDao;
import pension.domain.Pensioner;
import pension.service.PensionerManagerService;

public class PensionerManagerServiceImpl 
	implements PensionerManagerService
{
	public void addNewCase(
		Pensioner pensioner
	) 
	{
		pensionerDao.save(pensioner);
	}

	public void updateCase(
		Pensioner pensioner
	)
	{
		pensionerDao.update(pensioner);
	}

	public Pensioner getPensionerById(
		int id
	)
	{
		return pensionerDao.getById(id);
	}
	
	public void setPensionerDao(
		PensionerDao pensionerDao
	) 
	{
		this.pensionerDao = pensionerDao;
	}

	public List<Pensioner> getPensionerByName(
		String name
	) 
	{
		return pensionerDao.getByName(name);
	}
	private PensionerDao pensionerDao;

}
