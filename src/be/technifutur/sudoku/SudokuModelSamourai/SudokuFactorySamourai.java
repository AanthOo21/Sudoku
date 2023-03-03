package be.technifutur.sudoku.SudokuModelSamourai;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuFactorySamourai implements ModelFactory {
    @Override
    public SudokuModel getModel(String fileName) {
        SudokuModel model = new SudokuSamourai();
        File file = new File("sudokuSamourai.txt");
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Le fichier n'existe pas");
        }
        return model;
    }

}
