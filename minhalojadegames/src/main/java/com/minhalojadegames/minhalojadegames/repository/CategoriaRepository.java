package com.minhalojadegames.minhalojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhalojadegames.minhalojadegames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
	
	public List<Categoria> findAllByformaPagamentoContainingIgnoreCase(String formaPagamento);

}
