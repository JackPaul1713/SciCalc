package launch;

import objects.Catagory;
import resources.Data;

public class Initialize
{
	public static void fillVar()
	{
		for (Catagory s: Data.subjects)
		{
			s.fillVar();
			Data.variables.addAll(s.getVariables());
		}
	}
}
