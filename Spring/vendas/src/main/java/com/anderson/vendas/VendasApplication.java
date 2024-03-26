package com.anderson.vendas;

import com.anderson.vendas.domain.entity.Cliente;
import com.anderson.vendas.domain.entity.Pedido;
import com.anderson.vendas.domain.repository.Clientes;
import com.anderson.vendas.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class VendasApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes, @Autowired Pedidos pedidos) {
		return args -> {
			System.out.println("Salvando clientes");
			Cliente Anderson = new Cliente("Anderson");
			clientes.save(Anderson);

			clientes.save(new Cliente("Davi"));
			clientes.save(new Cliente("Douglas"));

			Pedido p = new Pedido();
			p.setCliente(Anderson);
			p.setDataPedido(LocalDate.now());
			p.setTotal(BigDecimal.valueOf(100));

			pedidos.save(p);
			System.out.println("Detalhes do pedido");

//			Cliente cliente = clientes.findClienteFetchPedidos(Anderson.getId());
//			System.out.println(cliente);
//			System.out.println(cliente.getPedidos());

			pedidos.findByCliente(Anderson).forEach(System.out::println);

			System.out.println("Buscando Cliente Por nome ");
			List<Cliente> result = clientes.encontrarPorNome("Anderson");
			result.forEach(System.out::println);
		};
	}


	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
