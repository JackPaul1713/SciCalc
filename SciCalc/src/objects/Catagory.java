package objects;

import java.util.ArrayList;

public class Catagory
{
	//var
	private String name;
	private String description;
	private ArrayList<Catagory> subcatagories;
	private ArrayList<Variable> variables;
	//constructor
	public Catagory(String n, String d, ArrayList<Catagory> s, ArrayList<Variable> v)
	{
		name = n;
		description = d;
		subcatagories = s;
		variables = v;
	}
	//meth
	public void fillVar()
	{
		for(Catagory s: subcatagories)
		{
			variables.addAll(s.getVariables());
		}
	}
	//getSet
	public String getName()
	{
		return(name);
	}
	public String getDescription()
	{
		return(description);
	}
	public ArrayList<Catagory> getSubcatagories()
	{
		return(subcatagories);
	}
	public ArrayList<Variable> getVariables()
	{
		return(variables);
	}
}
