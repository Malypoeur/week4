package facebook;

import info.InfoAdapter;
import info.InfoWindow;

public class FacebookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookPost post = new FacebookPost("Software Development Today");
		FacebookComment firstComment = new FacebookComment("What's it about today?", "Chenda");
		
		firstComment.addComment(new FacebookComment("Design Patterns", "Navy"));
		firstComment.addComment(new FacebookComment("Thank you", "Chenda"));
		
		FacebookComment secondComment = new FacebookComment("Is it fun?", "Netra");
		secondComment.addComment(new FacebookComment("not really!...", "Vatey"));
		secondComment.addComment(new FacebookComment("ermmm :-(...", "Netra"));
		
		post.addComment(firstComment);
		post.addComment(secondComment);
		
		InfoWindow myDisplayWindow = new InfoWindow();
		myDisplayWindow.viewInforamtion(new InfoAdapter() {
			
			@Override
			public String getTitle() {
				// TODO Auto-generated method stub
				return post.getIssue();
			}
			
			@Override
			public String getContent() {
				// TODO Auto-generated method stub
				return post.toString();
			}
		});
	}

}
