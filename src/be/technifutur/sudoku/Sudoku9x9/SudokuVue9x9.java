package be.technifutur.sudoku.Sudoku9x9;

import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;

public class SudokuVue9x9 implements SudokuVue {
    private static String format= """
                    1    2    3         4    5    6         7    8    9
               +-------------------+-------------------+-------------------+
               |                   |                   |                   |
            1  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
            2  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
            3  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
               +-------------------+-------------------+-------------------+
               |                   |                   |                   |
            4  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
            5  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
            6  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
               +-------------------+-------------------+-------------------+
               |                   |                   |                   |
            7  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
            8  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
            9  |    .    .    .    |    .    .    .    |    .    .    .    |
               |                   |                   |                   |
               +-------------------+-------------------+-------------------+""".replace(".","%s");
    private SudokuModel9x9 model;

    public SudokuVue9x9(SudokuModel9x9 model){
        this.model = model;
    }
    @Override
    public String getScreen() {
        Character[] val = new Character[model.cellCount()];
        int pos = 0;
        for (int i = 0; i <model.getMaxLine(); i++) {
            for (int j = 0; j < model.getMaxColumn(); j++) {
                if (model.isEmpty(i,j)){
                    val[pos] = '.';
                }else {
                    val[pos] = model.getValue(i, j);
                }
                pos++;
            }
        }
        return String.format(format, val);
    }
        /* String result = "";
        for (int i = 0; i < model.getMaxLine(); i++) {
            for (int j = 0; j < model.getMaxColumn(); j++) {
                result += model.getValue(i,j) + " ";
            }
            result += "\n";
        }
        return result; */

    @Override
    public SudokuModel getModel() {
        return this.model;
    }
}
