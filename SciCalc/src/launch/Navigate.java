package launch;

import java.util.ArrayList;
import java.util.Scanner;

import objects.*;
import resources.Data;

public class Navigate
{
	public static Catagory getSubject()
	{
		//var
		int selection;
		Scanner intInp = new Scanner(System.in);
		//options
		for(int i = 0; i < Data.subjects.size(); i++)
		{
			System.out.println("(" + (i+1) + ")" + Data.subjects.get(i));
		}
		//input
		selection = intInp.nextInt();
		//ret
		return(Data.subjects.get(selection-1));
	}
	public static Catagory getSubcatagory(Catagory catagory)
	{
		//var
		int selection;
		Scanner intInp = new Scanner(System.in);
		//options
		for(int i = 0; i < catagory.getSubcatagories().size(); i++)
		{
			System.out.println("(" + (i+1) + ")" +  catagory.getSubcatagories().get(i));
		}
		//input
		selection = intInp.nextInt();
		//ret
		return(catagory.getSubcatagories().get(selection-1));
	}
	public static ArrayList<Variable> getValues(ArrayList<Variable> variables)
	{
		//var
		String value;
		ArrayList<Variable> activeVariables = new ArrayList<Variable>();
		Scanner strInp = new Scanner(System.in);
		//input
		for(int i = 0; i < variables.size(); i++)
		{
			System.out.print(variables.get(i) + ": ");
			value = strInp.nextLine();
			if(!value.equals("na"))
			{
				variables.get(i).setValue(value);
				activeVariables.add(variables.get(i));
			}
		}
		//ret
		return(activeVariables);
	}
}
