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
		new Index(001, Solution1.class, "max points per line");
		new Index(062, Solution62.class, "uniquePaths");
		new Index(063, Solution63.class, "uniquePathsWithObstacles");
		new Index(198, Solution198.class, "House Robber");
		new Index(213, Solution213.class, "House Robber II");
		new Index(229, Solution229.class, "Majority Element II");
		
		
	}

}