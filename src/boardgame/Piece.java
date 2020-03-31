package boardgame;

public class Piece {

	protected Position position;
	
	private Board boart;

	public Piece(Board boart) {
		this.boart = boart;
		position = null;
	}

	protected Board getBoart() {
		return boart;
	}

	
	
}
