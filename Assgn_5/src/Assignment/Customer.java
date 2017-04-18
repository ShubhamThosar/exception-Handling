package Assignment;

public class Customer {
	private String custNo;
	private String custName;
	private String category;

	public Customer()
	{

	}

	public Customer(String custNo, String custName, String category) {
		super();

		this.custNo = custNo;
		this.custName = custName;
		this.category = category;

	}

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCustNo(String custNo) throws InvalidInputException {

		if ( custNo.startsWith("C") || custNo.startsWith("c") )
		{	
			this.custNo = custNo;
		}
		else
			throw new InvalidInputException ("invalid custno");


	}

	public void setCustName(String custName) throws InvalidInputException {

		if( custName.length() > 3)
		{
			this.custName = custName;
		}
		else 
			throw new InvalidInputException("invalid custName");

	}

	public void setCategory(String category) throws InvalidInputException {

		if(category.equals("Platinum") || category.equals("Gold") || category.equals("Silver"))
		{
			this.category = category;
		}	
		else
			throw new InvalidInputException("invalid category");

	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName
				+ ", category=" + category + "]";
	}




}
