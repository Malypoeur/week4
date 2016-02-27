package facebook;

import java.util.ArrayList;

public class FacebookComment {
	ArrayList<FacebookComment> facebookComments = new ArrayList<FacebookComment>();
	private String comment;
	private String owner;
	
	public FacebookComment(String comment, String owner){
		this.comment = comment;
		this.owner = owner;
	}
	
	public String toString(){
		String result = "--> " + owner + " : " + comment;
		for(FacebookComment comment : facebookComments){
			result += "\n\t" + comment.owner + " : " + comment.comment + "";
		}
		return result;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
