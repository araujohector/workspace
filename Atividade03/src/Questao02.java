import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma;
		int num1 = 0;
		int num2 = 0;

		String st1 = JOptionPane.showInputDialog(null, "Digite um numero:");

		String st2 = JOptionPane.showInputDialog(null, "Digite outro numero:");

		num1 = Integer.parseInt(st1);
		num2 = Integer.parseInt(st2);

		soma = num1 + num2;
		JOptionPane.showMessageDialog(null, "A soma dos numeros e " + soma);

	}

}
