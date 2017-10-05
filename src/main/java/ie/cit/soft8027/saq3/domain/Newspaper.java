package ie.cit.soft8027.saq3.domain;

import java.util.List;

public class Newspaper {

	private String title;
	private List <Editor> editorsList;
	
	public Newspaper() {
		
	}

	public Newspaper(String title, List editorsList) {
		super();
		this.title = title;
		this.editorsList = editorsList;
		
	}

	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Editor> getEditorsList() {
		return editorsList;
	}

	public void setEditorsList(List<Editor> editorsList) {
		this.editorsList = editorsList;
	}

	@Override
	public String toString() {
		return title + "\n" + editorsList.toString();
		
	}
	
	
	
	
	
	
}
