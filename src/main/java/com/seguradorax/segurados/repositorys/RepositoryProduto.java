package com.seguradorax.segurados.repositorys;

import com.seguradorax.segurados.tables.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryProduto extends JpaRepository<Produto, Long> {


}