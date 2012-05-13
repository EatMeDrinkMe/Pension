package pension.domain;

public class Salary {
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPensioner(Pensioner pensioner) {
		this.pensioner = pensioner;
	}

	public Pensioner getPensioner() {
		return pensioner;
	}
	
	private Long id;
	private int year;
	private String month;
	private double salary;
	private Pensioner pensioner;
}
