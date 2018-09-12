//Assignment 6 Enum
package mypack;

import java.util.HashMap;
import java.util.Map;

public class Enum_Example {
	
	public static void main(String[] args)
{
	System.out.println(StateInfo.MAHARASTRA);
	System.out.println(StateInfo.matchfor("Mumbai"));
}

}


 enum StateInfo
{
	MAHARASTRA(500,"Mumbai"),
	KARNATAKA(1000,"Benglaru"),
	 UNKNOWN(0,"UNKNOWN STATE");
	
	private final String capital;
	private final int population; 
	
	private static  Map<String,String> reverselookup;
	
	private StateInfo(int population,String capital)
	{
		this.capital=capital;
		this.population=population;
		
	}
	
	static
	{
		reverselookup = new HashMap<>();
		for(StateInfo stateInfo : StateInfo.values())
		{
			reverselookup.put(stateInfo.capital, stateInfo.name());
			
		}
	}
	
	public static String matchfor(String cap)
	{
		if(reverselookup.containsKey(cap))
		{
			return reverselookup.get(cap);
		}
		return UNKNOWN.name();
		
	}
	
	public int getpopulation()
	{
		return this.population;
	}
	
	public String getCapital()
	{
		return this.capital;
	}
  
	public String toString()
	{
	return "Capital Name "+capital+" Population:"+population;
		
	}
	
	
	
}
