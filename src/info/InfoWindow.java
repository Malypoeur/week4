package info;

public class InfoWindow {
	
	public void viewInforamtion(InfoAdapter infoAdapter){
		System.out.println("......................................");
		System.out.println(infoAdapter.getTitle());
		System.out.println("......................................");
		System.out.println(infoAdapter.getContent());
		System.out.println("......................................");
	}
}
