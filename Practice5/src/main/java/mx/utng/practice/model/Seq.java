package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="seqs")
public class Seq {
	@Id @GeneratedValue
	private Long id;
	@Column(length = 50)
	private String display;
	@Column(length = 50)
	private String description;
	@Column(length = 50)
	private String seq;
	@Column(length = 50)
	private String seqLen;
	@Column(length = 50)
	private String checkeum;
	@Column (length = 50)
	private String molType;
	@Column (length = 50)
	private String timeStamp;
	public Seq(String display, String description, String seq, String seqLen, String checkeum, String molType,
			String timeStamp) {
		super();
		this.display = display;
		this.description = description;
		this.seq = seq;
		this.seqLen = seqLen;
		this.checkeum = checkeum;
		this.molType = molType;
		this.timeStamp = timeStamp;
	}
	
	public Seq(){
		this("","","","","","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getSeqLen() {
		return seqLen;
	}

	public void setSeqLen(String seqLen) {
		this.seqLen = seqLen;
	}

	public String getCheckeum() {
		return checkeum;
	}

	public void setCheckeum(String checkeum) {
		this.checkeum = checkeum;
	}

	public String getMolType() {
		return molType;
	}

	public void setMolType(String molType) {
		this.molType = molType;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Seq [id=" + id + ", display=" + display + ", description=" + description + ", seq=" + seq + ", seqLen="
				+ seqLen + ", checkeum=" + checkeum + ", molType=" + molType + ", timeStamp=" + timeStamp + "]";
	}
	
}
