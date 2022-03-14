public abstract class Contato { // Super - Classe - Contato Genérico, abstrato

	private String nome;
	private Endereco endereco; // = new Endereco(); ATRIBUTO => // Solucao 2 para resolver null pointer inicializá-lo no atributo
	
//	public Contato() {
//		endereco = new Endereco(); CONSTRUTOR => // Solucao 3 para resolver null pointer: criacao de um construtor vazio e criar o objeto dentro dele.
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*public Endereco getEndereco() { Simulação: Lança NullPOinterExcecption porque Endereço não foi inicializado = new Endereco como abaixo.
		return endereco;
	}*/

	public Endereco getEndereco() { // MÉTODO => criar o objeto detro do método: Solucao 4 para resolver null pointer.
		if (endereco == null) { // técnica lazy load
			endereco = new Endereco();
		}
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
