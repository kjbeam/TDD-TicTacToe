package com.packtpublishing.tddjava.ch03tictactoe;

/**
 * @author kbeam Date:    8/21/2018 Time:    10:52 AM
 */
public class TicTacToe {

	public void play(int x, int y) {
		if (x > 3 || x < 1) {
			throw new RuntimeException("X is outside of the board");
		}
		if (y > 3 || y < 1) {
			throw new RuntimeException("Y is outside of the board");
		}
	}

}
