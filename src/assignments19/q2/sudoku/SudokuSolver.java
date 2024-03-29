package assignments19.q2.sudoku;

import libs.inout.In;
import libs.inout.Out;

public class SudokuSolver {

    public static void main(String[] args) {

        Board board = new Board();

        String filename = "/home/kiara/work/itl/src/assignments19/q2/sudoku/SodukoTest";

        board.setBoardValue(readData(filename));

        Out.println("do you want to check or solve a sudoku?");
        Out.println("[1] check");
        Out.println("[2] solve");

        int decide = In.readInt();

        switch (decide) {
            case 1:
                check(board);
                break;
            case 2:
                solve(board);
                break;
            default:
                return;
        }
    }

    public static void check(Board board) {

        if (board.checkBoard()) {

            Out.println("The sudoku is solved correctly");

        } else {

            Out.println("The sudoku is solved wrong or it's not solved yet");
        }
    }

    public static void solve(Board board) {

        board.solve();
        board.printBoard();

        if (board.checkBoard()) {

            Out.println("There was a solution to the sudoku");

        } else {

            Out.println("It's not possible to solve the sudoku");
        }
    }

    public static String[][] readData(String file) {

        In.open(file);

        String[][] boardData = new String[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                boardData[i][j] = In.readWord();
            }
        }

        In.close();
        return boardData;
    }
}