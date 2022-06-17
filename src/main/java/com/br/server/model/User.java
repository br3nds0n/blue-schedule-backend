package com.br.server.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.persistence.Table;

@Entity
@Table(name = "user_tb")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

  @Column
  private String nome;

  @Column
	@Email
  private String email;

  @Column
  private String telefone;

  public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

  @Override
	public int hashCode() {
		return Objects.hash(id);
	}

  @Deprecated
	protected User() {}

  public User(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

  @Override
	public String toString() {
		return "User [nome=" + nome + "]";
	}
}
