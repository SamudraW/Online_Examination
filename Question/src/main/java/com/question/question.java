package com.question;

public class question {
	
	private int QID;
	private String PaperID;
	private String SubjectCode;
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String Answer;
	
	
	public question(int qID2, String paperID2, String subjectCode2, String question2, String option12, String option22,
			String option32, String option42, String answer2) {
		QID = qID2;
		PaperID = paperID2;
		SubjectCode = subjectCode2;
		Question = question2;
		Option1 = option12;
		Option2 = option22;
		Option3 = option32;
		Option4 = option42;
		Answer = answer2;
	}

	public int getQID() {
		return QID;
	}

	public String getSubjectCode() {
		return SubjectCode;
	}
	public String getPaperID() {
		return PaperID;
	}
	public String getQuestion() {
		return Question;
	}
	public String getOption1() {
		return Option1;
	}
	public String getOption2() {
		return Option2;
	}
	public String getOption3() {
		return Option3;
	}
	public String getOption4() {
		return Option4;
	}
	public String getAnswer() {
		return Answer;
	}
	
	
	

}
