
public class Competencia {

	private String competencia;
	
	public Competencia(String competencia) {
		this.competencia = competencia;
	}
	
	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	@Override
	public String toString() {
		return competencia;
	}
}