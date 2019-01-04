package Auxiliar;

import Context.Vino;

import java.util.*;

public class Busqueda {

    /**
     * Método que realiza una busqueda lineal de una caracteristica específica en un ArrayList de Vino.
     * @param arr ArrayList de Vinoes.
     * @param busqueda Km Actuales a buscar.
     * @return los resultados de la busqueda lineal.
     */

    public static ArrayList<Integer> linearSearchNombre(ArrayList<Vino> arr, String busqueda) {

        ArrayList<Integer> resultados = new ArrayList<Integer>();
        int index = 0;

        while (index < arr.size()) {

            if (arr.get(index).getMarca().equals(busqueda)) {
                resultados.add(index);
            }

            index++;
        }

        if (resultados.size() == 0) {
            resultados.add(-1);
        }

        return resultados;
    }
}


