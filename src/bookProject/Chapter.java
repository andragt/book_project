package bookProject;

import java.util.ArrayList;

public class Chapter {
	private String name;
	private ArrayList<SubChapter> subChp = new ArrayList<SubChapter>();

	public Chapter(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Chapter: " + name);
		for(SubChapter sbch : subChp) {
			sbch.print();
		}
	}
	
	public int createSubChapter(String name) {
		SubChapter schp = new SubChapter(name);
		subChp.add(schp);
		return subChp.indexOf(schp);
	}

	public SubChapter getSubChapter(int indexSubChapterOne) {
		// TODO Auto-generated method stub
		return subChp.get(indexSubChapterOne);
	}
}
