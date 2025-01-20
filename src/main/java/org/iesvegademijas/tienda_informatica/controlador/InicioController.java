package org.iesvegademijas.tienda_informatica.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}