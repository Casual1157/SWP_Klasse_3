package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Post> posts;
	
	public NewsFeed() {
		this.posts = new ArrayList<Post>();
	}

	public NewsFeed(ArrayList<Post> posts) {
		super();
		this.posts = posts;
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	
	/**
	 * lets you add posts
	 * @param p
	 */
	public void addPost(Post p) {
		posts.add(p);
	}

	/**
	 * lets you remove posts
	 * @param p
	 */
	public void deletePost(Post p) {
		posts.remove(p);
	}

	/**
	 * Prints out the news feed
	 */
	public void printNewsFeed() {
		for(Post p : posts) {
			System.out.println(p.toString());
		}
	}
	
	/**
	 * Searches the news feed for posts of a certain user
	 * @param user
	 */
	public void searchNewsFeed(User user) {
		boolean foundResult = false;
		for(Post p : posts) {
			if(p.getAuthor().equals(user)) {
				System.out.println(p.toString());
				foundResult = true;
			}
		}
		if(foundResult == false) {
			System.out.println("Keine Ergebnisse gefunden...");
		}
	}
	
	/**
	 * Searches the news feed for photos of a certain user
	 * @param user
	 */
	public void searchPhotos(User user) {
		boolean foundResult = false;
		for(Post p : posts) {
			if(p instanceof Photo) {
				if(p.getAuthor().equals(user)) {
					System.out.println(p.toString());
					foundResult = true;
				}
			}
		}
		if(foundResult == false) {
			System.out.println("Keine Ergebnisse gefunden...");
		}
	}
	
	/**
	 * Searches the news feed for photos of a certain user
	 * @param user
	 */
	public void searchMessages(User user) {
		boolean foundResult = false;
		for(Post p : posts) {
			if(p instanceof Message) {
				if(p.getAuthor().equals(user)) {
					System.out.println(p.toString());
					foundResult = true;
				}
			}
		}
		if(foundResult == false) {
			System.out.println("Keine Ergebnisse gefunden...");
		}
	}
}
