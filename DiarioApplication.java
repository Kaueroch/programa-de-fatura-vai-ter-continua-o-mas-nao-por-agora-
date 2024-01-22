package com.aplicacaofatura.diario;

import java.util.ArrayList;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
@Controller
public class DiarioApplication {
	
	  public static void main(String[] args) {
		  SpringApplication.run(DiarioApplication.class, args); 
	  }
	  ArrayList<String>faturas = new ArrayList<>();
	  @GetMapping("/")
	    public String home(Model model) {
			model.addAttribute("faturas",faturas);
	        return "index.html";
	    }
	  @PostMapping("/adicionar")
	  public String adicionar(String fatura) {
	      faturas.add(fatura);  
	      return "redirect:/";  
	  }
}
	  
