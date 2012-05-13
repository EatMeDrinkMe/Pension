package pension.domain;

public class Coefficient {
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
	
	public double getCoef() {
		return coef;
	}
	
	public void setCoef(double coef) {
		this.coef = coef;
	}
	
	private Long id;
	private int year;
	private String month;
	private double coef;
}
