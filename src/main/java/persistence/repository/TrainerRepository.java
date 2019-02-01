package persistence.repository;

public interface TrainerRepository {
	String getAllTrainers();
	String getTrainer(Long trainerID);
	String createTrainer(String trainer);
	String updateTrainer(Long trainerID, String trainer);
	String deleteTrainer(Long trainerID);
	String addTrainee(Long trainerID, String trainee);

}
