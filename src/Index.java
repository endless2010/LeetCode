public class Index {
	int index;
	Class<?> classname;
	String description;

	public Index(int index, Class<?> classname, String description) {
		this.index = index;
		this.classname = classname;
		this.description = description;
	}

	public void test() {
		new Index(0, Solution1.class, "max points per line");
	}

}