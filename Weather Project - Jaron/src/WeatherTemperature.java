import java.util.Scanner;

public class WeatherTemperature {

	public static void main(String[] args) 
	{
		System.out.println("Hello! Please enter the temperature in F.");
		
		Scanner cin = new Scanner(System.in); //input
		
		float Ftemp = cin.nextFloat();
		float Ctemp = 0;
		//do the math
		Ctemp = Ftemp-32;
		
		Ctemp = Ctemp * 5/9;
		
		System.out.println("It is currently " + Ctemp + " degrees outside!");
		
		if (Ftemp<=32)
		{
			System.out.println("It's freezing outside! Remember to wear a coat!"); //it's cold
		}
		else if(Ftemp>=90)
		{
			System.out.println("It's hot outside, make sure to stay cool!"); //it's hot
		}
	
	}

}
