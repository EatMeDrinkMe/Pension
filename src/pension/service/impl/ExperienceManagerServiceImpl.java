package pension.service.impl;

import java.util.List;

import pension.dao.ExperienceDao;
import pension.domain.Experience;
import pension.service.ExperienceManagerService;

public class ExperienceManagerServiceImpl 
	implements ExperienceManagerService
{

	public void setExperienceDao(ExperienceDao experienceDao) {
		this.experienceDao = experienceDao;
	}

	public List<Experience> getAllCoefficients() {
		return experienceDao.getAllCoefficients();
	}

	public void add(Experience exp) {
		experienceDao.add(exp);
		
	}

	public void update(Experience exp) {
		experienceDao.update(exp);
		
	}
	
	ExperienceDao experienceDao;
}
