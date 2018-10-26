package de.ostfalia.ftswt.actor;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ActorsView {


	@Inject
	ActorService actorService;

	public ActorsView() {
	}

	public List<Actor> readAll() {
		return actorService.readAll();
	}

}

