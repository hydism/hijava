package hijava.practice;

public class Score {
	private String subject;
	private int score;

	public Score() {}

	public Score(String subject) {
		this.setSubject(subject);
	}
	
	public Score(String subject, int score) {
		this.setSubject(subject);
		this.setScore(score);
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Score [subject=" + subject + ", score=" + score + "]";
	}
}