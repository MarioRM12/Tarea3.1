package org.iesvdm.service;

import java.util.List;

import org.iesvdm.dao.ClienteDAO;
import org.iesvdm.dao.ComercialDAO;
import org.iesvdm.modelo.Cliente;
import org.iesvdm.modelo.Comercial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComercialService {

    @Autowired
    private ComercialDAO ComercialDAO;

    public ComercialService(ClienteDAO comercialDAO) {
        this.ComercialDAO = ComercialDAO;
    }

    public List<Comercial> listAll() {

        return ComercialDAO.getAll();

    }



}
