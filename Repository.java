import java.util.List;
import java.util.ArrayList; //project-specific import

interface Repository<E>{
	void add(E element); //adds E to database

	/*finds a list of elements with a given detail
	 *@param c - an element of type Characteristic
	 *@return List<E> of E when c.equalTo(E) */
	List<E> find(Characteristic c);

	List<E> getAll(); //@return database as List<E>

	/*edits a specific element
	 *@param iE - initial element
	 		 nE - new (updated) element */
	void update(E iE, E nE);

	/*removes all E from database when c.equalTo(E)
	*@param c - an element of type Characteristic */
	void remove(Characteristic c);
}

//project-specific class implementation
class StudentRepository implements Repository<Student>{
	private List<Student> database; //acting database for E; *project-specific (would be seperate class if multiple repositories for SchoolMembers - i.e. Students, Teachers, OtherFaculty)

	//constructor
	public StudentRepository(){
		database = new ArrayList<Student>(); }

	//override add method with Student
	public void add(Student s){
		database.add(s); }

	//override find method with Student
	public List<Student> find(Characteristic c){
		List<Student> listOfStudents = new ArrayList<Student>(); //holds Student objects with Characteristic

		for(Student s: database)
			if(c.equalTo(s))
				listOfStudents.add(s);

		return listOfStudents;
	}

	//override getAll method with Student
	public List<Student> getAll(){
		return database; }

	//override update method with Student
	public void update(Student iS,Student nS){
		if(database.contains(iS))
			database.set(database.indexOf(iS),nS);
		else
			System.out.println("\tERROR - The given student is not in the database.");
	}

	//override remove method with Student
	public void remove(Characteristic c){
		for(int i=0; i<database.size(); i++)
			if(c.equalTo(database.get(i)))
				database.remove(database.get(i));
	}
}