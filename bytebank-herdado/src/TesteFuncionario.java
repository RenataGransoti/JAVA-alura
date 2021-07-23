
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("357986420-1");
		nico.setSalario(2500.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getCpf());
		System.out.println(nico.getBonificacao());
		

	}

}
