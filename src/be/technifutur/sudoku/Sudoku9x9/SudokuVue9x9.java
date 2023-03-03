package be.technifutur.sudoku.Sudoku9x9;

import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;

public class SudokuVue9x9 implements SudokuVue {

    private SudokuModel9x9 model;

    public SudokuVue9x9(SudokuModel9x9 model){
        this.model = model;
    }
    @Override
    public String getScreen() {
        String result = "";
        for (int i = 0; i < model.getMaxLine(); i++) {
            for (int j = 0; j < model.getMaxColumn(); j++) {
                result += model.getValue(i,j) + " ";
            }
            result += "\n";
        }
        return result;
    }

    @Override
    public SudokuModel getModel() {
        return this.model;
    }
}
