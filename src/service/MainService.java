package service;

import java.awt.im.InputContext;
import java.util.ArrayList;
import java.util.Arrays;

import seminar2.Country;
import seminar2.Course;
import seminar2.Grade;
import seminar2.Person;
import seminar2.ProfDegree;
import seminar2.Professor;
import seminar2.Student;

public class MainService {
	
	//private static ArrayList<Student> allStudents
				//= new ArrayList<Student>();
	//private static ArrayList<Professor> allProfessor
				//= new ArrayList<Professor>();
	
	private static ArrayList<Person> myperson = new ArrayList<Person>();
		
	
	private static ArrayList<Course> allCourse
	   			= new ArrayList<Course>();
	private static ArrayList<Grade> Grades
				= new ArrayList<Grade>();

				

	public static void main(String[] args) {
		System.out.println("-----------STUDENTS---------");
		Student stud1 = new Student();//Aref which is default student
		System.out.println(stud1);
		myperson.add(stud1);
		
		for(Person tempP : myperson) {
			if (tempP instanceof Student) {
				System.out.println(tempP);
			}
		}
		
		
		
		
		Student stud2 = new Student("AB987654", "John", "Sarfo",
				"EPF", 2007, Country.other, "LU236890");
		System.out.println(stud2);
		myperson.add(stud2);
		
		Student stud3= new Student("AB987654", "New","Gamer",
				"ITF", 2007, Country.other, "LU236770");
		System.out.println(stud3);
		myperson.add(stud3);
		
		System.out.println("form latvia");
		for (int i = 0; i< myperson.size(); i++) {
			if(myperson.get(i) instanceof Student)
			{
				Student tempStudent = (Student)myperson.get(i);
				if(tempStudent.getCountry().equals(Country.latvia)) {
					System.out.println(tempStudent);
				}
			}
		}
		
		
		System.out.println("-----------PROFESSORS---------");
		Professor prof1 = new Professor();//Karina which is default professor
		System.out.println(prof1);
		myperson.add(prof1);
		Professor prof2 = new Professor("Estere", "Vitola",ProfDegree.master,"KN4177625");
		System.out.println(prof2);
		myperson.add(prof2);
		//some wrong values as input arguments
		Professor prof3 = new Professor("%#^%#&^%&^$^%#", "287646",null, "GJ125872");
		System.out.println(prof3);
		myperson.add(prof3);
		
		System.out.println("-----------COURSES---------");
		Course course1 = new Course();
		System.out.println(course1);
		
		Course course2 = new Course("Data Structures", 10, prof2);
		System.out.println(course2);
		Course course3 = new Course("Mathematics", 7, prof3);
		System.out.println(course3);
		allCourse.addAll(Arrays.asList(course1, course2, course3));
		
		System.out.println("grade class");
		Grade gr1 = new Grade(2, stud1, course1);
		System.out.println(gr1);
		Grade gr2 = new Grade(4, stud2,course2);
		System.out.println(gr2);
		Grade gr3 = new Grade(8, stud3, course3);
		System.out.println(gr3);
		Grades.addAll(Arrays.asList(gr1, gr2, gr3));
		
		System.out.println("professs");
		filterAllProfessorsWithDegree(ProfDegree.master);
		System.out.println("PROFESSWITHPHD");
		filterAllProfessorsWithDegree(ProfDegree.phd);
		
		System.out.println("-----------BIRTHYEAR--------");
		filterAllStudentswithlargerbirthyeartlargerthan2005();
		
		
		System.out.println("-----------ITF--------");
		
		filterAllStudentswithfacultyITF("ITF");
		
		System.out.println("-------Course------");
		
		filterAllFunctionForCourse(1);
		

		System.out.println("-------LessGrade------");
		
		filteringFunctionsForGradeLessThan4();
		
		System.out.println("-------Call-Professor------");
	try {
	
		createNewProfessor("James","Janis",ProfDegree.master, "JD5327816");
		for(Person tempP : myperson) {
			if(tempP instanceof Professor) {
				System.out.println(tempP);
			}
		}
		
		System.out.println(getProfessorById(1));
		updateProfessorByid(2,"Lady","Master", ProfDegree.phd);
		for(Person tempP : myperson) {
			if(tempP instanceof Professor) {
				System.out.println(tempP);
			}
		}
		
	}  catch (Exception e) {
		System.out.println(e.getMessage());
		
	}
	try {
		
		System.out.println(getProfessorById(0));
	}  catch (Exception e) {
		System.out.println(e.getMessage());
		
	}
			
		
		
		
	
		
		
		
	}
	
	public static void filterAllProfessorsWithDegree(ProfDegree degree) {
		for(Person tempP : myperson) {
			if (tempP instanceof Professor) {
				Professor tempProfessor = (Professor)tempP;
				if (tempProfessor.getDegree().equals(degree))
				System.out.println(tempProfessor);
			}
		}
	}
	public static void filterAllStudentswithlargerbirthyeartlargerthan2005(int Birthyear) {
		ArrayList<Student>filteredStudents = new ArrayList<Student>();
		for(Person tempS : myperson) {
			if (tempS instanceof Student) {
				Student tempStudent = (Student)tempS;
				if (tempStudent.getBirthYear()==Birthyear) 
					System.out.println(tempStudent);
					
				}
			}
		}
	}
	
	public static void filterAllStudentswithfacultyITF(String faculty) {
		ArrayList<Student>filteredStudents = new ArrayList<Student>();
		for(Person tempS : myperson) {
			if (tempS instanceof Student){
				Student tempStudent = (Student)tempS;
				if (tempStudent.getFaculty().equals(faculty))
				System.out.println(tempStudent);
			}
		}
	}
	
	public static void filterAllFunctionForCourse(long id) {
		for (Course tempsC : allCourse) {
			if (tempsC.getProfessor().getId() == id) {
				System.out.println(tempsC);
			
			}
		}
		
	}
	
	public static void filteringFunctionsForGradeLessThan4() {
		for (Grade tempS : Grades) {
			if (tempS.getGradeValue()< 4) {
				System.out.println(tempS);
			}
		}
		
	}
	
	public static void createNewProfessor(String inputName, String inputSurname,
			ProfDegree inputDegree, String inputPassportNumber) throws Exception{
		for (Professor tempX: myperson)
		{
				
			if(tempX.getPassportNumber().equals(inputPassportNumber)) {
			Exception myEx =
					new Exception("Professor already exists");
			throw myEx;
		}
		
	}
	Professor newProfessor =
	new Professor(inputName,inputSurname, inputDegree, inputPassportNumber);
	myperson.add(newProfessor);
	
	
	
	/*public static ArrayList<Student>
		for(Professor tempS : allProfessor) {
			
			
		}
			
	}*/


}
	public static Professor getProfessorById(long inputId) throws Exception{
		if (inputId < 0 ) { 
			Exception myEx = new Exception("ahhhh must be positive you boy");
			throw myEx;
		}
		for(Professor tempS :allProfessor) {
			if (tempS.getId() == inputId) {
				return tempS;
			}
		}
		Exception myEx = new Exception("NO HERE CHECK THE NXT DOOR" + 	inputId);
			throw myEx;
	}
	

	public static void  updateProfessorByid(long inputId,
		String inputName, String inputSurname,
		ProfDegree inputDegree) throws Exception{
			Professor profForUpdate = getProfessorById(inputId);
			
			profForUpdate.setName(inputName);
			profForUpdate.setSurname(inputSurname);
			profForUpdate.setDegree(inputDegree);
		}
	
		
//	public static void deleteProfessor
		
}