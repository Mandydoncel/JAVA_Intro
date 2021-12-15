package POO;

public class Funcionario {

		
		private String nome;
		private String sobrenome;
		private String matricula;
		private String setor;
		
		
	    public Funcionario (String nome, String sobrenome, String matricula, String setor)
	    {
	    	this.nome = nome;
	    	this.sobrenome = sobrenome;
	    	this.matricula = matricula;
	    	this.setor = setor;
	    
	    }
	    
	    public void imprimirInfo()
	    {
	    	System.out.println("\nO funcionário "+nome+" "+sobrenome+", com número de matrícula "+matricula+", do setor "+setor+" já pode se inscrever para o curso de desenvolvimento.");
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

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getSetor() {
			return setor;
		}

		public void setSetor(String setor) {
			this.setor = setor;
		}
	    
	    
}
