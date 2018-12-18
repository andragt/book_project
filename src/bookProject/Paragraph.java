package bookProject;

public class Paragraph implements Element{
	private String text;
	private AlignStrategy allign;

	public Paragraph(String text) {
		this.text = text;
	}

	public void setAlignStrategy(AlignStrategy alignment) {
		this.allign = alignment;
	}

	public void print() {
		if(allign != null){
			allign.print(text);
		}
		else{
			System.out.println(text);
		}

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
