package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GrafoDeCidades {

    ArrayList<Cidade> cid;

    public void criarRodoviaEntre(Cidade n, Cidade m) {
        n.fazerRodovia(m);
        m.fazerRodovia(n);
    }

    public void DFS (Cidade a) {
        System.out.println("> Busca em Profundidade");
        cid = new ArrayList<>();
        realDFS(a);
    }

    public void realDFS (Cidade a) {
        if (!cid.contains(a)) {
            System.out.println(a.toString() + " at DFS");
            cid.add(a);
            for(Cidade cidade : a.getCidades()) {
                realDFS(cidade);
            }
        }
    }

    public void BFS (Cidade a) {
        System.out.println("> Busca em Largura");
        ArrayDeque<Cidade> fila = new ArrayDeque<>();
        cid = new ArrayList<>();
        cid.add(a);
        fila.addFirst(a);
        while(!fila.isEmpty()) {
            Cidade cidade = fila.removeLast();
            for (Cidade iterator : cidade.getCidades()) {
                if(!cid.contains(iterator)) {
                    System.out.println(iterator.toString());
                    fila.push(iterator);
                    cid.add(iterator);
                }
            }
        }
    }
}
