package de.ostfalia.ftswt.actor;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;

@Named
@RequestScoped
public class ActorView {

	private Actor actor;

	public ActorView() {
		this.actor = new Actor();
	}

	@Inject
	ActorService actorService;

	public String save() throws IOException {
		actorService.save(this.actor);
		this.redirect();
		return null;
	}

	public String cancel() throws IOException {
		this.redirect();
		return null;
	}

	private void redirect() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("actors.jsf");
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

}
