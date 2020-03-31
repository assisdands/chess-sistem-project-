package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board boart, Color color) {
		super(boart);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	
	

}
