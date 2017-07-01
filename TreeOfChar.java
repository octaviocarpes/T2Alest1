package com.T2Alest1;

import java.util.ArrayList;
import java.util.Stack;

public class TreeOfChar {


    private class Node {

        private boolean endOfWord;
        private Node father;
        private char element;
        private String significado;
        private ArrayList<Node> filhos;

        public Node(char element) {
            this.element = element;
            father = null;
            significado = "";
            filhos = new ArrayList<>();
            endOfWord = false;
        }

        public ArrayList<Node> getFilhos() {
            return filhos;
        }

        public boolean isExternal() {
            if (filhos.size() == 0) {
                return true;
            }
            return false;
        }

        public boolean equals(Node node) {
            if (node.element == this.element) return true;
            return false;
        }
    }


    private Node root;
    private int count;
    private ArrayList<String> palavras;

    public TreeOfChar() {
        root = new Node('ˆ');
        root.father = null;
        count = 0;
        palavras = new ArrayList<>();
    }

    //Desempenho O(1) pois apenas chama o metodo addNode
    public void add(String palavra, String significado) {

        int tamPalavra = 0;

        addNode(root, palavra, tamPalavra, significado);

    }


    // Desempenho O(nˆ2) pois a cada addNode que se chama sao verificados todos os seus filhos
    private void addNode(Node node, String palavra, int tamPalavra, String significado) {

        if (tamPalavra == palavra.length()) {
            node.endOfWord = true;
            node.significado = significado;
            return;
        }

        boolean verifica = false;

        char c = palavra.charAt(tamPalavra);
        Node x = new Node(c);
        tamPalavra++;

        for (int i = 0; i < node.filhos.size(); i++) {
            if (node.filhos.get(i).element == c) {
                verifica = true;
                x = node.filhos.get(i);

            }
        }

        if (verifica != true) {
            Node n = new Node(c);
            node.filhos.add(n);
            n.father = node;
            addNode(n, palavra, tamPalavra, significado);
        }

        addNode(x, palavra, tamPalavra, significado);

    }


    public void pesquisa(String palavra) {

        int tamPalavra = 0;
        searchNodes(root, palavra,tamPalavra);

    }


    private void searchNodes(Node node, String palavra, int tamPalavra) {

        if (tamPalavra == palavra.length()){
            return;
        }

        char c = palavra.charAt(tamPalavra);
        tamPalavra++;

        boolean verifica = false;

        for (int i = 0; i < node.filhos.size() ; i++) {
            
        }

    }


//    public void print() {
//        for (int i = 0; i < root.filhos.size() ; i++) {
//            System.out.println(root.filhos.get(i).element);
//        }
//
//        System.out.println("**********************");
//
//        for (int i = 0; i < root.filhos.get(0).filhos.size() ; i++) {
//            System.out.println(root.filhos.get(0).filhos.get(i).element);
//        }
//    }
}