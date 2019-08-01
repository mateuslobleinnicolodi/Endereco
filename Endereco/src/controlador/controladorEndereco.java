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

    public static void alterar(Manutencao_Endereco man){
        Endereco objeto = new Endereco();
        //definir todos os atributos
        objeto.setBairro(man.jtfBairro.getText());
        objeto.setComplemento(man.jtfComplemento.getText());
        objeto.setLogradouro(man.jtfLogradouro.getText());
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        
        boolean resultado = enderecoDao.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(Manutencao_Endereco man){
        Endereco objeto = new Endereco();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = enderecoDao.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
