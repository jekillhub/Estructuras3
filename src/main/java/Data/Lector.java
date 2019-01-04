/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Context.Vino;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Lector {
    
    public static ArrayList<Vino> read() throws FileNotFoundException{
        String title;
        String country;
        String description;
        String price;
        Vino vino;
        ArrayList<Vino> cava = new ArrayList<>();
        
        String path = "datos-vino.csv";
        BufferedReader br = null;
        String line = "";
        String datSplitBy = ",";
        
        try {
            br = new BufferedReader(new FileReader(path));
            int first=1;
            while ((line = br.readLine()) != null) {
                String[] auxVino = line.split(datSplitBy);

                for(int i=0;i<auxVino.length;i++){
                    System.out.println(auxVino[i]);
                }

                title = auxVino[11].replace("", "Unknown");
                country = auxVino[1].replace("", "Unknown");
                description = auxVino[2].replace("", "Unknown");
                price = auxVino[5].replace("", "0.0");

                if (!(first==1)){
                    vino = new Vino(title, country, description, Double.parseDouble(price));
                    cava.add(vino);
                }
                first = 0;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return cava;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Vino> vinos = read();
        for (int i=0;i<vinos.size();i++){
            System.out.println(vinos.get(i).getTitle());
        }
    }
    
}
