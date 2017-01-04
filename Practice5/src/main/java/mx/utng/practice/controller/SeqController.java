package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Seq;
import mx.utng.practice.repository.SeqRepository;



@Named
@ViewScoped
public class SeqController {
	@Autowired
	private SeqRepository seqRepository;
		
		
		
		private List<Seq> seqs;
		
		private Seq seq = new Seq();
		
		private boolean editMode = false;
		

		@PostConstruct
		public void init(){
			setSeqs(seqRepository.findAll());
		}
		
		public void save(){
			seqRepository.save(seq);
			if(!editMode){
				getSeqs().add(seq);
			}
			seq = new Seq();
			setEditMode(false);
		}
		
		public void delete(Seq seq){
			seqRepository.delete(seq);
			seqs.remove(seq);
		}
		public void update(Seq seq){
			setSeq(seq);
			setEditMode(true);
		}
		public void cancel(){
			seq = new Seq();
			setEditMode(false);
		}
		
		public Seq getSeq() {
			return seq;
		}
		public void setSeq(Seq seq) {
			this.seq = seq;
		}
		public List<Seq> getSeqs() {
			return seqs;
		}
		public void setSeqs(List<Seq> seqs) {
			this.seqs = seqs;
		}
		public boolean isEditMode(){
			return editMode;
		}
		public void setEditMode(boolean editMode){
			this.editMode = editMode;
		}
}
