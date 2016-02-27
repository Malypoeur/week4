package info;

public class Course extends InfoAdapter{
	private String title;
	private String subTitle;
	private String instructor;
	private int nrOfStudent;
	
	public Course(String title, String subTitle, String instructor, int nrOfStudent){
		this.title = title;
		this.subTitle = subTitle;
		this.instructor = instructor;
		this.nrOfStudent = nrOfStudent;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return subTitle + "\ninstructor: " + instructor + "\nNumber Of Student: " + nrOfStudent;
	}
	
}
