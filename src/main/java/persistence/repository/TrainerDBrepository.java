package persistence.repository;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;
import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.*;
import javax.transaction.Transactional;

import persistence.domain.Trainee;
import persistence.domain.Trainer;
import util.JSONUtil;



@Transactional(SUPPORTS)
@Default
public class TrainerDBrepository implements TrainerRepository{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil util;
	public String getAllTrainers() {
		TypedQuery<Trainer> query = em.createQuery("SELECT t FROM Trainer t", Trainer.class);
		List<Trainer> trainers = (List<Trainer>) query.getResultList();
		return util.getJSONForObject(trainers);
	}

	public String getTrainer(Long trainerID) {
		Trainer trainer = em.find(Trainer.class, trainerID);
		return util.getJSONForObject(trainer);
	}
	@Transactional(REQUIRED)
	public String createTrainer(String trainer) {
		Trainer trainerObject = util.getObjectForJSON(trainer, Trainer.class);
		em.persist(trainerObject);
		return "{\"message\" : \"trainer added\"}";
	}
	@Transactional(REQUIRED)
	public String updateTrainer(Long trainerID, String trainer) {
		Trainer trainerDB = em.find(Trainer.class,trainerID);
		em.remove(trainerDB);
		Trainer trainerUpdate = util.getObjectForJSON(trainer, Trainer.class);
		em.persist(trainerUpdate);
		return "{\"message\" : \"trainer updated\"}";
		
	}
	@Transactional(REQUIRED)
	public String deleteTrainer(Long trainerID) {
		Trainer trainer = em.find(Trainer.class, trainerID);
		em.remove(trainer);
		return "{\"message\" : \"trainer deleted\"}";
		
		
	}
	@Transactional(REQUIRED)
	public String addTrainee(Long trainerID, String trainee) {
		Trainer trainer = em.find(Trainer.class, trainerID);
		Trainee traineeObject = util.getObjectForJSON(trainee, Trainee.class);
		em.persist(traineeObject);
		trainer.getTrainees().add(traineeObject);
		return "{\"message\" : \"trainee added to trainee\"}";
	}

}
