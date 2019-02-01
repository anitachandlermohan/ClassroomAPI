package persistence.domain;

import javax.persistence.*;
@Entity
public class Trainee {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "traineeID")
	private Long traineeID;
	
	@Column
	private String traineeName;
	
	private Long trainerID;
	
	
	public Trainee() {
		
	}
	
	public Trainee(String traineeName) {
		this.traineeName = traineeName;
		
	}
	
	public String getTraineeName() {
		return traineeName;
	}
	
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	public Long getTrainer() {
		return trainerID;
	}
	
	public void setTrainer( Long trainerID) {
		this.trainerID = trainerID;
	}
	
	public Long getTraineeID() {
		return traineeID;
	}
	
	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}
}


