package org.primefaces.examples.phonebook.repository;

import java.util.List;

import org.primefaces.examples.phonebook.domain.PhonebookEntry;

public interface PhoneBookRepository {

	public void create(PhonebookEntry entry);
	
	public void update(PhonebookEntry entry);
	
	public void delete(PhonebookEntry entry);
	
	public List<PhonebookEntry> findAll();
}
