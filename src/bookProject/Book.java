package bookProject;

import java.util.ArrayList;

public class Book {
	private String title;
	private ArrayList<Chapter> content = new ArrayList<Chapter>();
	private ArrayList<Author> authors = new ArrayList<Author>();

	public Book(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println("Book: " + title);
		for(Author ath : authors) {
			ath.print();
		}
		for(Chapter chp : content) {
			chp.print();
		}

	}
	
	public int createChapter(String name) {
		Chapter chp = new Chapter(name);
		content.add(chp);
		return content.indexOf(chp);
	}

	public Chapter getChapter(int indexChapterOne) {
		// TODO Auto-generated method stub
		//check index is in range
		return content.get(indexChapterOne);
	}

	public void addAuthor(Author rpGheo) {
		// TODO Auto-generated method stub
		authors.add(rpGheo);
		
	}
	

}
