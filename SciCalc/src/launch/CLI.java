package launch;

import java.util.ArrayList;

import objects.*;

public class CLI
{
	public static void main(String[] args)
	{
		//var
		Catagory activeCatagory;
		ArrayList<Variable> activeVariables;
		//setup
		Initialize.fillVar();
		//navigate
		activeCatagory = Navigate.getSubject();
		while(activeCatagory.getVariables() != null)
		{
			activeCatagory = Navigate.getSubcatagory(activeCatagory);
		}
		activeVariables = Navigate.getValues(activeCatagory.getVariables());
		//solve
		
	}
}
