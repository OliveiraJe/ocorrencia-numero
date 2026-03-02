package controller;

public class OcorrenciaNumeroController {
	public OcorrenciaNumeroController() {
		super();
	}

	public int ocorrencia(int a, int b) {
		// condição de parada
		if (a == 0) {
			return 0;
		}
		
		// extrai o último digito
		int ultimoNumero = a % 10;

		// se o 2º número digitado coincide com um dos algarismos contidos no 1º número digitado
		// adiciona - se 1 ao contador, se não coincidir adiciona 0.
		if (ultimoNumero == b) {
			return 1 + ocorrencia(a / 10, b);
		} else {
			return 0 + ocorrencia(a / 10, b);
		}

	}
}
