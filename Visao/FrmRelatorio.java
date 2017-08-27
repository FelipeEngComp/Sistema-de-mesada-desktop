
package Visao;

//Virificar as marcacoes de Maria Eduarda para poder comparar os meses.

import Controle.ControleBanco;
import Controle.ControleRelatorio;
import Modelo.ModeloRelatorio;
import Modelo.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


public class FrmRelatorio extends javax.swing.JFrame {

    ControleBanco conecta = new ControleBanco();
    ModeloRelatorio mod = new ModeloRelatorio();
    ControleRelatorio control = new ControleRelatorio();
 
    public FrmRelatorio() {
        initComponents();
        //programa inicia com a combo atualizada.
        PreencheCombo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxID = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setToolTipText("");

        jLabel3.setText("Escolha o Id do pagamento:");

        jComboBoxID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableTabela);

        jButton1.setText("Deletar");
        jButton1.setToolTipText("Excluir marcação de evento ainda aberto.");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("Relatório de infrações");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 36, 36));
        jLabel2.setText("Desde que o sistema foi criado");

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        //apos escolher o id, ao clicar no botao de busca, ira chamar a tabela para exibir
        //A quantidade de marcacoes, motivo e observacao.
        PreencheTabela("select*from infracoes inner join motivos on \n" +
                       "infracoes.id_motivo = motivos.id_motivo \n" +
                       "inner join itens_infra_pag on \n" +
                       "infracoes.id_infracao = itens_infra_pag.id_infracoes \n " +
                       "where id_pagamento = '"+jComboBoxID.getSelectedItem()+"'");
        
        LiberaExcluir();//verifica se pode liberar o botao de exclusao
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // para deletar uma marcacao, so sera possivel se o pagamento ainda estiver em aberto.
        //isso e verificado em LiberaExcluir
        conecta.conexao();
        
                //captura a linha selecionada junto a coluna zero
                int cod = (int)jTableTabela.getValueAt(jTableTabela.getSelectedRow(),0);
                //captura agora a quantidade de marcacoes
                int marcacao = (int)jTableTabela.getValueAt(jTableTabela.getSelectedRow(),1);
                //take the id value
                int cod_pagamento =  Integer.parseInt((String) jComboBoxID.getSelectedItem());
                
                mod.setCod_infracao(cod); //passa o valor do id para o modelo.
                mod.setMarcacao(marcacao);//passa a quantidade de marcacao para o modelo.
                mod.setCod_pagamento(cod_pagamento);//passa o codigo do pagamento, que sera atualizado.
                
                //passa o objeto mod para o controle
                control.Deletar(mod);
                
                PreencheTabela("select*from infracoes inner join motivos on \n" +
                       "infracoes.id_motivo = motivos.id_motivo \n" +
                       "inner join itens_infra_pag on \n" +
                       "infracoes.id_infracao = itens_infra_pag.id_infracoes \n " +
                       "where id_pagamento = '"+jComboBoxID.getSelectedItem()+"'");
                
        conecta.desconecta();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // back to the main frame
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    public void PreencheCombo(){
     try {
         conecta.conexao();
         
         jComboBoxID.removeAllItems();
         
         conecta.executaSQL("select*from pagamento");
         conecta.rs.first();
         do{
             jComboBoxID.addItem(conecta.rs.getString("id_pagamento"));
         }while(conecta.rs.next());
         
         conecta.desconecta();
     } catch (SQLException ex) {
         Logger.getLogger(FrmRelatorio.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    public void PreencheTabela(String SQL){
        conecta.conexao();
        
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String[]{"Id","Marcações","Motivo","Observação","Data"};
        
        conecta.executaSQL(SQL);
        try{
            conecta.rs.first();
            do{
                
                dados.add(new Object[]{conecta.rs.getInt("id_infracao"),conecta.rs.getInt("quantidade_marcacao"),conecta.rs.getString("escreve_motivo"),conecta.rs.getString("observacao")
                ,conecta.rs.getString("data")});
                
            }while(conecta.rs.next());
        }    
        catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Tabela vazia ou\nelemento não encontrado");
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableTabela.setModel(modelo);
        jTableTabela.getColumnModel().getColumn(0).setPreferredWidth(80);//definindo tamanho em pixel
        jTableTabela.getColumnModel().getColumn(0).setResizable(false);
        jTableTabela.getColumnModel().getColumn(1).setPreferredWidth(80);//definindo tamanho em pixel
        jTableTabela.getColumnModel().getColumn(1).setResizable(false);
        jTableTabela.getColumnModel().getColumn(2).setPreferredWidth(290);//definindo tamanho em pixel
        jTableTabela.getColumnModel().getColumn(2).setResizable(false);
        jTableTabela.getColumnModel().getColumn(3).setPreferredWidth(290);//definindo tamanho em pixel
        jTableTabela.getColumnModel().getColumn(3).setResizable(false);
        jTableTabela.getColumnModel().getColumn(4).setPreferredWidth(90);//definindo tamanho em pixel
        jTableTabela.getColumnModel().getColumn(4).setResizable(false);
        

        //chama a tabela
        jTableTabela.getTableHeader().setReorderingAllowed(false);//nao vai poder reordenar alocacao
        jTableTabela.setAutoResizeMode(jTableTabela.AUTO_RESIZE_OFF);//defino se vou poder mexer como um todo 
        jTableTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//poder selecionar apenas um elemento da tabela
        
        conecta.desconecta();
    }
    
    public void LiberaExcluir(){
        conecta.conexao();
        int ultimoE, verifica = Integer.parseInt((String) jComboBoxID.getSelectedItem()); //variavel que ira verificar se o id que se deseja deletar uma marcacao, e o ultimo
                
        conecta.executaSQL("select * from pagamento order by id_pagamento ");
        
       
        try {
            conecta.rs.last();
            ultimoE = conecta.rs.getInt("id_pagamento");//captura maior elemento do Id, logo, o atual.
                if (verifica == ultimoE){
                    jButton1.setEnabled(true);
                   }
                    else{  //if some one tries to access a closed button
                           jButton1.setEnabled(false);
                           JOptionPane.showMessageDialog(null,"Essa tabela não pode mais ser alterada!");
                        }
        } catch (SQLException ex) {
                Logger.getLogger(FrmRelatorio.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        conecta.desconecta();
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabela;
    // End of variables declaration//GEN-END:variables
}
