package ac.cr.cenfotec.logica;

public class CadenaLetras {

	public CadenaLetras() {

	}

	public String codificar(String texto, int codigo) throws Exception {

		return acumulateStringCode(texto, codigo);
	}

	private String acumulateStringCode(String texto, int codigo) throws Exception {
		StringBuilder cifrado = new StringBuilder();

		if (lowerThan25(codigo)) {
			codigo = codigo % 26;
			for (int i = 0; i < texto.length(); i++) {
				if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
					if ((texto.charAt(i) + codigo) > 'z') {
						cifrado.append((char) (texto.charAt(i) + codigo - 26));
					} else {
						cifrado.append((char) (texto.charAt(i) + codigo));
					}
				} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
					if ((texto.charAt(i) + codigo) > 'Z') {
						cifrado.append((char) (texto.charAt(i) + codigo - 26));
					} else {
						cifrado.append((char) (texto.charAt(i) + codigo));
					}
				}
			}
		} else {
			throw new Exception("Numero mayor a 25 o menor a 0");
		}

		return cifrado.toString();
	}

	public String decodificar(String texto, int codigo) throws Exception {
		return returnStringDecode(texto, codigo);
	}

	private String returnStringDecode(String texto, int codigo) throws Exception {
		StringBuilder cifrado = new StringBuilder();
		if (lowerThan25(codigo)) {
			codigo = codigo % 26;
			for (int i = 0; i < texto.length(); i++) {
				if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
					if ((texto.charAt(i) - codigo) < 'a') {
						cifrado.append((char) (texto.charAt(i) - codigo + 26));
					} else {
						cifrado.append((char) (texto.charAt(i) - codigo));
					}
				} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
					if ((texto.charAt(i) - codigo) < 'A') {
						cifrado.append((char) (texto.charAt(i) - codigo + 26));
					} else {
						cifrado.append((char) (texto.charAt(i) - codigo));
					}
				}
			}
		} else {
			throw new Exception("Numero mayor a 25 o menor a 0");
		}

		return cifrado.toString();
	}

	public boolean lowerThan25(int numero) {
		boolean bandera = false;

		if (numero >= 0 && numero <= 25) {
			bandera = true;
		}

		return bandera;
	}

}
