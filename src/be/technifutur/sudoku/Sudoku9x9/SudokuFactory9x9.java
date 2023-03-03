package be.technifutur.sudoku.Sudoku9x9;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.Sudoku4x4.SudokuFactory4x4;
import be.technifutur.sudoku.Sudoku4x4.SudokuModel4x4;
import be.technifutur.sudoku.Sudoku4x4.SudokuVue4x4;
import be.technifutur.sudoku.SudokuVue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuFactory9x9 implements ModelFactory {
    @Override
    public SudokuModel9x9 getModel(String fileName) {
        SudokuModel9x9 model = new SudokuModel9x9();
        File file9x9 = new File(fileName);
        try(Scanner scanner = new Scanner(file9x9)){
            int ligne = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                for (int i = 0; i < model.getMaxLine(); i++) {
                    char c = line.charAt(i);
                    if (model.isValueValid(c)){
                        model.setValue(ligne,i,c);
                    }
                }
                ligne++;
            }

        }catch (FileNotFoundException e){
            System.out.println("Le fichier n'éxiste pas");
        }
        return model;
    }

    @Override
    public SudokuVue getVue(String fileName) {
        SudokuFactory9x9 factory = new SudokuFactory9x9();
        SudokuModel9x9 model = factory.getModel(fileName);
        SudokuVue9x9 vue = new SudokuVue9x9(model);
        return vue;
    }

}
