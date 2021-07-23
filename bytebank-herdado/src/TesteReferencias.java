
public class TesteReferencias {
	 public static void main(String[] args) {
		 //no lado esquerdo pode por a classe mais genérica, até porque o Gerente é um Funcionario
		 Autenticavel referencias = new Cliente();
		 
//	        g1.setNome("Marcos");
//	        g1.setSalario(5000.0);
	        
	        
	        EditorVideo ev = new EditorVideo();
	        ev.setSalario(2500.0);

	        Designer d = new Designer();
	        d.setSalario(2000.0);

	        ControleBonificacao controle = new ControleBonificacao();
//	        controle.registra(g1);
	        controle.registra(ev);
	        controle.registra(d);

	        System.out.println(controle.getSoma());

	    }
	
}
