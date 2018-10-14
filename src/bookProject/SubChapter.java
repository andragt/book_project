package bookProject;

import java.util.ArrayList;

public class SubChapter {
	private String name;
	private ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
	private ArrayList<Image> images = new ArrayList<Image>();
	private ArrayList<Table> tables = new ArrayList<Table>();
	
	public SubChapter(String name) {
		this.name = name;
	}
	
	public void createNewParagraph(String text) {
		Paragraph prg = new Paragraph(text);
		paragraphs.add(prg);
	}
	
	public void createNewImage(String imageName) {
		Image img = new Image(imageName);
		images.add(img);
	}

	public void createNewTable(String tableType) {
		Table tbl = new Table(tableType);
		tables.add(tbl);
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("SubChapter: " + name);
		for(Paragraph prg : paragraphs)
			prg.print();
		for(Image img : images)
			img.print();
		for(Table tbl : tables)
			tbl.print();
		
		
	}
}
