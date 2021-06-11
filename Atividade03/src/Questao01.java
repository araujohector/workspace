import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "";
		int num = 0;
		int antecessor = 0;
		int sucessor = 0;

		a = JOptionPane.showInputDialog("Digite um numero !"); // tela para se inserir o número e jogar na String "a"
		num = Integer.parseInt(a);
		antecessor = num - 1;
		sucessor = num + 1;
		JOptionPane.showMessageDialog(null, " O antecessor " + antecessor + " O sucessor " + sucessor);

	}

}
