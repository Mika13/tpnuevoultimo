package main;

public class NubosidadRequest extends ClimaRequest{

	static protected int ultimo_id = 7000;

	public NubosidadRequest(String idOperadorOrigen, String idOperadorDestino) {
		super(idOperadorOrigen, idOperadorDestino);
		ultimo_id++;
		this.esRequest = true;
		this.contenido = "";

	}

}
