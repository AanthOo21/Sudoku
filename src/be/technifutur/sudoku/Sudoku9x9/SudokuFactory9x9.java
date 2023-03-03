package be.technifutur.sudoku.Sudoku9x9;

import be.technifutur.sudoku.ModelFactory;
import be.technifutur.sudoku.SudokuModel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuFactory9x9 implements ModelFactory {
    @Override
    public SudokuModel getModel(String fileName) {
        SudokuModel model = new SudokuModel9x9();
        File file = new File("sudoku9x9.txt");
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
