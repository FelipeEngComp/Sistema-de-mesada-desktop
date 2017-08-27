
package Controle;

import Modelo.ModeloMotivo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControleMotivo {
    ControleBanco conecta =  new ControleBanco();
    
    public void SalvarMotivo(ModeloMotivo mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("insert into motivos(escreve_motivo) values(?)");
            pst.setString(1,mod.getMotivo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar");
        }
        
        conecta.desconecta();
    }
    
    public void EditarMotivo(ModeloMotivo mod){
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.con.prepareStatement("update motivos set escreve_motivo = ? where id_motivo = ?");
            pst.setString(1, mod.getMotivo());
            pst.setInt(2, mod.getId_motivo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao editar");
        }
        
        conecta.desconecta();
    }
    
    public void ExcluirMotivo(ModeloMotivo mod){
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.con.prepareStatement("delete from motivos where id_motivo = ?");
            pst.setInt(1, mod.getId_motivo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            conecta.desconecta();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao excluir");
        }
    }

    
}
