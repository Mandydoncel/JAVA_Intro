package POO_Heranca;

public class AnimalTeste2 {


	public static void main(String [] args)
	{
		Cachorro2 animal1 = new Cachorro2("Shakira","11","Au Au","O cachorro corre!");
		Cavalo2 animal2 = new Cavalo2("Zorro","8","iiirrrr�","O cavalo corre!");
		Preguica2 animal3 = new Preguica2("x","8","zzz","A pregui�a sobe em �rvores!");
	
		
		
		System.out.println("\nO animal 1 �:"+animal1.getNomeClasse()+".\nO nome �: "+animal1.getNome()+".\nSua idade �: "+animal1.getIdade()+".\nO som que o animal emite �: "+animal1.getSom()+".\nE sua caracter�stica �: "+animal1.getCaracteristica());
		System.out.println("\nO animal 2 �:"+animal2.getNomeClasse()+".\nO nome �: "+animal2.getNome()+".\nSua idade �: "+animal2.getIdade()+".\nO som que o animal emite �: "+animal2.getSom()+".\nE sua caracter�stica �: "+animal2.getCaracteristica());
		System.out.println("\nO animal 3 �:"+animal3.getNomeClasse()+".\nO nome �: "+animal3.getNome()+".\nSua idade �: "+animal3.getIdade()+".\nO som que o animal emite �: "+animal3.getSom()+".\nE sua caracter�stica �: "+animal3.getCaracteristica());
	}
	
}
