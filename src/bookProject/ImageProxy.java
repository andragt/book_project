package bookProject;

public class ImageProxy implements Element {

    private String imageName;
    private Image realImage = null;



    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }


    public void print() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        realImage.print();
    }


    @Override
    public void add(Element elm) {
        // TODO Auto-generated method stub

    }


    @Override
    public void remove(Element elm) {
        // TODO Auto-generated method stub

    }


    @Override
    public Element getChild(int index) {
        // TODO Auto-generated method stub
        return null;
    }

}

