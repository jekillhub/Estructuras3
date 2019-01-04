package Context;

import java.util.ArrayList;

/**
 * @author Jekill
 */
public class Analysis {

    /**
     * Extrae, de los vinos provenientes del .csv, los que presentan un precio mayor a 500 dolares.
     * @param cava ArrayList que contiene los vinos provenientes del .csv
     * @return ArrayList<Vino> que contiene los vinos con precio mayor a 500 dolares.
     * */
    public static ArrayList<Vino> mayores500(ArrayList<Vino> cava) {
        ArrayList<Vino> mayores = new ArrayList<Vino>();

        for (int i = 0; i < cava.size(); i++) {
            if (cava.get(i).getPrice() > 500) {
                mayores.add(cava.get(i));
            }
        }
        return mayores;
    }

    /**
     * Muestra el nombre y precio de los vinos con precio mayor a 500 dolares.
     * @param mayores  Contiene los vinos con precio mayor a 500 dolares.
     * */
    public static void mostrarMayores500(ArrayList<Vino> mayores) {
        for (int i = 0; i < mayores.size(); i++) {
            System.out.println("Nombre: " + mayores.get(i).getTitle() + "\t" + "Precio: " + mayores.get(i).getPrice());
        }
    }

    /**
     * Muestra el nombre y pais de los vinos con precio mayor a 500 dolares.
     * @param mayores  Contiene los vinos con precio mayor a 500 dolares.
     * */
    public static void mostrarPaises(ArrayList<Vino> mayores) {
        for (int i = 0; i < mayores.size(); i++) {
            System.out.println("Nombre: " + mayores.get(i).getTitle() + "\t" + "País: " + mayores.get(i).getCountry());
        }
    }

    /**
     * Realiza un analisis de los vinos cuyo precio es mayor a 500 dolares, buscando similitudes en su descripcion.
     * @param mayores  Contiene los vinos con precio mayor a 500 dolares.
     * @return ArrayList<Vino> contiene los vinos con caracteristicas similares ordenados.
     * */
    public static ArrayList<Vino> analisisTexto(ArrayList<Vino> mayores){
        return null;
    }

    /**
     * Muestra los vinos ordenados acorde a una caracteristica comun.
     * @param similares  Contiene los vinos con descripciones similares ordenados en funcion de esa caracteristica.
     * */
    public void mostrarSimilares(ArrayList<Vino> similares){
        for(int i=0;i<similares.size();i++){
            System.out.println("Nombre: " + similares.get(i).getTitle() + "\t" + "Descripción: " + similares.get(i).getDescription());
        }
    }
}