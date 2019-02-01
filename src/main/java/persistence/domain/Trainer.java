package persistence.domain;

import java.util.Collection;

import javax.persistence.*;

public class Trainer {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long trainerID;
	@Column
	private String trainerName;
	
	@OneToMany(mappedBy="trainer_trainees")
	private Collection<Trainee> trainees;
	
	
	public Trainer() {
		
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
