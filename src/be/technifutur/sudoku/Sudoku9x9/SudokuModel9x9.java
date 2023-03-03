package be.technifutur.sudoku.Sudoku9x9;

import be.technifutur.sudoku.SudokuModel;

public class SudokuModel9x9 implements SudokuModel {

    private char [][] tab = new char[9][9];

    @Override
    public int cellCount() {
        return 9*9;
    }

    @Override
    public char getValue(int line, int column) {
        char value;
        value = tab[line][column];

        return value;
    }

    @Override
    public void setValue(int line, int column, char value) {
        tab[line][column] = value;
    }

    @Override
    public int getMaxLine() {
        return 9;
    }

    @Override
    public int getMaxColumn() {
        return 9;
    }

    @Override
    public boolean isPositionValid(int line, int column) {
        boolean reslut = false;
        if ((line < 9 && line >= 0) && (column < 9 && column >= 0)) {
            reslut = true;
        }
        return reslut;
    }

    @Override
    public boolean isValueValid(char value) {
        boolean reslut = false;
        if (value > '0' && value <= '9') {
            reslut = true;
        }
        return reslut;
    }

    @Override
    public boolean isEmpty(int line, int column) {
        boolean reslut = false;
        if (tab [line][column] == 0) {
            reslut = true;
        }
        return reslut;
    }

    @Override
    public void clear(int line, int column) {
        tab [line][column] = 0;
    }

}
