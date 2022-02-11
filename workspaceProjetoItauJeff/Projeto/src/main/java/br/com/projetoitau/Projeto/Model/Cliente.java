package br.com.projetoitau.Projeto.Model;


// Importando as anotaçoes necessárias para realizar a conexao dos campos com a tabela
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Na anotaçao abaixo diz que a classe conta sera armazenada e recuperada na tabela
@Entity
@Table(name="projetocliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome",length=100)
	private String nome;
	@Column(name="cpf",length=14)
	private String cpf;
	@Column(name="telefone",length=15)
	private String telefone;
	@Column(name="email",length=100)
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
		

}

	