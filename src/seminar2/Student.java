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
	public String getCountry() {
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
	public void setSurname(String inputSurname) {
		Surname = surname;
	}
	public void setFaculty(String inputFaculty) {
		Faculty = faculty;
	}

}
