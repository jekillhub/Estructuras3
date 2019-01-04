package Context;

import java.util.ArrayList;
/**
 *
 * @author Jekill
 */
public class Analysis {

    public static ArrayList<Vino> mayores500(ArrayList<Vino> cava){
        ArrayList<Vino> mayores = new ArrayList<Vino>();

        for (int i=0; i<cava.size(); i++){
            if(cava.get(i).getPrice() > 500){
                mayores.add(cava.get(i));
            }
        }
        return mayores;
    }

    public static ArrayList<String> paisOrigen(ArrayList<Vino> mayores){
        ArrayList<String> paises = new ArrayList<String>();

        for (int i=0; i<mayores.size(); i++){
            paises.add(mayores.get(i).getCountry());
        }
        return paises;
    }



}