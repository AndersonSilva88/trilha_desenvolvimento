
public class Aluno  extends Pessoa {
	
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email,String ra) {
		super(nome, ano_nascimento,email);
		this.ra = ra;
	}

	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String toString() {
		return super.toString() + "\nRA: " +this.ra;
	}

	@Override
	public void outraMensagem(String texto) {
		System.out.println(texto);
		
	}
	

}
