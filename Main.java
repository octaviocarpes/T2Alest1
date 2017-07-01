package com.T2Alest1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LeitorDeArquivos leitor = new LeitorDeArquivos("/Users/octaviocarpes/Dropbox/T2Alest1/nomes.txt");

        // leitor.setPath(" inserir caminho do arquivo aqui ");

        ArrayList<String> aux = leitor.leArquivo();


        //System.out.println(aux.get(2));

        TreeOfChar tree = new TreeOfChar();

       // tree.add(aux.get(0),aux.get(1));


//        System.out.println(aux.get(0));
//        System.out.println(aux.get(1));
//        System.out.println(aux.get(2));
//        System.out.println(aux.get(3));
//        System.out.println(aux.get(4));
//        System.out.println(aux.get(5));
//        System.out.println(aux.get(6));
//        System.out.println(aux.get(7));
//        System.out.println(aux.get(8));
//        System.out.println(aux.get(9));
//        System.out.println(aux.get(10));
//        System.out.println(aux.get(11));
//        System.out.println(aux.get(12));
//        System.out.println(aux.get(13));
//        System.out.println(aux.get(14));
//        System.out.println(aux.get(15));
//        System.out.println(aux.get(16));
//        System.out.println(aux.get(17));
//        System.out.println(aux.get(18));
//        System.out.println(aux.get(19));

        for (int i = 0; i < aux.size()/2 ; i++) {
            tree.add(aux.get(2*i),aux.get((2*i)+1));
        }


        tree.pesquisa("bea");

        //tree.add(aux.get(0),aux.get(1));

        //tree.print();
    }
}
