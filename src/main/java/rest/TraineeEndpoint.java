package rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import service.TraineeService;


@Path("/trainee")
public class TraineeEndpoint {
	
	@Inject
	private TraineeService service;
	
	@Path("/getAllTrainees")
	@GET
	@Produces({"application/json"})
	public String getAllTrainees() {
		return service.getAllTrainees();
		
	}
	
	@Path("/getTrainee/{traineeID}")
	@GET
	@Produces({"application/json"})
	public String getTrainee(@PathParam("TraineeID") Long traineeID) {
		return service.getTrainee(traineeID);
	}
	
	@Path("/createTrainee")
	@POST
	@Produces({"application/json"})
	public String createTrainee(String trainee) {
		return service.createTrainee(trainee);
	}
	
	@Path("/updateTrainee/{traineeID}")
	@PUT
	@Produces({"application/json"})
	public String updateTrainee(@PathParam("traineeID")Long traineeID, String trainee) {
		return service.updateTrainee(traineeID, trainee);
	}
	
	@Path("/deleteTrainee/{traineeID}")
	@DELETE
	@Produces({"application/json"})
	public String deleteTrainee(@PathParam("traineeID") Long traineeID) {
		return service.deleteTrainee(traineeID);
	}

}