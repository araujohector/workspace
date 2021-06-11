import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float horas = 0;
		float valorhoras = 0;
		float salario = 0;

		String h1, h2;

		h1 = JOptionPane.showInputDialog("Digite as horas trabalhada !");
		h2 = JOptionPane.showInputDialog("Qual o valor/hora ?");

		horas = Float.parseFloat(h1);
		valorhoras = Float.parseFloat(h2);

		salario = horas * valorhoras;
		JOptionPane.showMessageDialog(null, "O salario do funcionario é " + salario);
	}

}
