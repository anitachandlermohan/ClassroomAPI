package persistence.domain;

import java.util.Collection;

import javax.persistence.*;
@Entity
public class Trainer {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "trainerID")
	private Long trainerID;
	@Column
	private String trainerName;
	
	@OneToMany(mappedBy="trainer", fetch = FetchType.EAGER)
	private Collection<Trainee> trainees;
	
	
	public Trainer() {
		
	}
	public Trainer(String trainerName) {
		this.trainerName = trainerName;
	}
	public Trainer(String trainerName, Collection<Trainee> trainees) {
		this.trainerName = trainerName;
		this.trainees = trainees;
		
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
