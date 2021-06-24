package com.ryr.cobranzaCuotas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ryr.cobranzaCuotas.models.entities.Cliente;
import com.ryr.cobranzaCuotas.models.repositories.ClienteRepository;

@Controller
public class clienteController {

	@Autowired
	private ClienteRepository clienteRepo;
	
	@RequestMapping("/ver")
	public String ver(Model model) {
		
		System.out.println(clienteRepo.findAll());
		
		List<Cliente> findAll = (List<Cliente>) clienteRepo.findAll();
		
		model.addAttribute("Clientes", findAll);
		
		return "ver";
	}
	
}
