/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.home.mierzwiak.franciszek.daneosobowe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frane
 */
public class SaveToFile {
    String file_name = "dane_osobowe.csv";
    public void saveToFile(String text){
        try{
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text+"\n");
            fw.close();
            PrintWriter pw = new PrintWriter(fw,true);
        }catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void clearFile(){
        try{
            FileWriter fw = new FileWriter(new File(file_name),true);
            PrintWriter pw = new PrintWriter(fw,true);
            pw.print("");
            pw.close();
        }catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

