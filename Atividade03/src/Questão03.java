import javax.swing.JOptionPane;

public class Questão03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0;
		int n2 = 0;
		int media;

		String nota1, nota2;
		nota1 = JOptionPane.showInputDialog("Entre com a primeira nota");
		nota2 = JOptionPane.showInputDialog("Entre com a segunda nota");

		n1 = Integer.parseInt(nota1);
		n2 = Integer.parseInt(nota2);

		media = (n1 + n2) / 2;
		JOptionPane.showMessageDialog(null, "A media é " + media);
	}

}
