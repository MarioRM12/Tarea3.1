package org.iesvdm.dao;

import org.iesvdm.modelo.Cliente;
import org.iesvdm.modelo.Comercial;
import org.iesvdm.modelo.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoDAO {

    public void create(Pedido pedido);

    void create(Cliente cliente);

    public List<Pedido> getAll();
    public Optional<Pedido> find(int id);

    public void update(Pedido pedido);

    public void delete(long id);

    public List<Pedido> listaPedidosPorComercial(Comercial comercial);

}
