package persistence.domain;

import java.util.Collection;
import java.util.LinkedHashSet;

import javax.persistence.*;
@Entity
public class Trainer {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "trainerID")
	private Long trainerID;
	@Column
	private String trainerName;
	
	@OneToMany(mappedBy="trainerID", fetch = FetchType.EAGER)
	private Collection<Trainee> trainees = new LinkedHashSet<Trainee>();
	
	
	public Trainer() {
		
	}
	public Trainer(String trainerName) {
		this.trainerName = trainerName;
	}
	
	
	
	public String getTrainerName() {
		return trainerName;
	}
	
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	public Long getTrainerID(){
		return trainerID;
	}
	
	public void setTrainerID(Long trainerID) {
		this.trainerID = trainerID;
	}
	
	public Collection<Trainee> getTrainees(){
		return trainees;
	}
	
	public void setTrainees(Collection<Trainee> trainees) {
		this.trainees = trainees;
	}
	
	

}
