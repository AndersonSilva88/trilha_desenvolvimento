
public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro da silva",1985,"pedro@gmail.com");
		
		System.out.println(p1.getNome());
		System.out.println(p1);
		System.out.println();
		
		Aluno a1 = new Aluno("Joel da silva",1987,"joel@gmail.com","123456");
		
		System.out.println(a1.getNome());
		System.out.println(a1);
		System.out.println();
		
		Professor professor = new Professor("Augusto jose", 1965,"augusto@gmail.com","789456");
		
		System.out.println(professor.getNome());
		System.out.println(professor);
		System.out.println();
		
		p1.mensagem();
		
		p1.mensagem("Minha mensagem");
		
	}

}
