public enum Face {
	ace("A", 1), two("2", -2), three("3",3), four("4", 4), five("5", 5), six("6", 6), seven("7", 7), eight("8", 8), nine("9", 9), ten("10", 10), jack("J", 10), queen("Q", 10), king("K", 0);
	private String display;
	private int points;
	
	private Face (String display, int points){
		this.display = display;
		this.points = points;
	}
	
	public String getFace() {
		return display;
	}
	
	public int getPoints() {
		return points;
	}
	
}
