package odev2_1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Engin DEMİROĞ", "Java + React kampı");
		Course course2 = new Course(2, "Engin DEMİROĞ", "C# + Angular kampı");
		
		Course [] courses = {course1, course2};
		
		for(Course course: courses) {
			System.out.println(course.courseId+" " + course.courseInstructor+" " + course.courseName);
			}
		
		
		Category category1 = new Category(1,"Back End Programlama");
		Category category2 = new Category(2, "Front End Programlama");
		
		Category[] categories = {category1, category2};
		
		for(Category category: categories) {
			System.out.println(category.categoryId+" "+ category.categoryName);
		}
		
		

		Instructor instructor1 = new Instructor(1,"Engin DEMİROĞ");
		Instructor instructor2 = new Instructor(2,"Engin DEMİROĞ");
		
		Instructor[] instructors = {instructor1, instructor2};
		
		for(Instructor instructor: instructors) {
			System.out.println(instructor.instructorId+" "+ instructor.instructorName);
		}

	
		CourseManager coursemanager = new CourseManager();
		coursemanager.addToCourse(course1);
		coursemanager.addToCourse(course2);
		coursemanager.deleteToCourse(course1);
		coursemanager.deleteToCourse(course2);
		
	

		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}



















