package assignments19.q2.sudoku;

import libs.inout.In;
import libs.inout.Out;

public class Board {

    String[][] field = new String[9][9];

    public void printField() {

        int j;

        Out.println("---------------------------------------");
        for (int i = 0; i < 9; i++) {

            for (j = 0; j < 9; j++) {
                Out.print(" | " + field[i][j]);

            }
            Out.print(" |");
            Out.println();
            Out.println("--------------------------------------");

        }
    }

    public void readField() {
        int j;

        for (int i = 0; i < 9; i++) {

            for (j = 0; j < 9; j++) {
                field[i][j] = In.readWord();

            }
        }
    }

    public boolean checkBoard() {

        //checks row
        for (int j = 0; j < 9; j++) {

            int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;

            for (int i = 0; i < 9; i++) {
                switch (field[i][j]) {

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
                }
            }

            if (count1 > 1 || count2 > 1 || count3 > 1 || count4 > 1 || count5 > 1 || count6 > 1 || count7 > 1 || count8 > 1 || count9 > 1) {

                Out.println("fehler das sudoku ist falsch");
                return false;
            }
        }
        //check colums

        for (int j = 0; j < 9; j++) {

            int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;


            for (int i = 0; i < 9; i++) {

                switch (field[i][j]) {

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
                }
            }

            if (count1 > 1 || count2 > 1 || count3 > 1 || count4 > 1 || count5 > 1 || count6 > 1 || count7 > 1 || count8 > 1 || count9 > 1) {

                Out.println("fehler das sudoku ist falsch");
                return false;

            }

        }

        //check 3x3 Field


        for (int k = 0; k < 3; k++) {
            int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;

            for (int l = 0; l < 3; l++) {

                switch (field[k][l]) {

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
                }
            }

            if (count1 > 1 || count2 > 1 || count3 > 1 || count4 > 1 || count5 > 1 || count6 > 1 || count7 > 1 || count8 > 1 || count9 > 1) {

                Out.println("fehler das sudoku ist falsch");
                return false;

            }
        }
        Out.print("Das Soduko ist richtig");
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
                default:
                    return false;
            }
            if (count1 > 1 || count2 > 1 || count3 > 1 || count4 > 1 || count5 > 1 || count6 > 1 || count7 > 1 || count8 > 1 || count9 > 1) {

                Out.println("fehler das sudoku ist falsch");
                return false;

            }
        }
        Out.print("Das Soduko ist richtig");

        return true;
    }


    public void readRow(String row[]) {


        String row[] = new String[9];
        String tmp = In.readLine();

        row = tmp.split(" ");

    }

    public void checkField() {

        int i = 0;

        String[] row = new String[9];

        readRow(row);
        while (i < 8 && isValidRow(row) == true) {

            readRow(row);
            isValidRow(row);

            i++;
        }

    }

    public void readColum() {


    }


    public void isValidColum() {


    }
}


