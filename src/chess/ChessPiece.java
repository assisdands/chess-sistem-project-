package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board boart, Color color) {
		super(boart);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece (Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p !=null && p.getColor() != color;
 	}
	
	

}
