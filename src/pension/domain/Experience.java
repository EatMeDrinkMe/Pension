package pension.domain;

public class Experience {
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getBeginPeriod() {
		return beginPeriod;
	}
	
	public void setBeginPeriod(String beginPeriod) {
		this.beginPeriod = beginPeriod;
	}
	
	public String getEndPeriod() {
		return endPeriod;
	}
	
	public void setEndPeriod(String endPeriod) {
		this.endPeriod = endPeriod;
	}

	public void setPensioner(Pensioner pensioner) {
		this.pensioner = pensioner;
	}

	public Pensioner getPensioner() {
		return pensioner;
	}
	
	private Long id;
	private Pensioner pensioner;
	private String beginPeriod;
	private String endPeriod;
}
