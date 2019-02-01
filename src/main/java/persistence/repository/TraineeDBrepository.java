package persistence.repository;
import javax.transaction.Transactional;

import persistence.domain.Trainee;
import util.JSONUtil;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.*;
import javax.transaction.Transactional;
import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;


@Default
@Transactional(SUPPORTS)
public class TraineeDBrepository implements TraineeRepository{
	
	
	@Inject
	private JSONUtil util;
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	public String getAllTrainees() {
		TypedQuery<Trainee> query = em.createQuery("SELECT t from Trainee t", Trainee.class);
		List<Trainee> trainees = query.getResultList();
		return util.getJSONForObject(trainees);
	}

	public String getTrainee(Long traineeID) {
		Trainee trainee = em.find(Trainee.class, traineeID);
		return util.getJSONForObject(trainee);
	}
	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee traineeObject = util.getObjectForJSON(trainee, Trainee.class);
		em.persist(traineeObject);
		return "{\"message\": \"trainee added\"}";
	}
	@Transactional(REQUIRED)
	public String updateTrainee(Long traineeID, String trainee) {
		Trainee traineeDB = em.find(Trainee.class, traineeID);
		Trainee traineeUpdate = util.getObjectForJSON(trainee, Trainee.class);
		em.remove(traineeDB);
		em.persist(traineeUpdate);
		return "{\"message\": \"trainee updated\"}";
		
	}
	@Transactional(REQUIRED)
	public String deleteTrainee(Long traineeID) {
		Trainee trainee = em.find(Trainee.class, traineeID);
		em.remove(trainee);
		return "{\"message\": \"trainee deleted\"}";
	}

}
