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


	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
