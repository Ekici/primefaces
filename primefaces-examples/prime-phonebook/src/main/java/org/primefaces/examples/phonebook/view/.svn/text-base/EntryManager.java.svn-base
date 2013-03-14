/*
 * Copyright 2009 Prime Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.examples.phonebook.view;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.primefaces.examples.phonebook.domain.PhonebookEntry;
import org.primefaces.examples.phonebook.repository.PhoneBookRepository;

@Name("entryManager")
@Scope(ScopeType.SESSION)
public class EntryManager {

	private PhonebookEntry entry;
	
	private List<PhonebookEntry> entries;
	
	@In
	private PhoneBookRepository phoneBookRepository;
	
	@Create
	public void init() {
		entries = phoneBookRepository.findAll();
	}
	
	public void save(ActionEvent actionEvent) {
		if(entry.isPersisted())
			phoneBookRepository.update(entry);
		else
			phoneBookRepository.create(entry);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successful", "Entry saved"));
		entry = new PhonebookEntry();
		entries = phoneBookRepository.findAll();
	}
	
	public void delete(ActionEvent actionEvent) {
		phoneBookRepository.delete(entry);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Successful", "Entry deleted"));
		entry = new PhonebookEntry();
		entries = phoneBookRepository.findAll();
	}
	
	public PhonebookEntry getEntry() {
		if( entry == null )
			entry = new PhonebookEntry();
		return entry;
	}
	public void setEntry(PhonebookEntry entry) {
		this.entry = entry;
	}
	
	public List<PhonebookEntry> getEntries() {
		return entries;
	}
	public void setEntries(List<PhonebookEntry> entries) {
		this.entries = entries;
	}
	
	public void resetEntry(ActionEvent actionEvent) {
		entry = new PhonebookEntry();
	}
}
