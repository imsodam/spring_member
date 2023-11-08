package net.slipp.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "writer_id", foreignKey = @ForeignKey(name = "fk_question_writer"))
	private User writer;
	private String title;
	private String contents;
	private LocalDateTime createDate;

	public Question() {
	}

	public Question(User writer, String title, String contents) {
		// super();
		this.writer = writer;
		this.setTitle(title);
		this.setContents(contents);
		this.createDate = LocalDateTime.now();
		System.out.println("****" + title);
	}

	public String getFormattedCreateDate() {
		if (createDate == null) {
			return "";
		}
		return createDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
	}

	public void update(String title, String contents) {
		this.setTitle(title);
		this.setContents(contents);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}
