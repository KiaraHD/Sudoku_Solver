package assignments19.q2.sudoku;

import libs.inout.In;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SudokuTest {

    Board result = new Board();
    Board resultFalse = new Board();
    Board solution = new Board();
    String fileTest = "C:\\Users\\AK121082\\IdeaProjects\\ITL\\src\\assignments19\\q2\\sudoku\\SudokuTest";
    String fileTestFalse = "C:\\Users\\AK121082\\IdeaProjects\\ITL\\src\\assignments19\\q2\\sudoku\\SudokuTestFalse";
    String fileSolution = "C:\\Users\\AK121082\\IdeaProjects\\ITL\\src\\assignments19\\q2\\sudoku\\SudokuSolution";

    public String[][] readData(String file){

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

    @Before
    public void setup() {

        result.setBoardValue(readData(fileTest));
        solution.setBoardValue(readData(fileSolution));
        resultFalse.setBoardValue(readData(fileTestFalse));
    }

    @Test
    public void solveEqualsTrue() {


        result.solve();

        assertTrue(result.equals(solution));
    }

    @Test
    public void solveTestTrue() {

        assertTrue(result.solve());
    }

    @Test
    public void solveEqualsFalse() {

        assertFalse(resultFalse.equals(solution));
    }

    @Test
    public void solveTestFalse() {

        assertFalse(resultFalse.solve());
    }

    @Test
    public void testEquals() {

        Board clone = (Board) result.clone();

        assertFalse(result == clone);
        assertTrue(solution.equals(clone));
    }
}