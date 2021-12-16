package POO_Heranca;

	public class Preguica2 extends BaseAnimal2 implements Animal2 {

			
			Preguica2(String nome, String idade, String som, String caracteristica)
			
			{
				
				super(nome,idade,som,caracteristica);
				nomeClasse = "preguica2";
			}
			
			
			@Override
			public String getNome(){
				return nome;
			}
			public String getIdade() {
				return idade;
			}
			public String getSom() {
				return som;
			}
			public String getCaracteristica() {
				return caracteristica;
			
			}

		}



