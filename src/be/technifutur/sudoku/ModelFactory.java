package be.technifutur.sudoku;

public interface ModelFactory {
    SudokuModel getModel(String fileName);

    SudokuVue getVue (String fileName);
}
