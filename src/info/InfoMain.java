package info;

public class InfoMain {
	private static Course2 course2 = new Course2("Software Development", "Instructed at CKCC, cooperated with FE", "Malypoeur", 16);
	public static void displayCourse(){
		InfoWindow infoWindow = new InfoWindow();
		infoWindow.viewInforamtion(new Course("Software Development", "Instructed at CKCC, cooperated with FE", "Malypoeur", 16));
		infoWindow.viewInforamtion(new InfoAdapter() {
			
			@Override
			public String getTitle() {
				// TODO Auto-generated method stub
				return course2.getTitle();
			}
			
			@Override
			public String getContent() {
				// TODO Auto-generated method stub
				return course2.getSubTitle();
			}
		});

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayCourse();
	}
}
