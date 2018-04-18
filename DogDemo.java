


public class DogDemo {

	String name;
	int age;
	String colour;
	
	public void eat()
	{
		System.out.println(name+"pagal kutta khata hai:) :) :)");
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		
		for(int i=0;i<name.length();i++)
		{
			
			int a=name.charAt(i);
			if((a>=65 && a<=90) || (a>=97 && a<=124 ))
		{
		
			this.name = name;
		}
		else 
			{
			throw new RuntimeException("numeric and alphanumeric name not accepted ");
			}
		}
		
	}
}