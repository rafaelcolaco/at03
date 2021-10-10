package at03;
import java.util.Scanner;

public class at03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a altura do cone: ");
		double altura = scan.nextDouble();
		System.out.print("Digite o raio do cone: ");
		double raio = scan.nextDouble();
		System.out.print("Digite o o tipo de tinta(1, 2 ou 3): ");
		double tinta = scan.nextDouble();
		scan.close();
		double pi = 3.14159265359;
		double geratriz = Math.sqrt ((raio * raio)+(altura * altura));
		double areacirculo = pi * (raio * raio);
		double lateralcone = pi * raio * geratriz;
		double totalcone = pi * raio * (raio + geratriz);
		double litro = areacirculo / 3.45;
		double latas = Math.ceil(litro / 18);
		if (tinta == 1) {
		double valortinta = 238.90 * latas;
		System.out.println("O preço total das latas é: R$" + valortinta);
		}
		else if (tinta == 2) {
		double valortinta = 467.98 * latas;
		System.out.println("O preço total das latas é: R$" + valortinta);
		}
		else if (tinta == 3) {
		double valortinta = 758.34 * latas;
		System.out.println("O preço total das latas é: R$" + valortinta);
		}
		else if (((tinta != 1) || (tinta != 2)) || (tinta != 3)) {
			System.out.println("Tipo de tinta inválido");
		}
		System.out.println("A área a ser pintada é de: " + areacirculo);
		System.out.println("A quantidade de litro necessário é: " + litro);
		System.out.println("A quantidade de latas a serem usadas é: " + latas);
		System.out.println("A área total do cone é: " + totalcone);
		System.out.println("A área lateral do cone é: " + lateralcone);
		System.out.println("A geratriz do cone é: " + geratriz);
		

	}

}
