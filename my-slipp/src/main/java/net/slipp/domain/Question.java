package net.slipp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue
	private Long id;

	private String writer;

	private String title;

	private String contents;

	public Question() {
		
	}
	
	
	public Question(String writer, String title, String contents) {
		super();
		this.writer = writer;
		this.title = title;
		this.contents = contents;
	}

}
