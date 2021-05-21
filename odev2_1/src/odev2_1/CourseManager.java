package odev2_1;

public class CourseManager {
	
	public void addToCourse(Course course) {
		System.out.println("Kurs ekleme işlemi başarıyla gerçekleştirildi...");
		System.out.println("Eklenen kurs: " + course.courseName);
	}
	
	
	public void deleteToCourse(Course course) {
		System.out.println("Kurs silme işlemi başarıyla gerçekleştirildi...");
		System.out.println("Silinen kurs: " + course.courseName);
	}

}
