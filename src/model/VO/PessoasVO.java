package model.VO;

public class PessoasVO {
	protected String cpf;
	protected String nome;
	protected String endereco;
	
	
	//getters e setters.
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isEmpty() )
		{
			System.out.println("Nome inv�lido!");
		}
		else
		{
		this.nome = nome;
		}	
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf == null || cpf.isEmpty() || cpf.length() < 11)
		{
			System.out.println("CPF inv�lido!");
		}
		else
		{
			this.cpf = cpf;
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if(endereco == null || endereco.isEmpty())
		{
			System.out.println("Endere�o inv�lido!");
		}
		else
		{
			this.endereco = endereco;
		}	
	}
}