package POO_Heranca;

public class AnimalTeste {

	public static void main(String [] args)
	{
		Cachorro cachorro1 = new Cachorro("Shakira",11,"Au Au","O cachorro corre!");
		Cavalo cavalo1 = new Cavalo("Zorro",8,"iiirrrrí","O cavalo corre!");
		Preguica preguica1 = new Preguica("x",8,"...","A preguiça sobe em árvores!");
		
		cachorro1.imprimirInfo();
		cavalo1.imprimirInfo();
		preguica1.imprimirInfo();
		
	}
	
}
