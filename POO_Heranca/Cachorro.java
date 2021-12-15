package POO_Heranca;

public class Cachorro extends Animal{

	private String correr;
	
	public Cachorro(String nome, int idade, String som, String correr) 
	{
		super(nome, idade, som);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\n*****DADOS DO CACHORRO*****\n Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom()+" \n "+getCorrer());
		
	}
	
	
}
