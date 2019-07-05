package assignments19.q2.sudoku;

import libs.inout.In;
import libs.inout.Out;

public class Board {

    String[][] boardValue = new String[9][9];
    int countColumn = 0;
    int countRow = 0;

    public boolean checkBoard() {

        while (countRow < 9 || countColumn < 9) {
            if (!isValidRow(readRow())) {
                return false;
            }

            if (!isValidColumn(readColumn())) {
                return false;
            }

            if (!isValidField(readField())) {
                return false;
            }
        }

        return true;
    }

    public void printBoard() {

        Out.println("---------------------------------------");
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                Out.print(" | " + boardValue[i][j]);

            }
            Out.print(" |");
            Out.println();
            Out.println("--------------------------------------");

        }
    }

    public void readBoard() {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                boardValue[i][j] = In.readWord();

            }
        }
    }

    public String[] readRow() {

        String[] row = new String[9];

        for (int i = 0; i < 9; i++) {

            if (countRow < 9)
                row[i] = boardValue[i][countRow];
        }

        countRow++;
        return row;
    }

    public String[] readColumn() {

        String[] column = new String[9];

        for (int i = 0; i < 9; i++) {

            column[i] = boardValue[countColumn][i];
        }
        countColumn++;
        return column;
    }

    public boolean isValidColumn(String column[]) {
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
        for (int i = 0; i < 9; i++) {

            switch (column[i]) {

                case "1":
                    count1++;
                    break;
                case "2":
                    count2++;
                    break;
                case "3":
                    count3++;
                    break;
                case "4":
                    count4++;
                    break;
                case "5":
                    count5++;
                    break;
                case "6":
                    count6++;
                    break;
                case "7":
                    count7++;
                    break;
                case "8":
                    count8++;
                    break;
                case "9":
                    count9++;
                    break;
                case "_":
                    break;
                default:
                    return false;
            }
            if (count1 > 1 || count2 > 1 || count3 > 1 || count4 > 1 || count5 > 1 || count6 > 1 || count7 > 1 || count8 > 1 || count9 > 1) {

                return false;
            }
        }

        return true;
    }

    public boolean isValidRow(String row[]) {

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
        for (int i = 0; i < 9; i++) {

            switch (row[i]) {

                case "1":
                    count1++;
                    break;
                case "2":
                    count2++;
                    break;
                case "3":
                    count3++;
                    break;
                case "4":
                    count4++;
                    break;
                case "5":
                    count5++;
                    break;
                case "6":
                    count6++;
                    break;
                case "7":
                    count7++;
                    break;
                case "8":
                    count8++;
                    break;
                case "9":
                    count9++;
                    break;
                case "_":
                    break;
                default:
                    return false;
            }
            if (count1 > 1 || count2 > 1 || count3 > 1 || count4 > 1 || count5 > 1 || count6 > 1 || count7 > 1 || count8 > 1 || count9 > 1) {

                return false;
            }
        }
        return true;
    }

    public String[] readField() {
        String[] field = new String[9];

        int val = 0;

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 3; i++) {

                field[val] = boardValue[j][i];
                val++;
            }
        }

        return field;
    }

    public boolean isValidField(String[] field) {

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
        for (int i = 0; i < 9; i++) {

            switch (field[i]) {

                case "1":
                    count1++;
                    break;
                case "2":
                    count2++;
                    break;
                case "3":
                    count3++;
                    break;
                case "4":
                    count4++;
                    break;
                case "5":
                    count5++;
                    break;
                case "6":
                    count6++;
                    break;
                case "7":
                    count7++;
                    break;
                case "8":
                    count8++;
                    break;
                case "9":
                    count9++;
                    break;
                case "_":
                    break;
                default:
                    return false;
            }
        }

        if (count1 > 1 || count2 > 1 || count3 > 1 || count4 > 1 || count5 > 1 || count6 > 1 || count7 > 1 || count8 > 1 || count9 > 1) {
            return false;
        }
        return true;
    }


    private boolean containedInRow(int row, int number) {

        for (int i = 0; i < 9; i++) {

            if (boardValue[row][i].equals(Integer.toString(number))) {

                return true;
            }
        }
        return false;
    }

    private boolean containedInColumn(int col, int number) {

        for (int i = 0; i < 9; i++) {

            if (boardValue[i][col].equals(Integer.toString(number))) {

                return true;
            }
        }
        return false;
    }

    private boolean containedInField(int row, int col, int number) {
        row = row / 3 * 3;
        col = col / 3 * 3;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {

                if (boardValue[i][j].equals(Integer.toString(number))) {

                    return true;
                }
            }
        }

        return false;
    }

    private boolean isValid(int row, int col, int number) {

        return !(containedInRow(row, number) || containedInColumn(col, number) || containedInField(row, col, number));
    }

    public boolean solve() {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                if (boardValue[i][j].equals("_")) {

                    for (int number = 1; number <= 9; number++) {
                        if (isValid(i, j, number)) {

                            boardValue[i][j] = Integer.toString(number);

                            if (solve()) {
                                return true;
                            } else {
                                boardValue[i][j] = ("_");
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}