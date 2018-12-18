package bookProject;

public class Table implements Element{
	private String title;

	public Table(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println("Table: " + title);
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
