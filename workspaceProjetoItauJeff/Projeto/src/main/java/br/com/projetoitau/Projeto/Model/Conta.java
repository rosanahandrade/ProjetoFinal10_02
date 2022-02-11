package br.com.projetoitau.Projeto.Model;

//importando as anotações necessárias para realizar a conexão dos campos com a tabela
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


// Na anotação abaixo diz que a classe conta será recuperada na tabela
@Entity
@Table(name="projetoconta")
public class Conta {
	
	// Indica que o atributo indica a chave primária
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	//Vamos criar um tipo de dados correspondente a nossa tabela de conta
	@Column(name="numero")
	private int numero;
	@Column(name="agencia")
	private int agencia;
	@Column(name="tipo")
	private int tipo;
	@Column(name="saldo")
	private int saldo;
	
	
	// Chamando o campo de vinculo com outra tabela
	@ManyToOne
	@JoinColumn(name="id_titular", insertable = false, updatable = false)
	private Cliente cliente;


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}


