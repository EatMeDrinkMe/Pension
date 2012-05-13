package pension.service;

import java.util.List;

import pension.domain.Pensioner;

public interface PensionerManagerService {
	public void addNewCase(Pensioner pensioner);
	public List<Pensioner> getAllCases();
	public void updateCase(Pensioner pensioner);
	public Pensioner getPensionerById(Long id);
	public Pensioner getPensionerByCaseNumber(int caseNumber);
}
