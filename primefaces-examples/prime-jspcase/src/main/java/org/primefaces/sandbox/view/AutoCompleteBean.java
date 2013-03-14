package org.primefaces.sandbox.view;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.optimus.config.Scope;
import org.primefaces.optimus.config.annotations.Controller;

@Controller(name="autoCompleteBean", scope=Scope.REQUEST)
public class AutoCompleteBean {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public List<String> complete(String query) {
		List<String> results = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			results.add(query + i);
		}
		
		return results;
	}
}