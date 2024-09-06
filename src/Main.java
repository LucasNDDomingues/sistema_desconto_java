import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {


        String login, senha;
        String produto;
        String info;
        double valor;
        double desconto;
        double valordesconto;
        double valorfinal;
        int teste;


        JOptionPane.showMessageDialog(null, "LOJA DO FUTURO");
        login = JOptionPane.showInputDialog("Digite seu Login:");
        senha = JOptionPane.showInputDialog("Digite sua senha:");

        if (login.equals("professor") && senha.equals("professor")) {
            JOptionPane.showMessageDialog(null, "Acesso Liberado");

        }else {
            JOptionPane.showMessageDialog(null,"Acesso Negado");
            return;

        }

        produto = JOptionPane.showInputDialog("Digite o valor total dos produtos R$:");
        valor = Double.parseDouble(produto);
        teste = JOptionPane.showConfirmDialog(null,"O valor digitado está correto? R$"+valor);

        if (teste == 0){

            if (valor < 200.0){
                desconto = 0.5;
            } else if (valor >= 200.0 && valor < 300.0) {
                desconto = 0.10;
            } else {
                desconto = 0.15;
            }

            valordesconto = valor * desconto;
            valorfinal = valor - valordesconto;

            info= String.format("%nMultiplicador de desconto:  %.2f %nValor do Desconto: R$ %.2f %nValor total a pagar: R$ %.2f",desconto,valordesconto,valorfinal);
            JOptionPane.showMessageDialog(null,info,"PRODUTO",JOptionPane.INFORMATION_MESSAGE);

        } else {
            produto = JOptionPane.showInputDialog("Digite o valor total correto dos produtos R$:");
            if (valor < 200.0){
                desconto = 0.5;
            } else if (valor >= 200.0 && valor < 300.0) {
                desconto = 0.10;
            } else {
                desconto = 0.15;
            }

            valordesconto = valor * desconto;
            valorfinal = valor - valordesconto;


            info = String.format("%nMultiplicador de desconto: R$ %.2f %nValor do Desconto: R$ %.2f %nValor total a pagar: R$ %.2f",desconto,valordesconto,valorfinal);
            JOptionPane.showMessageDialog(null,info,"PRODUTO",JOptionPane.INFORMATION_MESSAGE);
        }



    }
}