package Main;

import Context.Analysis;
import Context.Vino;
import Data.Lector;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Vino> cava = new ArrayList<Vino>();
        cava = Lector.read();

        System.out.println("VINOS CON PRECIO MAYOR A 500 DÓLARES");
        System.out.println("");
        Analysis.mostrarMayores500(Analysis.mayores500(cava));

        System.out.println("");

        System.out.println("PAÍSES DE ORIGEN DE LOS VINOS CON PRECIO MAYOR A 500 DÓLARES");
        System.out.println("");
        Analysis.mostrarPaises(Analysis.mayores500(cava));

    }

}
