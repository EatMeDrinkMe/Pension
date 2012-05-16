package pension.environment;

public class Environment {

	public int getPensionType() {
		return pensionType;
	}

	public void setPensionType(
		int pensionType
	) 
	{
		this.pensionType = pensionType;
	}

	public void setSearchPensionerName(
		String searchPensionerName
	) 
	{
		this.searchPensionerName = searchPensionerName;
	}

	public String getSearchPensionerName() {
		return searchPensionerName;
	}

	protected String searchPensionerName;
	protected int    pensionType;
}
