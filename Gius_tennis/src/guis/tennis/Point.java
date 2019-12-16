package guis.tennis;

public enum Point {
	ZERO(1, "0"), FIFTEEN(2, "15"), THIRTY(3, "30"), FORTY(4, "40"), OVERFORTY(5,"Advantage");

	private Integer score;
	private String tennis_score;

	private Point(int score, String tennis_score) {
		this.score = score;
		this.tennis_score = tennis_score;
	}
	public static Point PointByScore(int score) {
		for(Point p:Point.values()) {
			if(score==p.getScore()) {
				return p;
			}
		}
		return OVERFORTY;
	}
	public static Point PointByTennisScore(String tennisScore) {
		for(Point p:Point.values()) {
			if(tennisScore==p.getTennisScore()) {
				return p;
			}
		}
		return OVERFORTY;
	}
	public Integer getScore() {
		return this.score;
	}
	public String getTennisScore() {
		return this.tennis_score;
	}
}