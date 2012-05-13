package pension.domain;

import java.util.*;

public class Pensioner {
	
	public Pensioner(
			int id
			, String firstName
			, String secondName
			, String thirdName
			, String birthday
			, int iNN
			, String sex
			, Set<Salary> salary
			, Set<Experience> experience
			, double expKoef
			, double salKoef
	) 
	{
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.birthday = birthday;
		INN = iNN;
		this.sex = sex;
		this.salary = salary;
		this.experience = experience;
		this.expKoef = expKoef;
		this.salKoef = salKoef;
	}



	public Pensioner(
		int id
		, String firstName
		, String secondName
		, String thirdName
		, String birthday
		, int iNN
		, String sex
		, Set<Salary> salary
		, Set<Experience> experience
	) 
	{
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.birthday = birthday;
		INN = iNN;
		this.sex = sex;
		this.salary = salary;
		this.experience = experience;
	}
	
	
	public Pensioner(
		int id
		, String firstName
		, String secondName
		, String thirdName
		, String birthday
		, int iNN
		, String sex
		, double expKoef
		, double salKoef
		, String adress
		, int pensionType
	) 
	{
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.birthday = birthday;
		INN = iNN;
		this.sex = sex;
		this.expKoef = expKoef;
		this.salKoef = salKoef;
		this.adress = adress;
		this.pensionType = pensionType;
	}



	public int getId() {
		return id;
	}
	
	public void setId(
		int id
	) 
	{
		this.id = id;
	}
	
	public void addSalary(
		Salary salary
	)
	{
		this.salary.add(salary);
		salary.setPensioner(this);
	}
	
	public void addExperince(
		Experience exp
	)
	{
		this.experience.add(exp);
		exp.setPensioner(this);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(
		String firstName
	) 
	{
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(
		String secondName
	) 
	{
		this.secondName = secondName;
	}
	
	public String getThirdName() {
		return thirdName;
	}
	
	public void setThirdName(
		String thirdName
	) 
	{
		this.thirdName = thirdName;
	}
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(
		String birthday
	)
	{
		this.birthday = birthday;
	}

	public int getINN() {
		return INN;
	}
	
	public void setINN(
		int iNN
	) 
	{
		INN = iNN;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(
		String sex
	) 
	{
		this.sex = sex;
	}

	public void setSalary(
		Set<Salary> salary
	) 
	{
		this.salary = salary;
	}

	public Set<Salary> getSalary() {
		return salary;
	}

	public void setExperience(
		Set<Experience> experience
	) 
	{
		this.experience = experience;
	}

	public Set<Experience> getExperience() {
		return experience;
	}
	
	public double getExpKoef() {
		return expKoef;
	}

	public void setExpKoef(
		double expKoef
	) 
	{
		this.expKoef = expKoef;
	}

	public double getSalKoef() {
		return salKoef;
	}

	public void setSalKoef(
		double salKoef
	) 
	{
		this.salKoef = salKoef;
	}

	protected int            id                        ;
	protected String          firstName                 ;
	protected String          secondName                ;
	protected String          thirdName                 ;
	protected String          birthday                  ;
	protected int             INN                       ;
	protected String          sex                       ;
	protected Set<Salary>     salary = new HashSet()    ;
	protected Set<Experience> experience = new HashSet();
	protected double          expKoef                   ;
	protected double          salKoef                   ;
	protected String          adress                    ;
	protected int             pensionType               ;
}
