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
        String datSplitBy = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
        String empty = "";
        try {
            br = new BufferedReader(new FileReader(path));
            int first=1;
            while ((line = br.readLine()) != null) {
                String[] auxVino = line.split(datSplitBy);
                title = auxVino[11];
                if (title.equals(empty)){
                    title = "Unknown";
                }
                country = auxVino[1];
                if (country.equals(empty)){
                    country = "Unknown";
                }
                description = auxVino[2];
                if (description.equals(empty)){
                    description = "Unknown";
                }
                price = auxVino[5];
                if (price.equals(empty)){
                    price = "0";
                }
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
