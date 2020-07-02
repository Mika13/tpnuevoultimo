package main;

public class HumedadRequest extends ClimaRequest{

	static protected int ultimo_id = 500;

	public HumedadRequest(String idOperadorOrigen, String idOperadorDestino) {
		super(idOperadorOrigen, idOperadorDestino);
		ultimo_id++;
		this.esRequest = true;
		this.contenido = "";

	}

}