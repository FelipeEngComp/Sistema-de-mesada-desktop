
package Controle;

import Modelo.ModeloInfracoes;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControleInfracoes {
    ControleBanco conecta = new ControleBanco();
    float ValorTotal;
    int quantidade;
    public void Salvar(ModeloInfracoes mod){
        conecta.conexao();

        try {
            String motivo = mod.getMotivo();

            int codMotivo = PesquisaIdMotivo(motivo);

            PreparedStatement pst=conecta.con.prepareStatement("insert into infracoes(quantidade_marcacao,data,id_motivo,observacao)values(?,?,?,?)");
            pst.setInt(1, mod.getQuantidade_marcacao());//captura informacao da observacao
            pst.setString(2, mod.getData_infracao());//data capturada pelo sistema
            pst.setInt(3, codMotivo);//motivo informado pelo usuario
            pst.setString(4,mod.getObservacao());//observacao feita pelo usuario
            pst.execute();

            //seleciona o ultimo o Id da infracao atual
            conecta.executaSQL("select*from infracoes");
            conecta.rs.last();
            int cod_inf = conecta.rs.getInt("id_infracao");

            //seleciona o id do pagamento atual
            conecta.executaSQL("select*from pagamento");
            conecta.rs.last();
            int cod_pag = conecta.rs.getInt("id_pagamento");

            //insere em Itens_infra_pag os ids coletados anteriormente
            pst = conecta.con.prepareStatement("insert into itens_infra_pag (id_infracoes,id_pagamento)values(?,?)");
            pst.setInt(1, cod_inf);
            pst.setInt(2, cod_pag);
            pst.execute();

            //imprime a mensagem
            JOptionPane.showMessageDialog(null,"Salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);        }
        conecta.desconecta();

    }

    public void AlteraValorTotal(ModeloInfracoes mod){
        conecta.conexao();
            ValorTotal = mod.getValor_pagamento();


        try {
            //coleta o ultimo id do pagamento e atualiza de acordo com a marcacao.
            conecta.executaSQL("select*from pagamento");
            conecta.rs.last();
            int cod_pag = conecta.rs.getInt("id_pagamento");
            PreparedStatement pst = conecta.con.prepareStatement("update pagamento set valor_pagamento = ? where id_pagamento = ? ");

            pst.setFloat(1, ValorTotal);
            pst.setInt(2,cod_pag );
            pst.execute();



        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }

        conecta.desconecta();
    }

    public int PesquisaIdMotivo(String motivo){

        //de acordo com a string do motivo, ele pesquisa no banco de dados o Id
        conecta.executaSQL("select * from motivos where escreve_motivo = '"+motivo+"'");
        try {

            conecta.rs.first();
            int cod_motivo = conecta.rs.getInt("id_motivo");
            return cod_motivo ;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        return 0 ;
    }
}
