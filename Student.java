public class Student{
	//field declarations
		private String name; //name
		private String email; //school email address
		private int id; //school id
		private int age; //age
		private int year; //school year
		private int grade = -1; //class percentage if database is for specific class
		private double gpa; //grade point average

	//constructors
		public Student(){} //default

		public Student(String name,String email,int id,int age,int year,double gpa){ //overloading with name, email, id, age, year, and gpa fields
			this.name = name;
			this.email = email;
			this.id = id;
			this.age = age;
			this.year = year;
			this.gpa = gpa;
		}

		public Student(String name,String email,int id,int age,int year,int grade,double gpa){ //overloading with all fields
			this.name = name;
			this.email = email;
			this.id = id;
			this.age = age;
			this.year = year;
			this.grade = grade;
			this.gpa = gpa;
		}

	//accessor methods
		public String getName(){ //@return name
			return name; }

		public String getEmail(){ //@return email
			return email; }

		public int getId(){ //@return id
			return id; }

		public int getAge(){ //@return age
			return age; }

		public int getYear(){ //@return year
			return year; }

		public int getGrade(){ //@return grade
			return grade; }

		public double getGPA(){ //@return gpa
			return gpa; }

	//mutator methods
		public void setName(String name){ //precondition: @param != null && @param.trim() != ""
			this.name = name; }

		public void setEmail(String email){ //precondition: @param != null && @param.trim() != ""
			this.email = email; }

		public void setId(int id){
			this.id = id; }

		public void setAge(int age){ //precondition:@param > 0
			this.age = age; }

		public void setYear(int year){ //precondition: @param > 0
			this.year = year; }

		public void setGrade(int grade){ //precondition: @param >= 0 && @param <= 100
			this.grade = grade; }

		public void setGPA(double gpa){ //precondition: @param >= 0
			this.gpa = gpa;}

	/*converts percentage grade to letter grade
	 *@return 'A' - 89 < grade < 101; 'B' - 79 < grade < 90; 'C' - 69 < grade < 80; 'D' - 59 < grade < 70; 'F' - grade < 60; 'N' - no grade
	 *precondition: grade >= 0 && grade <= 100 */
	public char percentageToLetter(){
		if(grade == -1)
			return 'N';

		if(grade >= 70 && grade <= 79)
			return 'C';
		else if(grade > 79){
			if(grade >= 80 && grade <= 89)
				return 'B';
			else
				return 'A';
		}
		else if(grade < 60)
			return 'F';
		else
			return 'D';
	}

	//toString
	public String toString(){
		if(grade == -1)
			return name+"\t"+email+"\t\t"+id+"\t"+age+"\t"+year+"\t"+gpa;
		else
			return name+"\t"+email+"\t\t"+id+"\t"+age+"\t"+year+"\t"+grade+"\t"+gpa;
	}
}