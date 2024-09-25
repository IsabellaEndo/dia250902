package dia2509;

public class cidade {
	private String nome;
	private estado estado;
	
	public cidade(String nome, estado estado) {
		this.nome = nome;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public estado getestado() {
		return estado;
	}
	public void setestado(estado estado) {
		this.estado = estado;
	}

}
