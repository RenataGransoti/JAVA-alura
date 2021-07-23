
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1334, 24226);
				
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(1334, 16549);
		
		System.out.println(conta.getTotal());
	}
}
