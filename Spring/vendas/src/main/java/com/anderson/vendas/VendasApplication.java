package com.anderson.vendas;

import com.anderson.vendas.domain.entity.Cliente;
import com.anderson.vendas.domain.entity.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes) {
		return args -> {
			System.out.println("Salvando clientes");
			clientes.salvar(new Cliente("Anderson"));
			clientes.salvar(new Cliente("Davi"));
			clientes.salvar(new Cliente("Douglas"));

			List<Cliente> todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);

			System.out.println("Atualizando clientes");
			todosClientes.forEach( c -> {
				c.setNome(c.getNome() + " atualizado. ");
				clientes.atualizar(c);
			});
			todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);

			System.out.println("Buscando Clientes");
			clientes.buscarPorNome("And").forEach(System.out::println);

//			System.out.println("Deletando clientes");
//			clientes.obterTodos().forEach(c -> {
//				clientes.deletar(c);
//			});

			todosClientes = clientes.obterTodos();
			if (todosClientes.isEmpty()) {
				System.out.println("Nenhum cliemte emcontrado.");
			} else {
				todosClientes.forEach(System.out::println);
			}
		};
	}


	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
