import java.util.List;

public class StudentRepositoryDriver{
	public static void main(String[] args){
		Repository repo = new StudentRepository(); //construct StudentRepository

		//add multiple Student to repo's database
			repo.add(new Student("Walter White","ww@jpwynne.net",0,50,2013,100,4.0));
			repo.add(new Student("Dexter Morgan","morgand@university.gov",0,35,2013,90,3.9));
			repo.add(new Student("Tony Soprano","dimeo@mafia.com",1,47,2007,2.6));
			repo.add(new Student("Sandor Clegane","clegane@bwb.org",2,35,2019,84,3.3));
			repo.add(new Student("Din Djarin","themandalorian@outerrim.com",3,39,2022,89,3.7));
			repo.add(new Student("Elliot Alderson","robotmr@protonmail.com",4,28,2019,100,3.9));

		//find trials
			//name
				List<Student> findNames = repo.find(new ByName("tony soprano"));
				for(Student s: findNames)
					System.out.println(s);

			//email
				List<Student> findEmails = repo.find(new ByEmail("ww@jpwynne.net"));
				System.out.println(); //blank line
				for(Student s: findEmails)
					System.out.println(s);

			//id
				List<Student> findIds = repo.find(new ById(0));
				System.out.println(); //blank line
				for(Student s: findIds)
					System.out.println(s);

			//age
				List<Student> findAges = repo.find(new ByAge(40));
				System.out.println(); //blank line
				for(Student s: findAges)
					System.out.println(s);

			//year
				List<Student> findYears = repo.find(new ByYear(2019));
				System.out.println(); //blank line
				for(Student s: findYears)
					System.out.println(s);

			//grade (percentage)
				List<Student> findGradePs = repo.find(new ByGradeP(100));
				System.out.println(); //blank line
				for(Student s: findGradePs)
					System.out.println(s);

			//grade (letter)
				List<Student> findGradeLs = repo.find(new ByGradeL('A'));
				System.out.println(); //blank line
				for(Student s: findGradeLs)
					System.out.println(s);

			//gpa
				List<Student> findGPAs = repo.find(new ByGPA(3.9));
				System.out.println(); //blank line
				for(Student s: findGPAs)
					System.out.println(s);

		//getAll trial
			List<Student> listOfStudents = repo.getAll();
			System.out.println("\n"); //blank lines
			for(Student s: listOfStudents)
				System.out.println(s);

		//update trials
			//Student is in database
				repo.update(repo.find(new ById(2)).get(0),new Student("Jon Snow","north@got.com",2,27,2019,3.8));

				listOfStudents = repo.getAll();
				System.out.println("\n"); //blank lines
				for(Student s: listOfStudents)
					System.out.println(s);

			//Student is not in database
				System.out.println(); //blank line
				repo.update(new Student("Jimmy Mcgill","saulgoodman@bettercallsaul.gov",6,48,2022,3.4),new Student("Jon Snow","north@got.gov",2,27,2019,3.8));

		//remove trial
			repo.remove(new ByGPA(3.9));

			listOfStudents = repo.getAll();
			System.out.println("\n"); //blank lines
			for(Student s: listOfStudents)
				System.out.println(s);
	}
}