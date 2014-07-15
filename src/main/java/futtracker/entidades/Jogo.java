package futtracker.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Jogo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne
	private EstatisticaTime timeMandante;
	
	@OneToOne
	private EstatisticaTime timeVisitante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EstatisticaTime getTimeMandante() {
		return timeMandante;
	}

	public void setTimeMandante(EstatisticaTime timeMandante) {
		this.timeMandante = timeMandante;
	}

	public EstatisticaTime getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(EstatisticaTime timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	
	
	
	
}
