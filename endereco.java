package dia2509;

public class endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private cidade cidade;
	
	public endereco(String rua, int numero, String bairro, String cep, String cidade ) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	public String getrua() {
		return rua;
	}
	public void setrua(String rua) {
		this.rua = rua;
	}
	public int getnumero() {
		return numero;
	}
	public void setnumero(int numero) {
		this.numero = numero;
	}
	protected String getbairro() {
		return bairro;
	}
	public void setbairro(String bairro) {
		this.bairro = bairro;
	}
	public String getcep() {
		return cep;
	}
	public void setcep(String cep) {
		this.cep = cep;
	}
	public cidade getcidade() {
		return cidade;
	}
	public void setcidade(cidade cidade) {
		this.cidade = cidade;
	}
}


