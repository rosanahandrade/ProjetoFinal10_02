package br.com.projetoitau.Projeto.Dao;


import org.springframework.data.repository.CrudRepository;

import br.com.projetoitau.Projeto.Model.Conta;

// extends amplia as caracteristicas da classe que iremos colocar
public interface ContaDao extends CrudRepository<Conta,Integer>{ 
	 
	
}
