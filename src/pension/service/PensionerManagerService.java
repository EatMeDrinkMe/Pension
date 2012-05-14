package pension.service;

import java.util.List;

import pension.domain.Pensioner;

public interface PensionerManagerService {
	public void addNewCase(Pensioner pensioner);
	public void updateCase(Pensioner pensioner);
	public Pensioner getPensionerById(int id);
	public List<Pensioner> getPensionerByName(String name);
}
