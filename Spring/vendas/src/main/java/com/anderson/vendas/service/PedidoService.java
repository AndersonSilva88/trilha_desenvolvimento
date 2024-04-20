package com.anderson.vendas.service;


import com.anderson.vendas.api.dto.PedidoDTO;
import com.anderson.vendas.domain.entity.Pedido;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);
}
