package be.technifutur.sudoku.Sudoku4x4;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;

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
//                System.out.println(line);
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

}
