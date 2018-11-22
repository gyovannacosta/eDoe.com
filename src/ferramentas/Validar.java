package ferramentas;

public class Validar {

	private static boolean isNull(String valor) {
		return valor == null;
	}

	private static boolean isEmpty(String valor) {
		return valor.trim().equals("");
	}

	public static void adicionaUsuario(String id, String nome, String email, String celular, String classe) {
		if (isNull(nome) || isEmpty(nome))
			throw new IllegalArgumentException("Entrada invalida: nome nao pode ser vazio ou nulo.");
		if (isNull(email) || isEmpty(email))
			throw new IllegalArgumentException("Entrada invalida: email nao pode ser vazio ou nulo.");
		if (isNull(celular) || isEmpty(celular))
			throw new IllegalArgumentException("Entrada invalida: celular nao pode ser vazio ou nulo.");
		if (isNull(classe) || isEmpty(classe))
			throw new IllegalArgumentException("Entrada invalida: classe nao pode ser vazia ou nula.");
		if (isNull(id) || isEmpty(id))
			throw new IllegalArgumentException("Entrada invalida: id do usuario nao pode ser vazio ou nulo.");
	}

	public static void validaId(String id) {
		if (isNull(id) || isEmpty(id))
			throw new IllegalArgumentException("Entrada invalida: id do usuario nao pode ser vazio ou nulo.");
	}

	public static void validaNome(String nome) {
		if (isNull(nome) || isEmpty(nome))
			throw new IllegalArgumentException("Entrada invalida: nome nao pode ser vazio ou nulo.");
	}

	public static Boolean checaArgumento(String campo) {
		if (!(isNull(campo) || isEmpty(campo))) {
			return true;
		}
		return false;
	}

}
