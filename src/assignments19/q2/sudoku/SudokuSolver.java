package assignments19.q2.sudoku;

import libs.inout.In;

public class SudokuSolver {

    public static void main(String[] args) {

        Board board = new Board();

        String filename = "C:\\Users\\AK121082\\IdeaProjects\\ITL\\src\\assignments19\\q2\\sudoku\\input.txt";

        In.open(filename);
//
//        board.readField();
//        board.printField();
//        board.checkBoard();

//        String[] row = new String[9];

        board.checkField();
//        board.readRow(row);
//        board.isValidRow(row);

    }

}
