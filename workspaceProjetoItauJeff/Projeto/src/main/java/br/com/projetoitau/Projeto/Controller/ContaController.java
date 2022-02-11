package br.com.projetoitau.Projeto.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoitau.Projeto.Dao.ContaDao;
import br.com.projetoitau.Projeto.Model.Conta;
@CrossOrigin	
@RestController
public class ContaController {
	
	@Autowired
	private ContaDao dao;
	
	@GetMapping("/contas")
	
	// Criando um método para mostrar os vários registros da tabela
	public ArrayList<Conta> recuperarTudo(){
		ArrayList<Conta> lista;
		lista = (ArrayList<Conta>)dao.findAll();
		return lista;

	}
	
	// Cria um contexto de filtro para a nossa API
	@GetMapping("/contas/{id}")
	public Conta recuperarConta(@PathVariable int id) {
		return dao.findById(id).orElse(null);	
		}
	
	
}