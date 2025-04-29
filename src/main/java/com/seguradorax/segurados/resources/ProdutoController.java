package com.seguradorax.segurados.resources;

import com.seguradorax.segurados.repositorys.RepositoryProduto;
import com.seguradorax.segurados.tables.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private RepositoryProduto repositoryProduto;


    @GetMapping
    public List<Produto> getAllProducts() {
        return repositoryProduto.findAll();
    }


}