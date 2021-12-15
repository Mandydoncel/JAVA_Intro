/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package POO;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private String genero;
	private String idade;
	private String telefone;
	
    public Cliente (String nome, String sobrenome, String genero, String idade, String telefone)
    {
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	this.genero = genero;
    	this.idade = idade;
    	this.telefone = telefone;
    }
    
    public void imprimirInfo()
    {
    	System.out.println("\nO cliente "+nome+" "+sobrenome+", do gênero "+genero+", com "+idade+" ano(s) de idade e telefone "+telefone+" está convidado para a promoção de fim de ano!");
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
    
    
}
