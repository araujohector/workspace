import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Ol� Mundo JOP", "!!Alerta!!", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Alerta", JOptionPane.YES_NO_OPTION);
		Object[] options = { "OK", "Cancelar", "Voltar" };
		JOptionPane.showOptionDialog(null, "Clique OK para continuar!", "Alerta", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		String nome = JOptionPane.showInputDialog("Digite seu nome!");
		System.out.println("O nome digitado foi :" + nome);

		Object[] itens = { "Ma�a", "Pera", "Banana" };
		Object itemSelecionado = JOptionPane.showInputDialog(null, "Escolha 1 item", "itens",
				JOptionPane.INFORMATION_MESSAGE, null, itens, itens[1]);
		System.out.println(itemSelecionado.toString());
	}

}
