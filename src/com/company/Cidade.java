package com.company;

import java.util.ArrayList;

public class Cidade {

    private String nomeCidade;
    private ArrayList<Cidade> cidades = new ArrayList<>();

    public Cidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public void fazerRodovia (Cidade a) {
        if(!ligacao(a)) {
            cidades.add(a);
        }
    }

    public boolean ligacao (Cidade a) {
        for (Cidade cidade : this.cidades) {
            if (cidade == a)
                return true;
        }
        return false;
    }

    public ArrayList<Cidade> getCidades(){
        return this.cidades;
    }

    public String toString(){
        return this.nomeCidade;
    }
}
