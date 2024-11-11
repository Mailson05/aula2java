package service;

import model.Pessoa;

import java.util.ArrayList;

public class PessoaService {
    private ArrayList<Pessoa>pessoas = new ArrayList<>();


    public void cadastrarPessoa(Pessoa p){
        pessoas.add(p);
        System.out.println("cadastrada com Sucesso!");
    }
    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    public ArrayList<Pessoa>listar(){
        return pessoas;
    }
}
