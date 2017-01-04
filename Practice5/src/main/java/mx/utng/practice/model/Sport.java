package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="sports")
public class Sport {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String origin;
	public Sport(String name, String origin) {
		super();
		this.name = name;
		this.origin = origin;
	}
	public Sport(){
		this("","");
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
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Sport [id=" + id + ", name=" + name + ", origin=" + origin + "]";
	}
	
	

}
