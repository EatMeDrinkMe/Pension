package pension.service.impl;

import java.util.List;

import pension.dao.CoefficientDao;
import pension.domain.Coefficient;
import pension.service.CoefficientManagerService;

public class CoefficientManagerServiceImpl 
	implements CoefficientManagerService
{
	public void setCoefficientDao(CoefficientDao coefficientDao) {
		this.coefficientDao = coefficientDao;
	}

	public List<Coefficient> getAllCoefficients() {
		return coefficientDao.getAllCoefficients();
	}

	public void add(Coefficient coef) {
		coefficientDao.add(coef);	
	}

	public Coefficient getById(Long id) {
		return coefficientDao.getById(id);
	}

	public void update(Coefficient coef) {
		coefficientDao.update(coef);
	}
	
	private CoefficientDao coefficientDao;
}
