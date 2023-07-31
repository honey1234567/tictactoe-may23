package com.scaler.tictactoe.strategies.gamewinningstrategy;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    List<HashMap<Character, Integer>> rowSymbolCounts = new ArrayList<>();
    List<HashMap<Character, Integer>> colSymbolCounts = new ArrayList<>();
    HashMap<Character, Integer> topLeftDiaganolSymbolCounts = new HashMap<>();
    HashMap<Character, Integer> topRightDiaganolSymbolCounts = new HashMap<>();

    OrderOneGameWinningStrategy(int dimension) {
        for (int i = 0; i < dimension; i++) {
            rowSymbolCounts.add(new HashMap<>());
            colSymbolCounts.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkWinner(Board board, Move move) {

        return false;
    }
}
