package br.ulbra.forms;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class Supermercado extends javax.swing.JFrame {

    /**
     * Creates new form Supermercado
     */
    public Supermercado() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edNome = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        edLista = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btListar = new javax.swing.JButton();
        btOrdenar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA GERENCIADOR DE COMPRAS");
        setBackground(new java.awt.Color(204, 153, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel1.setText("SISTEMA GERENCIADOR DE COMPRAS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NOME DA MERCADORIA:");

        edNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btSalvar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        edLista.setColumns(20);
        edLista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        edLista.setForeground(new java.awt.Color(255, 153, 0));
        edLista.setRows(5);
        jScrollPane1.setViewportView(edLista);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("LISTAGEM DE COMPRAS CADASTRADAS");

        btListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btListar.setText("LISTAR");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        btOrdenar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btOrdenar.setText("ORDENAR");
        btOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLimpar.setText("LIMPAR LISTA");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edNome)
                        .addGap(12, 12, 12)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btEditar)
                        .addGap(28, 28, 28)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btOrdenar)))
                .addGap(0, 69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btEditar)
                    .addComponent(btListar)
                    .addComponent(btOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLimpar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //declara????o do ArrayList
    ArrayList<String> listaSupermercado = new ArrayList<String>();
    
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       if(!(edNome.getText().equals(""))){
        listaSupermercado.add(edNome.getText());
        edNome.setText(null);
        edNome.requestFocus();
       }else{
           JOptionPane.showMessageDialog(null,"Favor cadastrar item!");
       }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        String merc = "";
        if (!listaSupermercado.isEmpty()) {
            for (int i = 0; i < listaSupermercado.size(); i++) {
                merc = merc +(i+1)+"??: "+listaSupermercado.get(i) + "\n";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Aviso: N??o h?? "
                    + "nenhum item cadastrado!", "ATEN????O!", JOptionPane.WARNING_MESSAGE);
        }
        edLista.setText(merc);
    }//GEN-LAST:event_btListarActionPerformed

    private void btOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarActionPerformed
        if (!listaSupermercado.isEmpty() && listaSupermercado.size() >= 2) {
            Collections.sort(listaSupermercado);
            JOptionPane.showMessageDialog(null, "Lista ordenada com sucesso!");
        } else if (listaSupermercado.size() == 1) {
            JOptionPane.showMessageDialog(null, "Imposs??vel ordenar apenas um ??nico item");
        } else {
            JOptionPane.showMessageDialog(null, "Lista se encontra vazia!");
        }
    }//GEN-LAST:event_btOrdenarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (listaSupermercado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aviso: N??o h?? "
                    + "nenhum item cadastrado!", "ATEN????O!", JOptionPane.WARNING_MESSAGE);
        }else{
            int i = Integer.parseInt(
                    JOptionPane.showInputDialog("Qual item deseja excluir?"));
            if(i>0 && i<=listaSupermercado.size()){
              if(JOptionPane.showConfirmDialog(null,
                      "Tem certeza que deseja excluir o item: "+listaSupermercado.get(i-1)+"?","CONFIRME", 
                      JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                listaSupermercado.remove(i-1);
                JOptionPane.showMessageDialog(null,"Item excluido com sucesso!");
              }else{ JOptionPane.showMessageDialog(null, "Exclus??o cancelada!");
            }}else{
                JOptionPane.showMessageDialog(null, "Item inexistente!");
                    
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
     if(listaSupermercado.isEmpty()){
         JOptionPane.showMessageDialog(null, "Lista j?? se encontra limpa!");
     }else{
          if(JOptionPane.showConfirmDialog(null,
                      "Tem certeza que deseja limpar sua lista de compras? Essa a????o ?? IRREVERS??VEL!\n"
                      +"Fa??a o devido backup antes de executar essa tarefa! ","CONFIRME", 
                      JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                 listaSupermercado.clear();
                 JOptionPane.showMessageDialog(null,"A????o CONCLU??DA com sucesso!");
          }
          else{
              JOptionPane.showMessageDialog(null,"Limpeza CANCELADA com sucesso!");
          }
     }
    }//GEN-LAST:event_btLimparActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
         if (listaSupermercado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aviso: Este item "
                    + "se encontra cadastrado!", "ATEN????O!", 
                    JOptionPane.WARNING_MESSAGE);
        }else{
            int i = Integer.parseInt(
                    JOptionPane.showInputDialog("Qual item deseja editar?"));
            if(i>0 && i<=listaSupermercado.size()){
              if(JOptionPane.showConfirmDialog(null,
                      "Tem certeza que deseja editar o item: "+listaSupermercado.get(i-1)+"?","CONFIRME", 
                      JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                    String novoNome = JOptionPane.showInputDialog("Informe o novo item:");
                    listaSupermercado.set(i-1, novoNome);
              }else{
                   JOptionPane.showMessageDialog(null, "Cancelado com sucesso! ");
              }
            }else{
                 JOptionPane.showMessageDialog(null, "Item inexistente! ");
            }
         }
    }//GEN-LAST:event_btEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supermercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btOrdenar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextArea edLista;
    private javax.swing.JTextField edNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
