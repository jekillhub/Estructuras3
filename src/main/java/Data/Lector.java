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
    
    public ArrayList<Vino> read() throws FileNotFoundException{
        String country;
        String description;
        String price;
        
        ArrayList<Vino> cava = new ArrayList<>();
        
        String path = "datos-vino.csv";
        BufferedReader br = null;
        String line = "";
        String datSplitBy = ";";
        
        return cava;
    }
    
}
