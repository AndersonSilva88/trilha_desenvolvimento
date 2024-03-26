package com.anderson.vendas.domain.repository;

import com.anderson.vendas.domain.entity.Cliente;
import com.anderson.vendas.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
