package bookProject;

import java.util.ArrayList;

public class Book implements Element{
	private String title;
	private ArrayList<Element> content = new ArrayList<Element>();
	private ArrayList<Author> authors = new ArrayList<Author>();

	public Book(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println("Book: " + title);
		for(Author ath : authors) {
			ath.print();
		}
		for(Element chp : content) {
			chp.print();
		}

	}

	public void addAuthor(Author rpGheo) {
		authors.add(rpGheo);
		
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
