package facebook;

import java.util.ArrayList;

public class FacebookPost {
	ArrayList<FacebookComment> facebookComments = new ArrayList<FacebookComment>();
	
	private String issue;
	
	public FacebookPost(String issue){
		this.issue = issue;
	}
	
	public String toString(){
		String result =  "";
		for(FacebookComment comment : facebookComments){
			result += comment.toString() + "\n";
		}
		return result;
	}
	
	public int getFacebookCommentSize(){
		return facebookComments.size();
	}
	
	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public void addComment(FacebookComment comment){
		facebookComments.add(comment);
	}
	
	public void removeComment(FacebookComment comment){
		facebookComments.remove(comment);
	}
	
	public int getCommentSize(){
		return facebookComments.size();
	}

}
