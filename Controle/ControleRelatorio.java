
package Controle;

import Modelo.ModeloRelatorio;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ControleRelatorio {
    ControleBanco conecta = new ControleBanco();
    private int cod_infracao,marcacao,cod_pagamento,pagamento;
    
    public void Deletar(ModeloRelatorio mod){
        conecta.conexao();
        try {
            cod_infracao = mod.getCod_infracao();
            marcacao = mod.getMarcacao();
            cod_pagamento = mod.getCod_pagamento();
            
            //deletando itens_infra_pag
            PreparedStatement pst = conecta.con.prepareStatement("delete from itens_infra_pag where id_infracoes = ?");
            pst.setInt(1, cod_infracao);
            pst.execute();
            
            //tenho que deletar de infracao, de pagamento e itens_infra_pag
            //deletando de infracoes
            pst = conecta.con.prepareStatement("delete from infracoes where id_infracao = ?");
            pst.setInt(1, cod_infracao);
            pst.execute();
            
            conecta.executaSQL("select * from pagamento where id_pagamento = '"+cod_pagamento+"'");
            conecta.rs.first();
            //take the sum value
            pagamento = conecta.rs.getInt("valor_pagamento");
            
           
             //deletando itens_infra_pag
            pst = conecta.con.prepareStatement("delete from itens_infra_pag where id_infracoes = ?");
            pst.setInt(1, marcacao);
            pst.execute();
            
            AtualizaValor();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO\n"+ex);
        }
            
        
        conecta.desconecta();
    }
    
    public void AtualizaValor(){
        
        pagamento += marcacao;
        try {
            PreparedStatement pst = conecta.con.prepareStatement("update pagamento set valor_pagamento = ? where id_pagamento = ?");
            pst.setInt(1, pagamento);
            pst.setInt(2, cod_pagamento);
            pst.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO\n"+ex);
        }
        JOptionPane.showMessageDialog(null,"Marcação deletada com sucesso!\nO valor do pagamento atual é de\n"+pagamento);
        
        
    }
    
}
