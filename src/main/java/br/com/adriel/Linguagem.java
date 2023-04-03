package br.com.adriel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {
	
	@Id
	private String id;
	private String titulo;
	private String imagem;
	private int ranking;
	
	public Linguagem() {
		
	}
	
	public Linguagem(String titulo, String imagem, int ranking) {
		super();
		this.titulo = titulo;
		this.imagem = imagem;
		this.ranking = ranking;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	

}
