package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board boart, Color color) {
		super(boart, color);
	}

	@Override
	public String toString() {
		return "R";
	}

}
