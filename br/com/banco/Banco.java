package br.com.banco;
import java.util.List;


public class Banco{
    private String nomeBanco;
    private List<Conta> contas;

    public String getNome(String nomeBanco){
        return nomeBanco;
    }

    public void setNome(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}


}