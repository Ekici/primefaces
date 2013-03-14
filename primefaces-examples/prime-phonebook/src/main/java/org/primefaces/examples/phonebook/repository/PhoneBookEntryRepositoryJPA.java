package org.primefaces.examples.phonebook.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.annotations.Startup;
import org.primefaces.examples.phonebook.domain.PhonebookEntry;

@Name("phoneBookRepository")
@Scope(ScopeType.APPLICATION)
@Startup
public class PhoneBookEntryRepositoryJPA implements PhoneBookRepository {

	@In
	public EntityManager entityManager;
	
	public void create(PhonebookEntry entry) {
		entityManager.persist(entry);
	}

	public List<PhonebookEntry> findAll() {
		return (List<PhonebookEntry>) entityManager.createQuery("from PhonebookEntry").getResultList();
	}

	public void delete(PhonebookEntry entry) {
		entityManager.createQuery("delete from PhonebookEntry p where p.id=:id").setParameter("id", entry.getId()).executeUpdate();
	}

	public void update(PhonebookEntry entry) {
		entityManager.merge(entry);
	}
}
