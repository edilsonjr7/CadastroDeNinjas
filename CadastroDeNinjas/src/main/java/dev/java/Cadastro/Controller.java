package dev.java.Cadastro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // controlador para APIRest
@RequestMapping("/mensagem")  //aqui eu faço o controle de rotas na minha API
public class Controller {

    @GetMapping// aqui quem acessa meu "boasvindas" mostrará a mensagem
    public String boaVindas(){
        return "Qualquer pessoa pode acessar essa mensagem ao seguir a rota /mensagem";
    }
    
   
    
}
