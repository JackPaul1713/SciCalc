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
			//find x var
			//find equations with x var
			//find possible solution
				//first one equation with one var
				//then two equation with two var and so on (substitution)
			//check for multiple solutions
				//factor
			//isolate x
			//insert var values
			//solve
	}
}
