package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo extends Post{

	private String pictureFileName;
	private String headline;
	private ArrayList<Photo> photos;
	
	public Photo(User author, String headline, String pictureFileName) {
		super();
		this.headline = headline;
		this.pictureFileName = pictureFileName;
		this.photos = new ArrayList<Photo>();
		this.setAuthor(author);
	}
	
	public Photo(int likes, User author, ArrayList<Comment> comments, LocalDate timestamp) {
		super(likes, author, comments, timestamp);
	}

	public String getPictureFileName() {
		return pictureFileName;
	}

	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}
	
	/**
	 * lets you add a photo
	 * @param p
	 */
	public void addPhoto(Photo p) {
		photos.add(p);
	}
	
	/**
	 * lets you delete a photo
	 * @param p
	 */
	public void deletePhoto(Photo p) {
		photos.remove(p);
	}
	
	public String toString() {
		String tmp = "Photo(s): ";
		for(Photo p : photos) {
			User author = p.getAuthor();
			String headline = p.getHeadline();
			String picture = p.getPictureFileName();
			LocalDate timestamp = p.getTimestamp();
			int likes = p.getLikes();
			tmp = tmp + "\n\tVerfasst von: " + author +
					"\n\t" + headline +
					"\n\t" + picture +
					"\n\tDatum: " + timestamp +
					" | ❤️" + likes + "\n\t";
		}
		return tmp;
	}
	
}
