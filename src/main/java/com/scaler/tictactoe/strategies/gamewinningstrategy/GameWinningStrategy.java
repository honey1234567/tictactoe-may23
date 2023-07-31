package com.scaler.tictactoe.strategies.gamewinningstrategy;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;
import com.scaler.tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Move move);
}
