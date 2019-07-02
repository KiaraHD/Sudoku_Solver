package assignments19.q2.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class SudokuTest {

    Board board = new Board();

    @Test
    public void rowTestDuplicate() {

        String[] row = new String[]{"5", "3", "3", "6", "7", "8", "9", "1", "2"};

        assertFalse(board.isValidRow(row));
    }

    @Test
    public void rowTestValid() {

        String[] row = new String[]{"5", "3", "4", "6", "7", "8", "9", "1", "2"};

        assertTrue(board.isValidRow(row));
    }

    @Test
    public void rowTestNoValidNumber() {

        String[] row = new String[]{"5", "3", "10", "6", "7", "8", "9", "1", "2"};

        assertFalse(board.isValidRow(row));
    }

    @Test
    public void ColumnTestDuplicate() {

        String[] column = new String[]{"5", "3", "3", "6", "7", "8", "9", "1", "2"};

        assertFalse(board.isValidColumn(column));
    }

    @Test
    public void ColumnTestValid() {

        String[] column = new String[]{"5", "3", "4", "6", "7", "8", "9", "1", "2"};

        assertTrue(board.isValidColumn(column));
    }

    @Test
    public void ColumnTestNoValidNumber() {

        String[] column = new String[]{"5", "3", "10", "6", "7", "8", "9", "1", "2"};

        assertFalse(board.isValidColumn(column));
    }

    @Test
    public void FieldTestDuplicate() {

        String[] field = new String[]{"5", "3", "3", "6", "7", "8", "9", "1", "2"};

        assertFalse(board.isValidField(field));
        }

    @Test
    public void FieldTestValid() {

        String[] field = new String[]{"5", "3", "4", "6", "7", "8", "9", "1", "2"};

        assertTrue(board.isValidField(field));
        }

    @Test
    public void FieldTestNoValidNumber() {

        String[] field = new String[]{"5", "3", "10", "6", "7", "8", "9", "1", "2"};

        assertFalse(board.isValidField(field));
          }
        }