package Auxiliar;

import Context.Vino;

import java.util.ArrayList;

public class Ordenamiento {

    /**
     * Método que realiza una ordenamiento por Selection Sort del ArrayList de Vino, considerando una caracteristica comun.
     *
     * @param arr ArrayList de Vinos.
     * @return arr ordenado.
     */

    public static ArrayList<Vino> insertionSortMarca(ArrayList<Vino> arr) {

        Vino key;

        for (int j = 1; j < arr.size(); j++) {
            key = arr.get(j);
            int i = j - 1;
            while (i >= 0) {
                if ((key.getMarca()).compareTo(arr.get(i).getMarca()) > 0) {
                    break;
                }
                arr.set(i + 1, arr.get(i));
                i--;
            }
            arr.set(i + 1, key);
        }
        return arr;
    }

}