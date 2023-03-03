package be.technifutur.sudoku.SudokuModelSamourai;

import be.technifutur.sudoku.SudokuModel;

public class SudokuSamourai implements SudokuModel {

    private char [][] tab = new char[21][21];

    @Override
    public int cellCount() {
        return (21*21)-(4*(9*2));
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
        return 21;
    }

    @Override
    public int getMaxColumn() {
        return 21;
    }

    @Override
    public boolean isPositionValid(int line, int column) {
        if (line < 6 || line > 14){
            if (column > 8 && column <= 11){
                return false;
            }else {
                return true;
            }
        } else {
            if (column < 6 || column > 14){
                if (line > 8 && line <= 11){
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
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

