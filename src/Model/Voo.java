package Model;

public class Voo {
	private String horario;
	private String dataInicial;
	private String dataFinal;
	private String localDestino;
	private String localPartida;

	public Voo(String horario, String dataInicial, String dataFinal, String localDestino, String localPartida) {
		this.horario = horario;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.localDestino = localDestino;
		this.localPartida = localPartida;
	}
	
	@Override
	public String toString() {
		return "[Horário: " + horario + ", Data ida: " + dataInicial + ", Data volta: " + dataFinal
				+ ", Destino: " + localDestino + ", Local de Partida: " + localPartida + "]";
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public String getLocalDestino() {
		return localDestino;
	}
	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}
	public String getLocalPartida() {
		return localPartida;
	}
	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}
	
	
}
