package futtracker.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class EstatisticaTime {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Time time;
	
	private Double maiorDistancia;
	private Double distanciaAcumulada;
	
	@OneToMany
	private List<EstatisticaJogador> estatisticasJogadores = new ArrayList<EstatisticaJogador>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
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

	public List<EstatisticaJogador> getEstatisticasJogadores() {
		return estatisticasJogadores;
	}

	public void setEstatisticasJogadores(
			List<EstatisticaJogador> estatisticasJogadores) {
		this.estatisticasJogadores = estatisticasJogadores;
	}
	
	
}
