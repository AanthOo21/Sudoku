package be.technifutur.sudoku.SudokuModelSamourai;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.Sudoku4x4.SudokuFactory4x4;
import be.technifutur.sudoku.Sudoku4x4.SudokuModel4x4;
import be.technifutur.sudoku.Sudoku4x4.SudokuVue4x4;
import be.technifutur.sudoku.SudokuVue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuFactorySamourai implements ModelFactory {
    @Override
    public SudokuSamourai getModel(String fileName) {
        SudokuSamourai model = new SudokuSamourai();
        File fileSamourai = new File(fileName);
        try(Scanner scanner = new Scanner(fileSamourai)){
            int ligne = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                for (int i = 0; i < model.getMaxLine(); i++) {
                    if (model.isPositionValid(ligne,i)) {
                        char c = line.charAt(i);
                        if (model.isValueValid(c)) {
                            model.setValue(ligne, i, c);
                        }
                    }
                }
                ligne++;
            }

        }catch (FileNotFoundException e){
            System.out.printf("Le fichier %s n'éxiste pas %n",fileName);
        }
        return model;
    }

    @Override
    public SudokuVue getVue(String fileName) {
        SudokuFactorySamourai factory = new SudokuFactorySamourai();
        SudokuSamourai model = factory.getModel(fileName);
        SudokuVueSamourai vue = new SudokuVueSamourai(model);
        return vue;
    }

}
