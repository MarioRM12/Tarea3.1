package org.iesvdm.controlador;
import java.util.List;
import org.iesvdm.modelo.Cliente;
import org.iesvdm.modelo.Comercial;
import org.iesvdm.service.ClienteService;
import org.iesvdm.service.ComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComercialController {

    @Autowired
    private ComercialService comercialService;

    public ComercialController(ComercialService comercialService) {
        this.comercialService = comercialService;
    }

    @GetMapping("/comerciales") //Al no tener ruta base para el controlador, cada método tiene que tener la ruta completa
    public String listar(Model model) {

        List<Comercial> listaComercial =  comercialService.listAll();
        model.addAttribute("listaComerciales", listaComercial);

        return "comerciales";

    }

}
