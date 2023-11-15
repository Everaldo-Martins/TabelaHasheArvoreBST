package atividade04;

import org.w3c.dom.Node;

public class ArvorePV<Key extends Comparable<Key>, Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private No raiz;

    private class No {
        Key key;
        Value value;
        No left, right;
        int size;
        boolean cor;

        public No(Key key, Value value, int size, boolean color){
            this.key = key;
            this.value = value;
            this.size = size;
            this.cor = cor;
        }
    }

    //Aqui vai rotacionar para a esquerdq
    private No rotacionar_Left(No h){
        No x = h.right;
        h.right = x.left;
        x.left = h;
        x.cor = h.cor;
        h.cor = RED;
        x.size = h.size;
        h.size = 1 + size(h.left) + size(h.right);
        return x; 
    }

    //E aqui para direita
    private No rotacionar_Right(No h){
        No x = h.left;
        h.left = x.right;
        x.right = h;
        x.cor = h.cor;
        h.cor = RED;
        x.size = h.size;
        h.size = 1+ size(h.left) + size(h.right);
        return x;
    }

    //Vai inverter as cores do nó e dos seus nós filhos
    private void inverter_Cor(No h){
        h.cor = RED;
        h.left.cor = BLACK;
        h.right.cor = BLACK;
    }

    //Número de nós na subárvore
    private int size(No x){
        if(x == null) return 0;
        return x.size;
    }

    //Verificação da cor vermelha
    private boolean isRed(No x){
        if(x == null) return false;
        return x.cor == RED;
    }

    //Inserir novo nó
    public void put(Key key, Value value){
        raiz = put(raiz, key, value);
        raiz.cor = BLACK;
    }

    private No put(No h, Key key, Value value){
        if(h == null) return new No(key, value, 1, RED);
        int c = key.compareTo(h.key);
        if(c < 0) h.left = put(h.left, key, value);
        else if(c > 0) h.right = put(h.right, key, value);
        else h.value = value;
        
        //Correção de violação das propriedades da árvore
        if (isRed(h.right) && !isRed(h.left)) h = rotacionar_Left(h);
        if (isRed(h.left) && isRed(h.left.left)) h = rotacionar_Right(h);
        if (isRed(h.left) && isRed(h.right)) inverter_Cor(h);

        h.size = size(h.left) + size(h.right) + 1;

        return h;
    }

    public Value get(Key key) {
        return get(raiz, key);
    }

    private Value get(No x, Key key){
        while(x != null){
            int c = key.compareTo(x.key);
            if(c < 0) x = x.left;
            else if(c > 0) x = x.right;
            else return x.value;
        }
        return null;
    }

}
