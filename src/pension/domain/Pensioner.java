package pension.domain;

import java.util.*;

public class Pensioner {
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void addSalary(Salary salary){
		this.salary.add(salary);
		salary.setPensioner(this);
	}
	
	public void addExperince(Experience exp){
		this.experience.add(exp);
		exp.setPensioner(this);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String getThirdName() {
		return thirdName;
	}
	
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getINN() {
		return INN;
	}
	
	public void setINN(int iNN) {
		INN = iNN;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setSalary(Set<Salary> salary) {
		this.salary = salary;
	}

	public Set<Salary> getSalary() {
		return salary;
	}

	public void setExperience(Set<Experience> experience) {
		this.experience = experience;
	}

	public Set<Experience> getExperience() {
		return experience;
	}

	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}

	public int getCaseNumber() {
		return caseNumber;
	}
	
	private Long id;
	private int caseNumber;
	private String firstName;
	private String secondName;
	private String thirdName;
	private String birthday;
	private int INN;
	private String sex;
	private Set<Salary> salary = new HashSet();
	private Set<Experience> experience = new HashSet();
}
