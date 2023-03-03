package be.technifutur.sudoku;

public interface SudokuModel {
    char EMPTY = 0;
    /** Retourne le nombre de cellules valide dans le sudoku
     * @return le nombre de cellules */
    int cellCount();
    /** Retourne la valeur d'une cellule dans le sudoku
     * @return une valeur en char */
    char getValue(int line, int column);
    /** Retourne la valeur d'une cellule dans le sudoku
     * @return rien  */
    void setValue(int line, int column, char value);
    /** Retourne le maximum de lignes possible dans le sudoku
     * @return le maximum de lignes en int */
    int getMaxLine();
    /** Retourne le maximum de colonnes possible dans le sudoku
     * @return le maximum de colonnes en int */
    int getMaxColumn();
    /** Renvoie si oui ou non la position est valide dans le sudoku
     * @return si la position est comprise dans le sudoku en booleen  */
    boolean isPositionValid(int line, int column);
    /** Renvoie si oui ou non la valeur est valide dans le sudoku
     * @return si la valeur est acceptable dans le sudoku en booleen  */
    boolean isValueValid(char value);
    /** Regarde si la position du tableau est vide (contient 0)
     @return un booleen si oui ou non elle est vide */
    boolean isEmpty(int line, int column);
    /** Clear une position du tableau (ajoute un 0) */
    void clear (int line, int column);

}
