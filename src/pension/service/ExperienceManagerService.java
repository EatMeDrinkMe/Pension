package pension.service;

import java.util.List;

import pension.domain.Experience;

public interface ExperienceManagerService {
	public List<Experience> getAllCoefficients(); 
	public void add(Experience exp);
	public void update(Experience exp);
}
