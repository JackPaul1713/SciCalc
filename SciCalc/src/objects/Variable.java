package objects;

public class Variable
{
	//var
	private String name;
	private String abreviation;
	private String description;
	private String value;
	//constructor
	public Variable(String n, String a, String d)
	{
		name = n;
		abreviation = a;
		description = d;
		value = "na";
	}
	//getSet
	public String getName()
	{
		return(name);
	}
	public String getAbreviation()
	{
		return(abreviation);
	}
	public String getDescription()
	{
		return(description);
	}
	public String getValue()
	{
		return value;
	}
	public void setValue(String v)
	{
		value = v;
	}
}
