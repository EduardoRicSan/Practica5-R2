package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="exams")
public class Exam {
	@Id @GeneratedValue
	private Long id;
	@Column(length = 50)
	private String name;
	@Column(length = 50)
	private String description;
	@Column(length = 50)
	private String minimumErrors;
	@Column(length = 50)
	private String duration;
	@Column(length = 50)
	private String examTake;
	@Column (length = 50)
	private String questionDef;
	public Exam( String name, String description, String minimumErrors, String duration, String examTake,
			String questionDef) {
		super();
		this.name = name;
		this.description = description;
		this.minimumErrors = minimumErrors;
		this.duration = duration;
		this.examTake = examTake;
		this.questionDef = questionDef;
	}
	
	public Exam(){
		this("","","","","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMinimumErrors() {
		return minimumErrors;
	}

	public void setMinimumErrors(String minimumErrors) {
		this.minimumErrors = minimumErrors;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getExamTake() {
		return examTake;
	}

	public void setExamTake(String examTake) {
		this.examTake = examTake;
	}

	public String getQuestionDef() {
		return questionDef;
	}

	public void setQuestionDef(String questionDef) {
		this.questionDef = questionDef;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + ", description=" + description + ", minimumErrors=" + minimumErrors
				+ ", duration=" + duration + ", examTake=" + examTake + ", questionDef=" + questionDef + "]";
	}
	
	
	

}
