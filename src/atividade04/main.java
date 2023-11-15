package atividade04;
import atividade04.ArvorePV;
import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        ArvorePV<Integer, String> arvorePV = new ArvorePV<>();

        // Inserção de alguns elementos na árvore
        arvorePV.put(10, "Valor 5");
        arvorePV.put(5, "Valor 10");
        arvorePV.put(15, "Valor 30");
        arvorePV.put(3, "Valor 3");
        arvorePV.put(7, "Valor 7");

        // Busca por valores
        System.out.println("Valor para chave 10: " + arvorePV.get(5));
        System.out.println("Valor para chave 5: " + arvorePV.get(10));
        System.out.println("Valor para chave: " +arvorePV.get(30));
        System.out.println("Valor para chave: " +arvorePV.get(7));

    }
}



