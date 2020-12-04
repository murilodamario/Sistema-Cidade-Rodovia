package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cidade> cid = new ArrayList<>();

        cid.add(new Cidade("Campinas"));  // 0
        cid.add(new Cidade("Sumaré"));
        cid.add(new Cidade("Wakanda"));
        cid.add(new Cidade("Indaituba"));
        cid.add(new Cidade("Valinhos"));
        cid.add(new Cidade("Salto")); // 5
        cid.add(new Cidade("Brooklyn"));
        cid.add(new Cidade("Limeira"));
        cid.add(new Cidade("HortoCity"));
        cid.add(new Cidade("Nova Odessa")); // 9


        GrafoDeCidades gdc = new GrafoDeCidades();

        gdc.criarRodoviaEntre(cid.get(0), cid.get(5));
        gdc.criarRodoviaEntre(cid.get(0), cid.get(1));
        gdc.criarRodoviaEntre(cid.get(5), cid.get(9));
        gdc.criarRodoviaEntre(cid.get(5), cid.get(4));
        gdc.criarRodoviaEntre(cid.get(1), cid.get(4));
        gdc.criarRodoviaEntre(cid.get(1), cid.get(2));
        gdc.criarRodoviaEntre(cid.get(9), cid.get(6));
        gdc.criarRodoviaEntre(cid.get(2), cid.get(8));
        gdc.criarRodoviaEntre(cid.get(8), cid.get(7));
        gdc.criarRodoviaEntre(cid.get(8), cid.get(3));


        gdc.DFS(cid.get(0));
        gdc.BFS(cid.get(0));
    }
}
