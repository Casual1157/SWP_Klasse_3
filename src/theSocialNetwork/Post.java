package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Post {

	private int likes;
	private User author;
	private ArrayList<Comment> comments;
	private LocalDate timestamp;
	
	public Post() {
		this.timestamp = LocalDate.now();
		this.comments = new ArrayList<Comment>();
	}
	
	public Post(int likes, User author, ArrayList<Comment> comments, LocalDate timestamp) {
		super();
		this.likes = likes;
		this.author = author;
		this.comments = new ArrayList<Comment>();
		this.timestamp = LocalDate.now();
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Adds a comment to the desired post.
	 * @param p
	 * @param c
	 */
	public void addComment(Post p, Comment c) {
		p.comments.add(c);
	}
	
	/**
	 * Deletes the desired comment.
	 * @param p
	 * @param c
	 */
	public void deleteComment(Post p, Comment c) {
		if(p.getComments().contains(c)) {
			comments.remove(c);
		}else {
			System.err.println("Kommentar nicht vorhanden!");
		}
	}
	/**
	 * prints out every comment
	 * @return
	 */
	public String printComments() {
		String tmp = "Comments: ";
		for(Comment c : comments) {
			User author = c.getAuthor();
			String text = c.getText();
			tmp = tmp + "\n\tVerfasst von: " + author.toString() +
					"\n\t" + text + "\n\t";
		}
		System.out.println(tmp);
		return tmp;
	}
	
	
}
