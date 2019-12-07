package view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import model.bean.SisMedico;
import model.bean.SisPaciente;
import model.bean.SisTipoConsulta;

/**
 *
 * @author Alex
 */
public class SisTelaConsulta extends javax.swing.JFrame {

    SisPaciente pac = new SisPaciente();
    SisMedico med = new SisMedico();
    SisTipoConsulta cons = new SisTipoConsulta();
    
    public SisPaciente buscarPaciente(SisPaciente pac){
        /*connection.ConnectionFactory.getConnection();
        String sql = "select * from sis_paciente where nomePaciente like '%"+pac.getBuscaPaciente()+"%'";
        try {
            PreparedStatement stmt = connection.ConnectionFactory.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
            pac.setId(rs.getInt("id"));
            pac.setNomePaciente(rs.getString("nomePaciente"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Encontrado Paciente");
        }*/
        //if(!med.getPesquisa().isEmpty()){
        String sql = "select nomePessoa from sis_paciente where nomePessoa like '%"+pac.getBuscaPaciente()+"%' ";
        try {
            PreparedStatement stmt = connection.ConnectionFactory.getConnection().prepareStatement(sql);
            //passando o conteúdo da caixa de pesquisa para o ??
            // atenção ao "% - continuação da string sql
            
            //stmt.setString(1, "'%"+med.getPesquisa()+ "%'");
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
                //med.setId(rs.getInt("id"));
                med.setNome(rs.getString("nomePessoa"));
                //med.setEspecialidade(rs.getString("especialidade"));
                //med.setCRM(rs.getInt("CRM"));
                //med.setUF_CRM(rs.getString("ufCRM"));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Paciente não encontrado.Tente Novamente!!");
            
        }
        return pac;
    }
    public SisMedico buscarMedico (SisMedico med){
        /*connection.ConnectionFactory.getConnection();
        String sql = "select * from sis_medico where nomeMedico like '%"+med.getPesquisa()+"'%";
        try{
        PreparedStatement stmt = connection.ConnectionFactory.getConnection().prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        rs.first();
        //med.setId(rs.getInt("id"));
        med.setNome(rs.getString("nomeMedico"));
        
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Não Encontrado Médico");
        }*/
        //if(!med.getPesquisa().isEmpty()){
        String sql = "select nomeMedico from sis_medico where nomeMedico like '%"+med.getPesquisa()+"%' ";
        try {
            PreparedStatement stmt = connection.ConnectionFactory.getConnection().prepareStatement(sql);
            //passando o conteúdo da caixa de pesquisa para o ??
            // atenção ao "% - continuação da string sql
            
            //stmt.setString(1, "'%"+med.getPesquisa()+ "%'");
            ResultSet rs = stmt.executeQuery();
            
            rs.first();
                //med.setId(rs.getInt("id"));
                med.setNome(rs.getString("nomeMedico"));
                //med.setEspecialidade(rs.getString("especialidade"));
                //med.setCRM(rs.getInt("CRM"));
                //med.setUF_CRM(rs.getString("ufCRM"));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Médico não encontrado.Tente Novamente!!");
            
        }
        return med;
    }
    
    public void salvarTriagem(SisPaciente pac, SisMedico med, SisTipoConsulta consult){
        //buscarPaciente(pac);
        //buscarMedico(med);
        
        String sql = "insert into sis_tipoConsulta (paciente_id, medico_id, tipoConsulta) values(?,?,?)";
        try{
        PreparedStatement stmt = connection.ConnectionFactory.getConnection().prepareStatement(sql);
        stmt.setInt(1, consult.getPaciente_id().getId());
        stmt.setInt(2, consult.getMedico_id().getId());
        stmt.setString(3, consult.getNomeConsulta());
        stmt.executeLargeUpdate();
        
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "não Cadastrado"+ex);
        }
    }
    
    /** Creates new form SisTelaConsulta */
    public SisTelaConsulta() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txTriagemPaciente = new javax.swing.JTextField();
        txTriagemMedico = new javax.swing.JTextField();
        jcbTriagemTerapia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btTriagemSalvar = new javax.swing.JButton();
        btTriagemCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buscaPaciente = new javax.swing.JTextField();
        buscaMedico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(207, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Paciente:");

        jLabel3.setText("Médico:");

        jLabel4.setText("Triagem:");

        jcbTriagemTerapia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Terapia Individual", "Terapia em Grupo", "Terapia Familiar" }));

        btTriagemSalvar.setText("Salvar");
        btTriagemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTriagemSalvarActionPerformed(evt);
            }
        });

        btTriagemCancelar.setText("Cancelar");
        btTriagemCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTriagemCancelarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbTriagemTerapia, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txTriagemMedico))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txTriagemPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btTriagemSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTriagemCancelar)
                        .addGap(6, 6, 6)))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTriagemPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(buscaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTriagemMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(buscaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jcbTriagemTerapia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTriagemSalvar)
                    .addComponent(btTriagemCancelar))
                .addGap(58, 58, 58))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Triagem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTriagemCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTriagemCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btTriagemCancelarActionPerformed

    private void btTriagemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTriagemSalvarActionPerformed
        // TODO add your handling code here:
        //pac.setNomePaciente(txTriagemPaciente.getText());
        //med.setNome(txTriagemMedico.getText());
        SisPaciente paciente = buscarPaciente(pac);
        SisMedico medico = buscarMedico(med);
        
        
    }//GEN-LAST:event_btTriagemSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pac.setBuscaPaciente(buscaPaciente.getText());
        SisPaciente paciente = buscarPaciente(pac);
        
        txTriagemPaciente.setText(paciente.getNomePaciente());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        med.setPesquisa(txTriagemMedico.getText());
        SisMedico medico = buscarMedico(med);
        txTriagemMedico.setText(medico.getNome());    
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SisTelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisTelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisTelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisTelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SisTelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTriagemCancelar;
    private javax.swing.JButton btTriagemSalvar;
    private javax.swing.JTextField buscaMedico;
    private javax.swing.JTextField buscaPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbTriagemTerapia;
    private javax.swing.JTextField txTriagemMedico;
    private javax.swing.JTextField txTriagemPaciente;
    // End of variables declaration//GEN-END:variables

}
