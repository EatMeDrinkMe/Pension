package pension.service;

import java.util.List;

import pension.domain.Coefficient;

public interface CoefficientManagerService {
		
	public List<Coefficient> getAllCoefficients();
	public void add(Coefficient coef);
	public Coefficient getById(Long id);
	public void update(Coefficient coef);
}
