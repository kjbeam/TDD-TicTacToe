package com.packtpublishing.tddjava.ch03tictactoe;

/**
 * @author kbeam Date:    8/21/2018 Time:    10:52 AM
 */
class TicTacToe {
	private Character[][] board = {
			{'\0','\0','\0'},
			{'\0','\0','\0'},
			{'\0','\0','\0'}
	};

	private char lastPlayer = '\0';

	void play(int x, int y) {
		checkAxis(x);
		checkAxis(y);
		setBox(x,y);
		lastPlayer = nextPlayer();

	}

	void checkAxis(int axis) {
		if (axis > 3 || axis < 1) {
			throw new RuntimeException("X is outside of the board");
		}
	}

	void setBox(int x, int y) {
		if (board[x-1][y-1] != '\0') {
			throw new RuntimeException("Box is occupied");
		} else {
			board[x-1][y-1] = 'X';
		}
	}

	char nextPlayer() {
		if (lastPlayer == 'X') {
			return 'O';
		} else {
			return 'X';
		}
	}
}
