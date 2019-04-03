package assignments19.q2.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class SudokuTest {

    @Test
    public void rowTest() {

        Board board = new Board();

        String[] row = new String[]{"5", "3", "3", "6", "7", "8", "9", "1", "2"};

        assertFalse(board.isValidRow(row));

    }
}