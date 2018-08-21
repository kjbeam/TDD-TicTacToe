package com.packtpublishing.tddjava.ch03tictactoe;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author kbeam Date:    8/21/2018 Time:    10:53 AM
 */
public class TicTacToeSpec {

	private TicTacToe ticTacToe;

	@BeforeEach
	final void before() {
		ticTacToe = new TicTacToe();
	}

	@Test
	@DisplayName("X Outside of Board - Runtime Exception")
	void whenXOutsideBoardThenRuntimeException() {
		assertThatExceptionOfType(RuntimeException.class)
				.isThrownBy(() -> ticTacToe.play(5, 2));
	}

	@Test
	@DisplayName("Y Outside of Board - Runtime Exception")
	void whenYOutsideBoardThenRuntimeException() {
		assertThatExceptionOfType(RuntimeException.class)
				.isThrownBy(() -> ticTacToe.play(2, 5));
	}

	@Test
	@DisplayName("Spot is occupied - Runtime Exception")
	void whenOccupiedThenRuntimeException() {
		assertThatExceptionOfType(RuntimeException.class)
				.isThrownBy(() -> {
					ticTacToe.play(2,1);
					ticTacToe.play(2,1);
				});
	}

}