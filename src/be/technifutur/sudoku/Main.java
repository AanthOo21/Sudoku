package be.technifutur.sudoku;

import be.technifutur.sudoku.Sudoku4x4.SudokuFactory4x4;
import be.technifutur.sudoku.Sudoku9x9.SudokuFactory9x9;
import be.technifutur.sudoku.SudokuModelSamourai.SudokuFactorySamourai;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Sudoku 4x4");

        ModelFactory factory = new SudokuFactory4x4();
        SudokuControler controler = new SudokuControler(factory);
        controler.start("ressource\\sudoku4x4.txt");

        System.out.println("-------------------");

        System.out.println("Sudoku 9x9");

        ModelFactory factory1 = new SudokuFactory9x9();
        SudokuControler controler1 = new SudokuControler(factory1);
        controler1.start("ressource\\sudoku9x9");

        System.out.println("-------------------");

        System.out.println("Sudoku Samourai");

        ModelFactory factory2 = new SudokuFactorySamourai();
        SudokuControler controler2 = new SudokuControler(factory2);
        controler2.start("ressource\\sudokuSamourai");

        System.out.println("-------------------");
    }
}
