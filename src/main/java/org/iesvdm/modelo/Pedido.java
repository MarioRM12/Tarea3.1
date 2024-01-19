package org.iesvdm.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
public class Pedido {

    private Integer id;
    private Double total;
    private LocalDate fecha;
    private Comercial comercial;
    private Cliente cliente;

}
