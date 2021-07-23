
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1223, 24226);

		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//paulo.nome ="paulo silveira";
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
	
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
