package info;

public class Course2 {
	private String title;
	private String subTitle;
	private String instructor;
	private int nrOfStudent;
	
	public Course2(String title, String subTitle, String instructor, int nrOfStudent){
		this.title = title;
		this.subTitle = subTitle;
		this.instructor = instructor;
		this.nrOfStudent = nrOfStudent;
	}
	
	public String getTitle(){
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getNrOfStudent() {
		return nrOfStudent;
	}

	public void setNrOfStudent(int nrOfStudent) {
		this.nrOfStudent = nrOfStudent;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
