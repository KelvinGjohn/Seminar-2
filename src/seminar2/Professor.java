package seminar2;

public class Professor extends Person {
	//1. variables
	private long id;
	private ProfDegree degree;

	
	//helper variable and no need to create set or get for it
	private static long counter = 0;
	//2. getters
	public long getId() {
		return id;
	}
	
	public ProfDegree getDegree() {
		return degree;
	}
	
	
	//3. setters
	public void setId() {
		id = counter;
		counter++;
	}

	
	public void setDegree(ProfDegree inputDegree) {
		if(inputDegree!=null) {
			degree = inputDegree;
		}
		else
		{
			degree = ProfDegree.unknown;
		}
	}
	
	
	
	//4. no args constructor
	public Professor() {
		super("Karina","Skirmante","AS651873645" );
		setId();
		//setName("Karina");
		//setSurname("Skirmante");
		setDegree(ProfDegree.master);
		//setPassportNumber("AS651873645");
	}
	
	
	//5. args constructor
	public Professor(
			String inputNameString,String inputSurname,ProfDegree inputDegree, String inputPassport) {
		super(inputNameString, inputSurname, inputPassport);
		setId();
		//setName(inputName);
		//setSurname(inputSurname);
		setDegree(inputDegree);
		//setPassportNumber(inputpassportNumber);
	}
	//6. toString
	public String toString() {
		//0: Karina Skirmante (master)
		String result = id + ": " + name + " " + surname +
				" (" + degree + ")" + passportNumber;
		return result;
	}
	
	
}