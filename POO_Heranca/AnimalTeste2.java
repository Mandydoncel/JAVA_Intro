package POO_Heranca;

public class AnimalTeste2 {


	public static void main(String [] args)
	{
		Cachorro2 animal1 = new Cachorro2("Shakira","11","Au Au","O cachorro corre!");
		Cavalo2 animal2 = new Cavalo2("Zorro","8","iiirrrrí","O cavalo corre!");
		Preguica2 animal3 = new Preguica2("x","8","zzz","A preguiça sobe em árvores!");
	
		
		
		System.out.println("\nO animal 1 é:"+animal1.getNomeClasse()+".\nO nome é: "+animal1.getNome()+".\nSua idade é: "+animal1.getIdade()+".\nO som que o animal emite é: "+animal1.getSom()+".\nE sua característica é: "+animal1.getCaracteristica());
		System.out.println("\nO animal 2 é:"+animal2.getNomeClasse()+".\nO nome é: "+animal2.getNome()+".\nSua idade é: "+animal2.getIdade()+".\nO som que o animal emite é: "+animal2.getSom()+".\nE sua característica é: "+animal2.getCaracteristica());
		System.out.println("\nO animal 3 é:"+animal3.getNomeClasse()+".\nO nome é: "+animal3.getNome()+".\nSua idade é: "+animal3.getIdade()+".\nO som que o animal emite é: "+animal3.getSom()+".\nE sua característica é: "+animal3.getCaracteristica());
	}
	
}
