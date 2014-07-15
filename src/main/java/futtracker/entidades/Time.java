package futtracker.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Time {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private Double maiorDistancia;
	private Double distanciaAcumulada;
	
	@Lob
	private byte[] logo;
	
	@OneToMany
	private List<Jogo> jogos = new ArrayList<Jogo>();

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

	public Double getMaiorDistancia() {
		return maiorDistancia;
	}

	public void setMaiorDistancia(Double maiorDistancia) {
		this.maiorDistancia = maiorDistancia;
	}

	public Double getDistanciaAcumulada() {
		return distanciaAcumulada;
	}

	public void setDistanciaAcumulada(Double distanciaAcumulada) {
		this.distanciaAcumulada = distanciaAcumulada;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	
	
	
}
