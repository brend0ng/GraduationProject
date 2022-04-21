interface Characteristic<E>{
	boolean equalTo(E element); }

//project-specific class implementations
	class ByName implements Characteristic<Student>{
		private String name; //field of Student "characteristic"

		//constructor
		public ByName(String name){
			this.name = name; }

		//override equalTo method with name
		public boolean equalTo(Student s){
			return s.getName().equalsIgnoreCase(name); }
	}

	class ByEmail implements Characteristic<Student>{
		private String email; //field of Student "characteristic"

		//constructor
		public ByEmail(String email){
			this.email = email; }

		//override equalTo method with email
		public boolean equalTo(Student s){
			return s.getEmail().equalsIgnoreCase(email); }
	}

	class ById implements Characteristic<Student>{
		private int id; //field of Student "characteristic"

		//constructor
		public ById(int id){
			this.id = id; }

		//override equalTo method with id
		public boolean equalTo(Student s){
			return s.getId() == id; }
	}

	class ByAge implements Characteristic<Student>{
		private int age; //field of Student "characteristic"

		//constructor
		public ByAge(int age){
			this.age = age; }

		//override equalTo method with age
		public boolean equalTo(Student s){
			return s.getAge() == age; }
	}

	class ByYear implements Characteristic<Student>{
		private int year; //field of Student "characteristic"

		//constructor
		public ByYear(int year){
			this.year = year; }

		//override equalTo method with year
		public boolean equalTo(Student s){
			return s.getYear() == year; }
	}

	class ByGradeP implements Characteristic<Student>{
		private int grade; //field of Student "characteristic"

		//constructor
		public ByGradeP(int grade){
			this.grade = grade; }

		//override equalTo method with grade
		public boolean equalTo(Student s){
			return s.getGrade() == grade; }
	}

	class ByGradeL implements Characteristic<Student>{
		private char grade; //field of Student "characteristic"

		//constructor
		public ByGradeL(char grade){
			this.grade = grade; }

		//override equalTo method with grade
		public boolean equalTo(Student s){
			return s.percentageToLetter() == grade; }
	}

	class ByGPA implements Characteristic<Student>{
		private double gpa; //field of Student "characteristic"

		//constructor
		public ByGPA(double gpa){
			this.gpa = gpa; }

		//override equalTo method with gpa
		public boolean equalTo(Student s){
			return s.getGPA() == gpa; }
	}