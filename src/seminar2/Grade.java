package seminar2;

public class Grade {
	
	private long id;
	private int gradeValue;
	private Student student;
	private Course course;
	
	private static long counter = 20000;
	//2.getters
	public long getId() {
		return id;
	}
	
	public int getGradeValue() {
		return gradeValue;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public Course getCourse() {
		return course;
	}
	//3.setters
	public void setId() {
		id = counter;
		counter++;
	}
	
	public void setGradeValue(int inputGradeValue) {
		if( inputGradeValue > 0 && inputGradeValue <=8 ) {
			gradeValue = inputGradeValue;
		}
		else
		{
			gradeValue = 8;
		}
	}
	
	public void setStudent(Student inputStudent) {
		if(inputStudent != null) {
			student = inputStudent;
		}
		else
		{
			student = new Student();
		}
	}
	
	public void setCourse(Course inputCourse) {
		if(inputCourse!=null) {
			course = inputCourse;
		}
		else
		{
			course = new Course();
		}
	}
	
	//4.no-args constr
	public Grade() {
		setId();
		setGradeValue(2);
		setStudent(new Student());
		setCourse(new Course());
	}
	//5. arg constr
	public Grade(int inputGradeValue, Student inputStudent, 
			Course inputCourse) {
		setId();
		setGradeValue(inputGradeValue);
		setStudent(inputStudent);
		setCourse(inputCourse);
	}
	
	//6.toString
	public String toString() {
		
		String result = id + ": " + student.getName() + " " + student.getSurname()  +
				" (" + course.getTitle() + ")" + gradeValue;
		return result;
	}
	
	//7. other functions(if necessary)
	

}