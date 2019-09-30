package WS3;
import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-16
 *
 */
public class WS3Villkor 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Skriv din ålder");
		int age = input.nextInt();
		input.close();
		
		if(0 < age && age < 13 )
		{
			System.out.println("Du är ett barn");
		}
		
		if(12 < age && age < 20) 
		{
			System.out.println("Du är en tonåring");
		}
		
		if(20 < age && age < 65)
		{
			System.out.println("Du är vuxen");
		}
		if(age >= 65 )
		{
			System.out.println("Du är pensionär");
		}
		
		System.out.printf("Din ålder är: %d ", age);

	}

}
