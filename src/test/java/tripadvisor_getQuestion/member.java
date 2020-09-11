package tripadvisor_getQuestion;

public class member 
{
	private String display_name;
	private String location_display_name;
	private String avatar_url;
	private int published_review_count;
	private String user_id;
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getLocation_display_name() {
		return location_display_name;
	}
	public void setLocation_display_name(String location_display_name) {
		this.location_display_name = location_display_name;
	}
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public int getPublished_review_count() {
		return published_review_count;
	}
	public void setPublished_review_count(int published_review_count) {
		this.published_review_count = published_review_count;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
