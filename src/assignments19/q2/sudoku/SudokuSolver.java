package assignments19.q2.sudoku;

import libs.inout.In;
import libs.inout.Out;

public class SudokuSolver {

    public static void main(String[] args) {

        Board board = new Board();

        String filename = "C:\\Users\\AK121082\\IdeaProjects\\ITL\\src\\assignments19\\q2\\sudoku\\input.txt";
        In.open(filename);

        board.readBoard();
        board.solve();
        board.printBoard();


      if (board.checkBoard()){
           Out.println("the sudoku is solved correctly");
        } else {

            Out.println("the soduko is solved wrong");
        }
    }
}