/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class SisTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form SisTelaPrincipal
     */
    public SisTelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternalFrame = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelInternalFrame = new javax.swing.JLabel();
        btCadPaciente = new javax.swing.JButton();
        btCadMedico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonAgenda = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmenuCadastro = new javax.swing.JMenu();
        CadPaciente = new javax.swing.JMenuItem();
        CadMedico = new javax.swing.JMenuItem();
        CadUsuarios = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        miMarcarConsulta = new javax.swing.JMenuItem();
        miPesquisarConsulta = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SisTriagem");
        setPreferredSize(new java.awt.Dimension(1024, 621));
        setResizable(false);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jInternalFrameBemVindo.setClosable(true);
        jInternalFrameBemVindo.setTitle("Bem vindo ao SisTriagem");
        jInternalFrameBemVindo.setPreferredSize(new java.awt.Dimension(1020, 500));
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternalFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternalFrame.setMinimumSize(new java.awt.Dimension(1020, 427));
        jPanelInternalFrame.setPreferredSize(new java.awt.Dimension(1020, 427));
        jPanelInternalFrame.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cadastros:");
        jPanelInternalFrame.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 20);

        jLabelInternalFrame.setBackground(new java.awt.Color(0, 0, 0));
        jLabelInternalFrame.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelInternalFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/internalframe.png"))); // NOI18N
        jLabelInternalFrame.setMaximumSize(new java.awt.Dimension(784, 561));
        jLabelInternalFrame.setMinimumSize(new java.awt.Dimension(784, 461));
        jLabelInternalFrame.setPreferredSize(new java.awt.Dimension(784, 461));
        jPanelInternalFrame.add(jLabelInternalFrame);
        jLabelInternalFrame.setBounds(0, 130, 1000, 300);

        btCadPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadPacientes.png"))); // NOI18N
        btCadPaciente.setToolTipText("Pacientes");
        btCadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPacienteActionPerformed(evt);
            }
        });
        jPanelInternalFrame.add(btCadPaciente);
        btCadPaciente.setBounds(90, 40, 60, 59);

        btCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CadMedicos.png"))); // NOI18N
        btCadMedico.setToolTipText("Médicos");
        btCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternalFrame.add(btCadMedico);
        btCadMedico.setBounds(10, 40, 60, 60);

        jLabel3.setText("Agenda:");
        jPanelInternalFrame.add(jLabel3);
        jLabel3.setBounds(310, 10, 50, 20);

        jButtonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Agenda.png"))); // NOI18N
        jButtonAgenda.setToolTipText("Agendamento");
        jPanelInternalFrame.add(jButtonAgenda);
        jButtonAgenda.setBounds(430, 40, 60, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelInternalFrame.add(jButton3);
        jButton3.setBounds(950, 10, 40, 40);

        jLabel4.setText("Médico");
        jPanelInternalFrame.add(jLabel4);
        jLabel4.setBounds(20, 110, 33, 14);

        jLabel5.setText("Paciente");
        jPanelInternalFrame.add(jLabel5);
        jLabel5.setBounds(100, 110, 41, 14);

        jLabel6.setText("Consulta");
        jPanelInternalFrame.add(jLabel6);
        jLabel6.setBounds(440, 110, 50, 14);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-infermeira.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelInternalFrame.add(jButton1);
        jButton1.setBounds(310, 40, 60, 60);

        jLabel7.setText("Agendamento");
        jPanelInternalFrame.add(jLabel7);
        jLabel7.setBounds(310, 110, 90, 14);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternalFrame);
        jPanelInternalFrame.setBounds(0, 41, 1000, 430);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Triagem:");
        jInternalFrameBemVindo.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 20);

        jDesktopPane1.add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(0, 50, 1020, 500);

        JmenuCadastro.setText("Cadastro");

        CadPaciente.setText("Paciente");
        CadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadPacienteActionPerformed(evt);
            }
        });
        JmenuCadastro.add(CadPaciente);

        CadMedico.setText("Médicos");
        CadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadMedicoActionPerformed(evt);
            }
        });
        JmenuCadastro.add(CadMedico);

        CadUsuarios.setText("Usuários");
        CadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadUsuariosActionPerformed(evt);
            }
        });
        JmenuCadastro.add(CadUsuarios);

        jMenuBar1.add(JmenuCadastro);

        jMenuConsulta.setText("Consultas");

        miMarcarConsulta.setText("Marcar Consulta");
        miMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMarcarConsultaActionPerformed(evt);
            }
        });
        jMenuConsulta.add(miMarcarConsulta);

        miPesquisarConsulta.setText("Pesquisar Consultas");
        jMenuConsulta.add(miPesquisarConsulta);

        jMenuBar1.add(jMenuConsulta);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemBemVindo.setText("Tela Bem-Vindo");
        jMenuItemBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem1);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadPacienteActionPerformed
        SisTelaPaciente TelaPaciente = new SisTelaPaciente();
        TelaPaciente.setVisible(true);
    }//GEN-LAST:event_CadPacienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Ok", "Cancelar"};
        int opcao = JOptionPane.showOptionDialog(null,"Deseja reealmente sair? ", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if(opcao == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBemVindoActionPerformed
        SisTelaPrincipal tela = new SisTelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemBemVindoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadMedicoActionPerformed
        // TODO add your handling code here:
        SisTelaCadMedico tela = new SisTelaCadMedico();
        tela.setVisible(true);
    }//GEN-LAST:event_CadMedicoActionPerformed

    private void btCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadMedicoActionPerformed
        // TODO add your handling code here:
        SisTelaCadMedico tela = new SisTelaCadMedico();
        tela.setVisible(true);
    }//GEN-LAST:event_btCadMedicoActionPerformed

    private void CadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadUsuariosActionPerformed
        SisTelaCadUsuario telaUser = new SisTelaCadUsuario();
        telaUser.setVisible(true);
        
    }//GEN-LAST:event_CadUsuariosActionPerformed

    private void btCadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPacienteActionPerformed
        // TODO add your handling code here:
        SisTelaPaciente TelaPaciente = new SisTelaPaciente();
        TelaPaciente.setVisible(true);
    }//GEN-LAST:event_btCadPacienteActionPerformed

    private void miMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMarcarConsultaActionPerformed
        // TODO add your handling code here:
        SisTelaConsulta consulta = new SisTelaConsulta();
        consulta.setVisible(true);
    }//GEN-LAST:event_miMarcarConsultaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SisTelaConsulta telaConsulta = new SisTelaConsulta();
        telaConsulta.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SisTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SisTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadMedico;
    private javax.swing.JMenuItem CadPaciente;
    private javax.swing.JMenuItem CadUsuarios;
    private javax.swing.JMenu JmenuCadastro;
    private javax.swing.JButton btCadMedico;
    private javax.swing.JButton btCadPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelInternalFrame;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemBemVindo;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternalFrame;
    private javax.swing.JMenuItem miMarcarConsulta;
    private javax.swing.JMenuItem miPesquisarConsulta;
    // End of variables declaration//GEN-END:variables
}
