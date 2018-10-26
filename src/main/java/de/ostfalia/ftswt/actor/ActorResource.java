package de.ostfalia.ftswt.actor;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/actor")
public class ActorResource {

	@Inject
	ActorService actorService;
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Actor read(@PathParam("id") Integer id) {
		return actorService.read(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Actor> readAll(){
		return actorService.readAll();
	}
}
