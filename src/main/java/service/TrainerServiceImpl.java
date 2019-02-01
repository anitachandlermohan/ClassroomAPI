package service;

import javax.inject.Inject;

import persistence.repository.TrainerRepository;

public class TrainerServiceImpl implements TrainerService{
	
	@Inject
	private TrainerRepository repo;

	public String createTrainer(String trainer) {
		return repo.createTrainer(trainer);
	}

	public String getAllTrainers() {
		return repo.getAllTrainers();
	}

	public String getTrainer(Long trainerID) {
		return repo.getTrainer(trainerID);
	
	}

	public String updateTrainer(Long trainerID, String trainer) {
		return repo.updateTrainer(trainerID, trainer);
	}

	public String deleteTrainer(Long trainerID) {
		return repo.deleteTrainer(trainerID);
	}

	public String addTrainee(Long trainerID, String trainee) {
		return repo.addTrainee(trainerID, trainee);
	}

	

}
