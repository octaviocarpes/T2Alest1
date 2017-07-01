package com.T2Alest1;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Octavio on 6/16/2017.
 */
public class LeitorDeArquivos {


   private BufferedReader reader;
   private ArrayList<String> lista;

    public LeitorDeArquivos(String s) {
        try {
            reader = new BufferedReader(new FileReader(s));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        lista = new ArrayList<>();
    }

    public ArrayList<String> leArquivo(){
        try {
            String s = null;
            while((s = reader.readLine()) != null){
                //System.out.println(s);

                String[] z = new String[2];

                z = s.split(";");

                lista.add(z[0].toLowerCase());
                lista.add(z[1].toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void setPath(String s){
        try {
            reader = new BufferedReader(new FileReader(s));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
