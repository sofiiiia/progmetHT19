/**
 * 
 */
package soag01;

import java.util.Scanner;

/**
 * @author Sofia
 *
 */
public class P8_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = input.nextLine();

		Student student = new Student(name);
		student.addQuizScore(100);
		student.addQuizScore(100);
		student.addQuizScore(100);
		student.addQuizScore(100);
		student.addQuizScore(100);
		student.addQuizScore(100);
		System.out.println(student.getTotalScore()+ " " + student.getAverageScore() );
		input.close();
		
	}

}
