package br.uniso;

// eh a nossa classe de controller
// ela pega a requisicao http vinda do browser
// e processa pra devolver uma resposta

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnisoController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam("name") String a, @RequestParam("age") String b){
        return "Hello " + a + " Idade: " + b;
    }
}
