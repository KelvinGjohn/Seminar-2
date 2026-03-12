package seminar2;

public class Student {
	private String matriculaNumber;
	private String name;
	private String surname;
	private String faculty;
	private int birthYear;
	private Country country;
	private String passportNumber;
	
	public String getMatriculation() {
		return matriculaNumber;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getFaculty() {
		return faculty;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public Country getCountry() {
		return country;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	//[A-Z]{1}[a-z]{3,7}([ ]{1}[A-Z]{1}[a-z]{3,7})?
	//Setters
	public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty()) 
				&& (inputName.matches("/[L]{1}[V]{1}[0-9]{2}[A-Z]{4}[0-9]{13}? ")) ) {
		name = inputName;
	}
	else
	{
		name = "Unknown";
	}
	}
	public void setSurname(String inputSurname) {
		if( (inputSurname != null) && (!inputSurname.isEmpty()) 
			&& (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			surname = inputSurname;
		}
		else
		{
			surname = "Unknown";
		}
		
	}
	
	public void setFaculty(String inputFaculty) {
		if((inputFaculty != null) && (!inputFaculty.isEmpty())
				&& (inputFaculty.matches("[A-Za-z ]{3,100}"))) {
			faculty = inputFaculty;
		}
		else
		{
			faculty = "Unknown";
		}
	}
	
	//no need to check !=null because this is primitive data type
	public void setBirthYear(int inputBirthYear) {
		if((inputBirthYear >= 1950) && (inputBirthYear <= 2020)) {
			birthYear = inputBirthYear;
		}
		else
		{
			birthYear = 2008;
		}
	}
	//enums also are referenced data type - need to check != null
	public void setCountry(Country inputCountry) {
		if(inputCountry != null) {
			country = inputCountry;
		}
		else
		{
			country = Country.unknown;
		}
	}
	
	public void setPassportNumber(String inputPassportNumber) {
		if( (inputPassportNumber != null) && (!inputPassportNumber.isEmpty()
				&& (inputPassportNumber.matches("[A-Z]{2}[0-9]{6}")))) {
			passportNumber = inputPassportNumber;
		}
		else
		{
			passportNumber = "Unknown";
		}
	}
	
	public Student() {
		setMatriculaNumber("AB123456");
		setName("Hello");
		setSurname('Hi');
		setFaculty('2ITF');
		setBirthYear(2035);
		setCountry(Country.Germany);
		setPassportNumber('GU123456');
	}
	
	public Student(String inputMatriciulaNumber, String inputName,) {
		
	}
	public String toString() {
		String result = name + '' + surname + '(' + matriculation + ')' + faculty + ',' + birthyear + '[' + country + '],
				
	}
	
	public Student (String inputMatriculationNumber, String inputName,
			String inputSurname, String inputFaculty,
			int inputBirthYear, Country inputCountry,
			String inputPassportNumber) {
			
			setMatriculaNumber(inputMatriculationNumber);
			setName(inputName);
			setSurname(inputSurname);
			setFaculty(inputFaculty);
			setBirthYear(inputBirthYear);
			setCountry(inputCountry);
			setPassportNumber(inputPassportNumber);
			
	}
			
	
}
