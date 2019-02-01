package service;

public interface TrainerService {
	public String createTrainer(String trainer);
	public String getAllTrainers();
	public String getTrainer(Long trainerID);
	public String updateTrainer(Long trainerID, String trainer);
	public String deleteTrainer(Long trainerID);
	public String addTrainee(Long trainerID, String trainee);
}
