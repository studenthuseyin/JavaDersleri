package odev2_1;

public class Course {
	
	int courseId;
	String courseInstructor;
	String courseName;
	
	
	public Course() {
		
		
	}

	
	public Course(int courseId, String courseInstructor, String courseName) {
		this.courseId = courseId;
		this.courseInstructor = courseInstructor;
		this.courseName = courseName;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseInstructor() {
		return courseInstructor;
	}


	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
	

}
