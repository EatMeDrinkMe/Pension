package pension.service.impl;

import java.util.List;

import pension.dao.PensionerDao;
import pension.domain.Pensioner;
import pension.service.PensionerManagerService;

public class PensionerManagerServiceImpl 
	implements PensionerManagerService
{

	public void setPensionerDao(PensionerDao pensionerDao) {
		this.pensionerDao = pensionerDao;
	}

	public void addNewCase(Pensioner pensioner) {
		pensionerDao.save(pensioner);
	}

	public List<Pensioner> getAllCases() {
		return pensionerDao.getAllPensioners();
	}

	public void updateCase(Pensioner pensioner) {
		pensionerDao.update(pensioner);
	}

	public Pensioner getPensionerById(Long id) {
		return pensionerDao.getById(id);
	}

	public Pensioner getPensionerByCaseNumber(int caseNumber) {
//		List<Pensioner> pl = pensionerDao.getAllPensioners();
//		Pensioner p = new Pensioner();
//		for(int i = 0;i<pl.size();i++){
//			if(pl.get(i).getCaseNumber()==caseNumber){
//				p = pl.get(i);break;
//			}
//		}
		return null;
	}
	
	private PensionerDao pensionerDao;
}
