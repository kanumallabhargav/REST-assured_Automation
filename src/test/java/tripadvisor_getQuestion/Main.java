package tripadvisor_getQuestion;

import java.util.List;

public class Main 
{
	private boolean has_more_answers;
	private List<answers> answers; 


	public List<answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<answers> answers) {
		this.answers = answers;
	}

	public boolean isHas_more_answers() {
		return has_more_answers;
	}

	public void setHas_more_answers(boolean has_more_answers) {
		this.has_more_answers = has_more_answers;
	}
	
}
