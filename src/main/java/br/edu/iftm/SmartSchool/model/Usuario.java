package br.edu.iftm.SmartSchool.model;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario implements java.io.Serializable {
    private String login;
	private String senha;
	private Integer rg;
	@NotNull (message = "O telefone não pode ser vazio!")
	private String telefone;
	private Date dataNasc;
	private String email;
	private String nome;
	@Size(min = 11, message = "Minimo 11")
	private String cpf;
	private String endereco;

	public Usuario() {
	}

	public Usuario(String login, String senha, Integer rg, String telefone, Date dataNasc, String email, String nome,
			String cpf, String endereco) {
		this.login = login;
		this.senha = senha;
		this.rg = rg;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getRg() {
		return this.rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataNasc() {
		return this.dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
