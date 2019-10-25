package soag01;

public class Student {

	private String namn = "";
	private double totalScore = 0.0d;
	private int numberOfQuiz = 0;
	
	public Student(String namn) {
		
	}
	public void addQuizScore(int score) {
		totalScore += score;
		numberOfQuiz++;
	}
	public String getName() {
		return namn;
	}
	public double getTotalScore() {
		return totalScore;
	}
	public double getAverageScore() {
		return  totalScore/numberOfQuiz; 
	}
}
