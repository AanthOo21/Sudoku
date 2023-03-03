package be.technifutur.sudoku.Sudoku4x4;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuVue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuFactory4x4 implements ModelFactory {
    @Override
    public SudokuModel4x4 getModel(String fileName) {
        SudokuModel4x4 model = new SudokuModel4x4();
        File file4x4 = new File(fileName);
        try(Scanner scanner = new Scanner(file4x4)){
            int ligne = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                for (int i = 0; i < 4; i++) {
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
        SudokuFactory4x4 factory = new SudokuFactory4x4();
        SudokuModel4x4 model = factory.getModel(fileName);
        SudokuVue4x4 vue = new SudokuVue4x4(model);
        return vue;
    }

}
