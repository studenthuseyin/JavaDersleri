package odev3_2;

public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "DEMİROĞ";
		instructor1.giveCourse = "Java + React Kursu";
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.firstName = "Mustafa";
		instructor2.lastName = "KEREM";
		instructor2.giveCourse = "Javascript Kursu";
			
		
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Student";
		student1.lastName = "HÜSEYİN";
		student1.getCourse = "Java + React Kursu";
		Student student2 = new Student();
		student2.id = 2;
		student2.firstName = "Student";
		student2.lastName = "HASAN";
		student2.getCourse = "C# + Angular Kursu";
			
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor1);
		instructorManager.List(instructor1);
		instructorManager.Delete(instructor2);
		instructorManager.BestInstructor(instructor1);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student1);
		studentManager.List(student2);
		studentManager.Delete(student1);
		studentManager.BestStudent(student1);
		

	}

}
