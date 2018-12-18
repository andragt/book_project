package bookProject;

import java.util.ArrayList;

public class Section implements Element{
	

	private String title;
	public ArrayList<Element> content = new ArrayList<Element>();
	
	public Section(String title) {
		this.title = title;
	}

			

	@Override
	public void print() {
		System.out.println("Section " + title);
		for(Element e : content)
			e.print();
		
	}

	@Override
	public void add(Element elm) {
		content.add(elm);
		
	}

	@Override
	public void remove(Element elm) {
		
	}

	@Override
	public Element getChild(int index) {
		return null;
	}
	

}
