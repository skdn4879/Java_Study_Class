package kr.co.object1.ex1;

public class Student {
	private String name;
	private int number;
	private int langScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private int averScore;
	
	public Student() {
		super();
	}
	public Student(String name, int number, int langScore, int engScore, int mathScore, int totalScore, int averScore) {
		super();
		this.name = name;
		this.number = number;
		this.langScore = langScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.totalScore = totalScore;
		this.averScore = averScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getLangScore() {
		return langScore;
	}
	public void setLangScore(int langScore) {
		this.langScore = langScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getAverScore() {
		return averScore;
	}
	public void setAverScore(int averScore) {
		this.averScore = averScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", langScore=" + langScore + ", engScore=" + engScore
				+ ", mathScore=" + mathScore + ", totalScore=" + totalScore + ", averScore=" + averScore + "]";
	}
	
}
