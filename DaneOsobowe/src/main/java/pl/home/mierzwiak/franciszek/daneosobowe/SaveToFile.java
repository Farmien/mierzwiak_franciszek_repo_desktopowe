/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.home.mierzwiak.franciszek.daneosobowe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author frane
 */
public class SaveToFile {
    public void saveToFile(String filename, ArrayList<DaneOsobowe> list) throws IOException{
        File plik = new File(filename);
        FileWriter fw = new FileWriter(plik);
        int i = 0;
        while(list.get(i) != null){
            fw.write(list.get(i).getImie());
            i++;
        }
        fw.close();
    }
}