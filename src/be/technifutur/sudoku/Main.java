package be.technifutur.sudoku;

import be.technifutur.sudoku.Sudoku4x4.SudokuFactory4x4;
import be.technifutur.sudoku.Sudoku4x4.SudokuModel4x4;
import be.technifutur.sudoku.Sudoku4x4.SudokuVue4x4;
import be.technifutur.sudoku.Sudoku9x9.SudokuModel9x9;
import be.technifutur.sudoku.Sudoku9x9.SudokuVue9x9;
import be.technifutur.sudoku.SudokuModelSamourai.SudokuSamourai;
import be.technifutur.sudoku.SudokuModelSamourai.SudokuVueSamourai;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Sudoku 4x4");

        SudokuFactory4x4 factory = new SudokuFactory4x4();
        SudokuModel4x4 model = factory.getModel("ressource\\sudoku4x4.txt");
        SudokuVue4x4 vue = new SudokuVue4x4(model);
        System.out.println(vue.getScreen());
        System.out.println("-------------------");

        SudokuModel9x9 model2 = new SudokuModel9x9();
        SudokuVue vue2 = new SudokuVue9x9(model2);
        System.out.println("Sudoku 9x9");
        System.out.println(vue2.getScreen());
        vue2.getModel().setValue(0,0,'1');
        System.out.println();
        System.out.println(vue2.getScreen());

        SudokuSamourai model3 = new SudokuSamourai();
        SudokuVue vue3 = new SudokuVueSamourai(model3);
        System.out.println("Sudoku Samourai");
        System.out.println(vue3.getScreen());
        vue3.getModel().setValue(0,0,'1');
        System.out.println();
        System.out.println(vue3.getScreen());
    }
}
