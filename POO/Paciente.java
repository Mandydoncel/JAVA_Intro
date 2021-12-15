/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


package POO;

public class Paciente {

	private String nome;
	private String sobrenome;
	private String genero;
	private String idade;
	
	
    public Paciente (String nome, String sobrenome, String genero, String idade)
    {
    	this.nome = nome;
    	this.sobrenome = sobrenome;
    	this.genero = genero;
    	this.idade = idade;
    	
    }
    
 
    public void imprimirInfo()
    {
    	int x = Integer.parseInt(idade); //função para mudar uma String em Inteiro
    	if (x<=10)
    {
    	System.out.println("\nO(A) paciente "+nome+" "+sobrenome+", do gênero "+genero+", com "+idade+" ano(s) de idade deve ser encaminhado para um PEDIATRA");
    }
    	
    	else  
    {
    	System.out.println("\nO(A) paciente "+nome+" "+sobrenome+", do gênero "+genero+", com "+idade+" ano(s) de idade deve ser encaminhado para um CLINICO GERAL");
    }
    
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


	
	
}
