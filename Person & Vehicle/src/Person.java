
public class Person {

	public String FirstName;
	public String LastName;
	public int PersonID;
	
	
	public Person(String FirstName, String LastName, int PersinID){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.PersonID = PersonID;
	}
	
	
	public Person (){
	}
	
	
	public String getFirstName (){
		return FirstName;
	}
	
	public void setFirstName (String FirstName){
		this.FirstName = FirstName;
	}
	
	public String getLastName (){
		return LastName;
	}
	
	public void setLastName (String LastName){
		this.LastName = LastName;
	}
	
	public int getPersonID(){
		return PersonID;
	}
	
	public void setPersonID (int PersonID){
		this.PersonID = PersonID;
	}
	
	
	
}
