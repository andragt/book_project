package bookProject;

public class Paragraph implements Element{
	private String text;

	public Paragraph(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.println("Paragraphs: " + text);
	}

	@Override
	public void add(Element elm) {
		
	}

	@Override
	public void remove(Element elm) {
		
	}

	@Override
	public Element getChild(int index) {
		return null;
	}
}
