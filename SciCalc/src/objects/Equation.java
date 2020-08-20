package objects;

public class Equation
{
	//var
	private String equation;
	private String[] key;
	//constructor
	public Equation(String e, String[] k)
	{
		equation = e;
		key = k;
	}
	//getSet
	public String getEquation()
	{
		return(equation);
	}
	public String[] getKey()
	{
		return(key);
	}
}
