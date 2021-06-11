import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valor1 = 0;
		float porc = 0;

		String n1;
		n1 = JOptionPane.showInputDialog("Digite o valor da conta !");

		valor1 = Integer.parseInt(n1);

		porc = (valor1 * 10) / 100;
		JOptionPane.showMessageDialog(null, "A porcentagem do garçom: " + porc + "\n Valor total da conta " + valor1);

	}

}
