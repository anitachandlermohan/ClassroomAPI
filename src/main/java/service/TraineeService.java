package service;

public interface TraineeService {
	public String createTrainee(String trainee);
	public String getAllTrainees();
	public String getTrainee(Long traineeID);
	public String updateTrainee(Long traineeID, String trainee);
	public String deleteTrainee(Long traineeID);

}
