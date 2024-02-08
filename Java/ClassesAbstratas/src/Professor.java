
public class Professor extends Pessoa{
	
	private String matricula;
	
	public Professor(String nome, int ano_nascimento,String email, String matricula) {
		super(nome, ano_nascimento, email);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return super.toString() + "\nMatricula: " + this.matricula;
	}

	@Override
	public void outraMensagem(String texto) {
		System.out.println(texto);
		
	}

}
