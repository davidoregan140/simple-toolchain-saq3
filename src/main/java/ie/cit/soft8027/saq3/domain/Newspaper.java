package ie.cit.soft8027.saq3.domain;

import java.util.List;
import java.util.Set;

public class Newspaper {

	private String title;
	private Set <Editor> editorSet;
	
	public Newspaper() {
		
	}

	public Newspaper(String title, Set editorSet) {
		super();
		this.title = title;
		this.editorSet = editorSet;
		
	}

	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Editor> geteditorSet() {
		return editorSet;
	}

	public void seteditorSet(Set<Editor> editorSet) {
		this.editorSet = editorSet;
	}

	@Override
	public String toString() {
		return title + "\n" + editorSet.toString();
		
	}
	
	
	
	
	
	
}
