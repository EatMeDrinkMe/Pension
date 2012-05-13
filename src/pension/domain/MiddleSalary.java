package pension.domain;

public class MiddleSalary extends Salary{
	
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
	
	public double getMiddleSalary() {
		return middleSalary;
	}
	
	public void setMiddleSalary(double middleSalary) {
		this.middleSalary = middleSalary;
	}
	
	private Long id;
	private int year;
	private double middleSalary;
}
