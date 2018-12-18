package bookProject;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*Book discoTitanic = new Book("Disco Titanic");
			Author rpGheo = new Author("Radu Pavel Gheo");
				
			discoTitanic.addAuthor(rpGheo);
			int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
			Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
			int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
			SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
				
			scOneOne.createNewParagraph("Paragraph 1");
			scOneOne.createNewParagraph("Paragraph 2");
			scOneOne.createNewParagraph("Paragraph 3");
			scOneOne.createNewImage("Image 1");
			scOneOne.createNewParagraph("Paragraph 4");
			scOneOne.createNewTable("Table 1");
			scOneOne.createNewParagraph("Paragraph 5");
			discoTitanic.print();*/
			Book mathBook = new Book("Base Math");
			mathBook.add(new Paragraph("Thanks to my parents"));
			Section cap1 = new Section("Basic Math");
			cap1.add(new Paragraph("Bla Bla 2"));
			Section cap11 = new Section("Set parameters");
			cap1.add(cap11);
			Section cap111 = new Section("Finish");
			cap11.add(cap111);
			mathBook.add(cap1);
			mathBook.print();
		
		}
}