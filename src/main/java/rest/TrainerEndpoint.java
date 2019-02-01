package rest;

import javax.inject.Inject;
import javax.ws.rs.*;

import service.TrainerService;

@Path("/trainer")
public class TrainerEndpoint {
	
	@Inject
	private TrainerService service;
	
	@Path("/getAllTrainers")
	@GET
	@Produces({"application/json"})
	public String getAllTrainers() {
		return service.getAllTrainers();
		
	}
	
	@Path("/getTrainer/{trainerID}")
	@GET
	@Produces({"application/json"})
	public String getTrainer(@PathParam("trainerID") Long trainerID) {
		return service.getTrainer(trainerID);
	}
	
	@Path("/createTrainer")
	@POST
	@Produces({"application/json"})
	public String createTrainer(String trainer) {
		return service.createTrainer(trainer);
	}
	
	@Path("/updateTrainer/{trainerID}")
	@PUT
	@Produces({"application/json"})
	public String updateTrainer(@PathParam("trainerID")Long trainerID, String trainer) {
		return service.updateTrainer(trainerID, trainer);
	}
	
	@Path("/deleteTrainer/{trainerID}")
	@DELETE
	@Produces({"application/json"})
	public String deleteTrainer(@PathParam("trainerID") Long trainerID) {
		return service.deleteTrainer(trainerID);
	}

}
