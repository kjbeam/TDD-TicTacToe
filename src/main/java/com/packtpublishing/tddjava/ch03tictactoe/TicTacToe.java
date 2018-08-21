package com.packtpublishing.tddjava.ch03tictactoe;

/**
 * @author kbeam Date:    8/21/2018 Time:    10:52 AM
 */
class TicTacToe {

void play(int x, int y) {
		if (x > 3 || x < 1) {
			throw new RuntimeException("X is outside of the board");
		} else if (y > 3 || y < 1) {
			throw new RuntimeException("Y is outside of the board");
		}
	}

}
