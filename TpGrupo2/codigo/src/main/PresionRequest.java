package main;

public class PresionRequest extends ClimaRequest {

	static protected int ultimo_id = 5000;

	public PresionRequest(String idOperadorOrigen, String idOperadorDestino) {
		super(idOperadorOrigen, idOperadorDestino);
		ultimo_id++;
		this.esRequest = true;
		this.contenido = "";

	}

}
