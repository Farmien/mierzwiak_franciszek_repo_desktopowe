/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.home.mierzwiak.franciszek.listazakupow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author frane
 */
public class JavaUtils{
    private String file_name = "lista_zakopow.csv";
    public void saveToFile(String text){
        try{
            FileWriter fw = new FileWriter(new File(file_name),true);
            fw.write(text + "\n");
            fw.close();
        }catch(IOException ex){
            Logger.getLogger(JavaUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
