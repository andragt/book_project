package bookProject;

public interface Element {

		public void print();
		public void add(Element elm);
		public void remove(Element elm);
		public Element getChild(int index);
}
