package be.technifutur.sudoku;

public interface SudokuVue {
    /** Retourne la String du tableau Sudoku */
    String getScreen();
    /** Renvoie le model de Sudoku */
    SudokuModel getModel();

}
