package Context;

import java.util.ArrayList;

/**
 * @author Jekill
 */
public class Analysis {

    public static ArrayList<Vino> mayores500(ArrayList<Vino> cava) {
        ArrayList<Vino> mayores = new ArrayList<Vino>();

        for (int i = 0; i < cava.size(); i++) {
            if (cava.get(i).getPrice() > 500) {
                mayores.add(cava.get(i));
            }
        }
        return mayores;
    }

    public static void mostrarMayores500(ArrayList<Vino> mayores) {
        for (int i = 0; i < mayores.size(); i++) {
            System.out.println("Nombre: " + mayores.get(i).getTitle() + "\t" + "Precio: " + mayores.get(i).getPrice());
        }
    }

    public static void mostrarPaises(ArrayList<Vino> mayores) {
        for (int i = 0; i < mayores.size(); i++) {
            System.out.println("Nombre: " + mayores.get(i).getTitle() + "\t" + "País: " + mayores.get(i).getCountry());
        }
    }


}