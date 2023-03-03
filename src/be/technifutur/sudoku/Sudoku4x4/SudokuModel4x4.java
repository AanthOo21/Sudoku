package be.technifutur.sudoku.Sudoku4x4;

import be.technifutur.sudoku.SudokuModel;

public class SudokuModel4x4 implements SudokuModel {

    private char [][] tab = new char[4][4];

    @Override
    public int cellCount() {
        return 4*4;
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
        return 4;
    }

    @Override
    public int getMaxColumn() {
        return 4;
    }

    @Override
    public boolean isPositionValid(int line, int column) {
        return ((line < 4 && line >= 0) && (column < 4 && column >= 0));
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
