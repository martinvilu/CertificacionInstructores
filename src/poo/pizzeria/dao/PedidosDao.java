/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pizzeria.dao;

import java.util.List;
import poo.pizzeria.Pedido;

/**
 *
 * @author joaquinleonelrobles
 */
public interface PedidosDao {
    
    public List<Pedido> buscarPendientesDeFacturacion();

    public void guardar(Pedido pedido);
    
}
