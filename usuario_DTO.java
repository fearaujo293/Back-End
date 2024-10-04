package com.akinator.Bet.DTO;

public record usuario_DTO
(String email,String senha) {

	public String email() {
		return email;
	}

	public String senha() {
		return senha;
	}

}
