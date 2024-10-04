package com.akinator.Bet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akinator.Bet.DTO.usuario_DTO;
import com.akinator.Bet.model.usuario_model;
import com.akinator.Bet.repository.usuario_repository;

@RestController
@RequestMapping("api")
public class usuario_controller  {

	@Autowired
	usuario_repository repository;
	@PostMapping("cadastrar")
	public ResponseEntity<?> Salvarusuario(@RequestBody usuario_DTO usuario){
		usuario_model user = new usuario_model(usuario);
		repository.save(user);
		
		return ResponseEntity.ok("usuario salvo com sucesso");
		
	}
}
