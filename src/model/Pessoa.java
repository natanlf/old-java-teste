package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="pessoa")
	public class Pessoa {

	 private String nome; 
	 private String cidade; 
	 @Id
	 int id;
	 public String getNome() {
	  return nome;
	 }
	 public void setNome(String nome) {
	  this.nome = nome;
	 }
	 public String getCidade() {
	  return cidade;
	 }
	 public void setCidade(String cidade) {
	  this.cidade = cidade;
	 }
	 public int getId() {
	  return id;
	 }
	 public void setId(int id) {
	  this.id = id;
	 } 
	}

