package bookProject;

import java.util.concurrent.TimeUnit;

public class Image implements Element{
	private String imageName;

//	public Image(String imageName) {
//		this.imageName = imageName;
//	}

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
