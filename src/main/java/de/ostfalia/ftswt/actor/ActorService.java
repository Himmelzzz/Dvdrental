package de.ostfalia.ftswt.actor;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ActorService {
	
	@PersistenceContext
	EntityManager em;
	
	public List<Actor> readAll() {
		return em.createQuery("select a from Actor a", Actor.class).getResultList();
	}
	
	public Actor read(Integer id) {
		return em.find(Actor.class, id);
	}
	
	public void save(Actor actor) {
		em.persist(actor);
	}

}
