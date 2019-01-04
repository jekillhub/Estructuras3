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

}