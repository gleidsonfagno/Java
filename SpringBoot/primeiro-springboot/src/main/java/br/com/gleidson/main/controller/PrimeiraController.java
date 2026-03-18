package br.com.gleidson.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {


    @GetMapping("/mensagem")
    public String mostrarMensagem() {
        return "Aplicação Spring Boot rodando com sucesso!";
    }
}
