package be.technifutur.sudoku;

import java.util.Scanner;

public class SudokuControler {

    ModelFactory factory;

    public SudokuControler (ModelFactory factory) {
        this.factory = factory;
    }

    public void start (String fileName){
        Scanner scanner = new Scanner(System.in);
        String reponse;

        SudokuVue vue = factory.getVue(fileName);
        SudokuModel model = vue.getModel();
        System.out.println(vue.getScreen());
        System.out.println("Q pour quitter ou entrer une ligne, une colonne et une valeur. Séparé par des points");
        reponse = scanner.nextLine();

        while (!reponse.equalsIgnoreCase("q")){
            String tab [] = reponse.split("\\.");
            int line = Integer.parseInt(tab[0])-1;
            int col = Integer.parseInt(tab[1])-1;
            char val = tab[2].charAt(0);
            model.setValue(line, col, val);
            System.out.println(vue.getScreen());
            System.out.println("Entrer une ligne, une colonne et une valeur. Séparé par des points");
            reponse = scanner.nextLine();
        }
    }
}
