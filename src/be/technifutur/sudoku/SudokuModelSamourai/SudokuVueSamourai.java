package be.technifutur.sudoku.SudokuModelSamourai;

import be.technifutur.sudoku.SudokuModel;
import be.technifutur.sudoku.SudokuVue;

public class SudokuVueSamourai implements SudokuVue {

    private static String format = """
 +-----+-----+-----+     +-----+-----+-----+
 | . . | . . | . . |     | . . | . . | . . |
 | . . | . . | . . |     | . . | . . | . . |
 +-----+-----+-----+     +-----+-----+-----+
 | . . | . . | . . |     | . . | . . | . . |
 | . . | . . | . . |     | . . | . . | . . |
 +-----+-----+-----+-----+-----+-----+-----+
 | . . | . . | . . | . . | . . | . . | . . |
 | . . | . . | . . | . . | . . | . . | . . |
 +-----+-----+-----+-----+-----+-----+-----+
             | . . | . . | . . |
             | . . | . . | . . |
 +-----+-----+-----+-----+-----+-----+-----+
 | . . | . . | . . | . . | . . | . . | . . |
 | . . | . . | . . | . . | . . | . . | . . |
 +-----+-----+-----+-----+-----+-----+-----+
 | . . | . . | . . |     | . . | . . | . . |
 | . . | . . | . . |     | . . | . . | . . |
 +-----+-----+-----+     +-----+-----+-----+
 | . . | . . | . . |     | . . | . . | . . |
 | . . | . . | . . |     | . . | . . | . . |
 +-----+-----+-----+     +-----+-----+-----+""".replace(".", "%s");
    private SudokuSamourai model;

    public SudokuVueSamourai(SudokuSamourai model){
        this.model = model;
    }
    @Override
    public String getScreen() {
        Character[] val = new Character[model.cellCount()];
        int pos = 0;
        for (int i = 0; i < model.getMaxLine(); i++) {
            for (int j = 0; j < model.getMaxColumn(); j++) {
                if (model.isPositionValid(i, j)) {
                    if (model.isEmpty(i, j)) {
                        val[pos] = '.';
                    } else {
                        val[pos] = model.getValue(i, j);
                    }
                    pos++;
                }
            }
        }
        return String.format(format, val);
    }

    @Override
    public SudokuModel getModel() {
        return this.model;
    }
}
