package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	
	private LocalDateTime moment;
	private String title;
	private String content;
	List<Comment> comments = new ArrayList<>();
	private Integer likes;
	
	
	
	
	
	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComment (Comment comment) {
		this.comments.add(comment);
	}
	
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(moment + "\n");
		sb.append("Comments:\n");
		comments.forEach(c -> sb.append(c.getContent() + "\n"));
		return sb.toString();
	}
	
}
