package assignments19.q2.sudoku;

import libs.inout.In;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SudokuTest {

    Board board = new Board();
    Board solution = new Board();
    String fileTest = "C:\\Users\\AK121082\\IdeaProjects\\ITL\\src\\assignments19\\q2\\sudoku\\SudokuTest";
    String fileTestFalse = "C:\\Users\\AK121082\\IdeaProjects\\ITL\\src\\assignments19\\q2\\sudoku\\SudokuTestFalse";
    String fileSolution = "C:\\Users\\AK121082\\IdeaProjects\\ITL\\src\\assignments19\\q2\\sudoku\\SudokuSolution";

    @Before
    public void setup() {


    }

    @Test
    public void solveEqualsTrue() {

        board.solve();

        In.close();
        In.open(fileSolution);
        solution.readBoard();

        assertTrue(board.equals(solution));
    }

    @Test
    public void solveTestTrue() {

        In.open(fileTest);
        board.readBoard();
        assertTrue(board.solve());
    }

    @Test
    public void solveEqualsFalse() {

        In.open(fileTestFalse);
        board.readBoard();
        board.solve();

        In.close();
        In.open(fileSolution);
        solution.readBoard();

        assertFalse(board.equals(solution));
    }

    @Test
    public void solveTestFalse() {

        In.open(fileTestFalse);
        board.readBoard();

        assertFalse(board.solve());
    }

    @Test
    public void testEquals() {

        In.open(fileSolution);
        board.readBoard();
        Board clone = (Board) board.clone();

        assertFalse(board == clone);
        assertTrue(solution.equals(clone));
    }
}