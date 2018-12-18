package bookProject;

import java.util.ArrayList;

import javax.lang.model.util.Elements;

public class SubChapter {
	private String name;
	private ArrayList<Element> elements = new ArrayList<Element>();
	
	public SubChapter(String name) {
		this.name = name;
	}
	
	public void createNewParagraph(String text) {
		Paragraph prg = new Paragraph(text);
		elements.add(prg);
	}
	
	public void createNewImage(String imageName) {
		Image img = new Image(imageName);
		elements.add(img);
	}

	public void createNewTable(String tableType) {
		Table tbl = new Table(tableType);
		elements.add(tbl);
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SubChapter: " + name);
		for(Element elm : elements)
			elm.print();
		
		
	}
}
