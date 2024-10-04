package com.akinator.Bet.model;

import java.util.UUID;

import com.akinator.Bet.DTO.usuario_DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuariobet")
public class usuario_model {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String email,senha;
	
	public usuario_model(usuario_DTO usuario) {
		this.email=usuario.email();
		this.senha=usuario.senha();
		
	}
	
}
