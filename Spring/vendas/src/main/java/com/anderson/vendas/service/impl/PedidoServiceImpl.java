package com.anderson.vendas.service.impl;

import com.anderson.vendas.api.dto.ItemPedidoDTO;
import com.anderson.vendas.api.dto.PedidoDTO;
import com.anderson.vendas.domain.entity.Cliente;
import com.anderson.vendas.domain.entity.ItemPedido;
import com.anderson.vendas.domain.entity.Pedido;
import com.anderson.vendas.domain.entity.Produto;
import com.anderson.vendas.domain.repository.Clientes;
import com.anderson.vendas.domain.repository.ItensPedidos;
import com.anderson.vendas.domain.repository.Pedidos;
import com.anderson.vendas.domain.repository.Produtos;
import com.anderson.vendas.exception.RegraNegocioException;
import com.anderson.vendas.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService {

    private final Pedidos repository;
    private final Clientes clientesRepository;
    private final Produtos produtosRepository;
    private final ItensPedidos itensPedidosRepository;

    @Override
    @Transactional
    public Pedido salvar(PedidoDTO dto) {
        Integer idCliente = dto.getCliente();
        Cliente cliente = clientesRepository
                .findById(idCliente)
                .orElseThrow( () -> new RegraNegocioException("Código de cliente inválido"));

        Pedido pedido = new Pedido();
        pedido.setTotal(dto.getTotal());
        pedido.setDataPedido(LocalDate.now());
        pedido.setCliente(cliente);

        List<ItemPedido> itemPedidos = converterItems(pedido,dto.getItems());
        repository.save(pedido);
        itensPedidosRepository.saveAll(itemPedidos);
        pedido.setItens(itemPedidos);

        return pedido;
    }


    private List<ItemPedido> converterItems(Pedido pedido, List<ItemPedidoDTO> items) {
        if (items.isEmpty()) {
            throw new RegraNegocioException("Não é possivel realizar um pedido sem items");
        }

        return items
                .stream()
                .map( dto -> {
                    Integer idProduto = dto.getProduto();
                    Produto produto = produtosRepository
                            .findById(idProduto)
                            .orElseThrow( () -> new RegraNegocioException("Código de produto inválido: "+ idProduto));

                    ItemPedido itemPedido = new ItemPedido();
                    itemPedido.setQuantidade(dto.getQuantidade());
                    itemPedido.setPedido(pedido);
                    itemPedido.setProduto(produto);
                    return itemPedido;
                } ).collect(Collectors.toList());
    }








}
