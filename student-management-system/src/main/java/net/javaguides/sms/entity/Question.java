package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "first")
public class Question extends BaseEntity {
	

	
	@Column(name = "Questionss", nullable = false)
	private String question;
	
	@Column(name = "yes", nullable = true)
	private int yes;
	
	@Column(name = "no", nullable = true)
	private int no;
	
	public Question() {
		
	}
	
	public Question(String question, int yes, int no) {
		super();
		this.question = question;
		this.yes = yes;
		this.no = no;
	
	}

	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public int getYes() {
		return yes;
	}
	public int getNo() {
		return no;
	}  

	public void setYes(int yes) {
		this.yes = yes;
	}
	public void setNo(int no) {
		this.no = no;
	}
}
