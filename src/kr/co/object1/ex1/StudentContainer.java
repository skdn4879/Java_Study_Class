package kr.co.object1.ex1;

public class StudentContainer {
	private int count;
	private Student[] copyStudents;
	
	public StudentContainer() {
		super();
	}
	
	public StudentContainer(int count, Student[] copyStudents) {
		super();
		this.count = count;
		this.copyStudents = copyStudents;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Student[] getCopyStudents() {
		return copyStudents;
	}
	public void setCopyStudents(Student[] copyStudents) {
		this.copyStudents = copyStudents;
	}
}
