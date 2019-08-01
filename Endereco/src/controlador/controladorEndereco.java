package controlador;
import dao.enderecoDao;
import javax.swing.JOptionPane;
import modelo.Endereco;
import tela.manutencao.Manutencao_Endereco;

public class controladorEndereco {
    public static void inserir(Manutencao_Endereco man){
        Endereco objeto = new Endereco();
        objeto.setBairro(man.jtfBairro.getText());
        objeto.setComplemento(man.jtfComplemento.getText());
        objeto.setLogradouro(man.jtfLogradouro.getText());
        
        boolean resultado = enderecoDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
