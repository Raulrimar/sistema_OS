package com.valdir.heldesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {// a classe cliente se extenda a classe pessoa
    private List<Chamado> chamados = new ArrayList<>();//cliente terá uma lsita de chamados feitos
    
    public Cliente(){
        super();
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha) {
        super(id, nome, cpf, email, senha);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
    
    
}

