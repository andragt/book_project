package bookProject;

public class Image implements Element{
	private String imageName;

	public Image(String imageName) {
		this.imageName = imageName;
	}
	
	public void print() {
		System.out.println("Image: " + imageName);
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
