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
package org.primefaces.sandbox.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;

@Controller(name="pprBean", scope=Scope.REQUEST)
public class PPRBean {

	private String firstname;
	
	private String surname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void savePerson(ActionEvent actionEvent) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
	}
	
	public void savePersonTiming(ActionEvent actionEvent) {
		//Just spend some time to display ajaxStatus component demo
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
	}
}
