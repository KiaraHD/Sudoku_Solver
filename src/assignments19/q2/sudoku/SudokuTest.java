package assignments19.q2.sudoku;

import libs.inout.In;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SudokuTest {

    Board result = new Board();
    Board resultFalse = new Board();
    Board solution = new Board();
    String fileTest = "/home/kiara/work/itl/src/assignments19/q2/sudoku/SodukoTest";
    String fileTestFalse = "/home/kiara/work/itl/src/assignments19/q2/sudoku/SodukoTestFalse";
    String fileSolution = "/home/kiara/work/itl/src/assignments19/q2/sudoku/SodukoSolution";

    public String[][] readData(String file) {

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

        Board clone = (Board) solution.clone();

        assertFalse(solution == clone);
        assertTrue(solution.equals(clone));
    }

    @Test
    public void testContainedRowTrue() {

        assertTrue(result.containedInRow(2, 8));
    }

    @Test
    public void testContainedRowFalse() {

        assertFalse(result.containedInRow(2, 4));
    }

    @Test
    public void testContainedColumnTrue() {

        assertTrue(result.containedInColumn(3, 1));
    }

    @Test
    public void testContainedColumnFalse() {

        assertFalse(result.containedInColumn(3, 3));
    }

    @Test
    public void testContainedFieldTrue() {

        assertTrue(result.containedInField(0, 2, 6));
    }

    @Test
    public void testContainedFieldFalse() {

        assertFalse(result.containedInField(2, 0, 2));
    }

    @Test
    public void testValidTrue() {

        assertTrue(result.isValid(0, 2, 2));
    }

    @Test
    public void testValidFalse() {

        assertFalse(result.isValid(0, 2, 3));
    }
}