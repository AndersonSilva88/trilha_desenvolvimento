
public class Main {

	public static void main(String[] args) {
		
		int numero = 4;
		
		//Declaração e instanciação/iniciação do objeto
		Produto p1 = new Produto();
		
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("============== Produtos ================");
		System.out.println(p1.nome);
		System.out.println("R$ " +  p1.preco);
		System.out.println(p1.desconto + "%");
		
		System.out.println();
		
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Anderson";
		pessoa.email = "anderson@gmail.com";
		pessoa.ano_nascimento = 1987;
		
		System.out.println("================ Pessoa ================");
		pessoa.imprime_informacoes();
		
		
	}

}
