package pension.service.impl;

import java.util.List;

import pension.dao.MiddleSalaryDao;
import pension.domain.MiddleSalary;
import pension.service.MiddleSalaryManagerService;

public class MiddleSalaryManagerServiceImpl 
	implements MiddleSalaryManagerService{
	
	public void setMiddleSalaryDao(MiddleSalaryDao middleSalaryDao) {
		this.middleSalaryDao = middleSalaryDao;
	}

	public List<MiddleSalary> getAllMiddleSalaries() {
		return middleSalaryDao.getAllMiddleSalaries();
	}
	
	private MiddleSalaryDao middleSalaryDao;
}
