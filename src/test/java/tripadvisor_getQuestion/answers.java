package tripadvisor_getQuestion;

public class answers 
{
	private boolean is_owner;
	private member member;
	private String submitted;
	private int up_votes;
	private boolean is_reviewer;
	private String content_language;
	private int id;
	private String answer;
	public boolean isIs_owner() {
		return is_owner;
	}
	public void setIs_owner(boolean is_owner) {
		this.is_owner = is_owner;
	}
	public member getMember() {
		return member;
	}
	public void setMember(member member) {
		this.member = member;
	}
	public String getSubmitted() {
		return submitted;
	}
	public void setSubmitted(String submitted) {
		this.submitted = submitted;
	}
	public int getUp_votes() {
		return up_votes;
	}
	public void setUp_votes(int up_votes) {
		this.up_votes = up_votes;
	}
	public boolean isIs_reviewer() {
		return is_reviewer;
	}
	public void setIs_reviewer(boolean is_reviewer) {
		this.is_reviewer = is_reviewer;
	}
	public String getContent_language() {
		return content_language;
	}
	public void setContent_language(String content_language) {
		this.content_language = content_language;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
