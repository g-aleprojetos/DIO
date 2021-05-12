package com.avanade.dio.api.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.avanade.dio.api.models.Produto;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    public List<Produto> findAll(){
        List<Produto> listaProduto = new ArrayList<Produto>();
        Produto p1 = new Produto(1, "descricao1", new Date(), "123456789", true);
        Produto p2 = new Produto(2, "descricao1", new Date(), "987654321", true);
        listaProduto.add(p1);
        listaProduto.add(p2);
         return listaProduto;
    }

    public void inserir(Produto produto){
        System.out.println("Inserido: " + produto);
    }
    
    public void alterar(Produto produto){
        System.out.println("Alterado: " + produto);
    }

    public void excluir(Long id){
        System.out.println("Excluido: " + id);
    }

}
