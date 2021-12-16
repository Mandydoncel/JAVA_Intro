package POO_Heranca;

public class Cavalo2 extends BaseAnimal2 implements Animal2 {

		
		Cavalo2(String nome, String idade, String som, String caracteristica)
		
		{
			
			super(nome,idade,som,caracteristica);
			nomeClasse = "cavalo2";
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

