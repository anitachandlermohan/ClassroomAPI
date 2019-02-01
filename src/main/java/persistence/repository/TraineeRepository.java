package persistence.repository;

public interface TraineeRepository {
	String getAllTrainees();
	String getTrainee(Long traineeID);
	String createTrainee(String trainee);
	String updateTrainee(Long traineeID, String trainee);
	String deleteTrainee(Long traineeID);

}
