package esporte.sesi.Dto

public record Esporte_DTO
(String nome,int jogadores, String local, String descricao) {

	public String email() {
		return nome;
	}

	public int jogadores() {
		return jogadores;
	}
	
	public String local() {
		return local;
	
	}
	public String descricao() {
		return descricao;
	}
}