package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Exam;

import mx.utng.practice.repository.ExamRepository;



@Named
@ViewScoped
public class ExamController {
	@Autowired
private ExamRepository examRepository;
	
	
	
	private List<Exam> exams;
	
	private Exam exam = new Exam();
	
	private boolean editMode = false;
	
	
	@PostConstruct
	public void init(){
		setExams(examRepository.findAll());
	}
	
	public void save(){
		examRepository.save(exam);
		if(!editMode){
			getExams().add(exam);
		}
		exam = new Exam();
		setEditMode(false);
	}
	
	public void delete(Exam exam){
		examRepository.delete(exam);
		exams.remove(exam);
	}
	public void update(Exam exam){
		setExam(exam);
		setEditMode(true);
	}
	public void cancel(){
		exam = new Exam();
		setEditMode(false);
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public List<Exam> getExams() {
		return exams;
	}
	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}
	public boolean isEditMode(){
		return editMode;
	}
	public void setEditMode(boolean editMode){
		this.editMode = editMode;
	}
		
}
