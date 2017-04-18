package Assignment;

public class Handle
{
	private int num;
	private int den;

	public int Divide() 
	{
		int Div= num/den;
		System.out.println(Div);
		return Div;
	
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setDen(int den) throws DivideByZeroException {
		if (den==0)
		throw new DivideByZeroException("deno should not be zero");
		this.den = den;
	}

}
