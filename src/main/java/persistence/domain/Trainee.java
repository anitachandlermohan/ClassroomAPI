package persistence.domain;

import javax.persistence.*;
public class Trainee {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "traineeID")
	private Long traineeID;
	
	@Column
	private String traineeName;
	
	@ManyToOne
	@JoinColumn(name = "trainerID", nullable = false)
	private Trainer trainer;
	
	
	public Trainee() {
		
	}
	
	public Trainee(String traineeName, Trainer trainer) {
		this.traineeName = traineeName;
		this.trainer = trainer;
	}
	
	public String getTraineeName() {
		return traineeName;
	}
	
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	public Trainer getTrainer() {
		return trainer;
	}
	
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	public Long getTraineeID() {
		return traineeID;
	}
	
	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}
}


