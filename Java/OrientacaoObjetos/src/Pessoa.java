
public class Pessoa {
	
	String nome;
	String email;
	int ano_nascimento;
	
	//construtor vazio
	public Pessoa() {
		
	}
	
	//construtor com parâmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	
	public void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Ano de nascimento: " + this.ano_nascimento);
	}

}
