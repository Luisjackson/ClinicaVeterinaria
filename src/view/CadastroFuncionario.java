
package view;

import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Funcionario;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author pedro
 */
public class CadastroFuncionario extends javax.swing.JFrame {

 private Clinica clinica;

public CadastroFuncionario(Clinica clinica) {
    initComponents();
    this.clinica = clinica;
    this.setTitle("Gerenciamento de Funcionários");
    popularListaFuncionarios();
    limparFormulario(); // Garante que a tela comece no modo de criação
}

private void popularListaFuncionarios() {
    DefaultListModel<Funcionario> modelo = new DefaultListModel<>();
    modelo.clear();
    for (Funcionario func : this.clinica.getListaFuncionarios()) {
        modelo.addElement(func); // Adiciona o objeto inteiro
    }
    jListFuncionarios.setModel(modelo);
}

// Método para limpar o formulário e voltar ao modo de criação
private void limparFormulario() {
    txtNome.setText("");
    txtCpf.setText("");
    txtEmail.setText("");
    txtTelefone.setText("");
    txtEndereco.setText("");
    txtTurno.setText("");
    jListFuncionarios.clearSelection(); // Importante: Limpa a seleção da lista
    jButtonSalvar.setText("Cadastrar Novo");
    txtNome.requestFocus();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTurno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFuncionarios = new javax.swing.JList<>();
        Alterar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurnoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 91, 109));
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 91, 109));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 91, 109));
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 91, 109));
        jLabel4.setText("Telefone:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 91, 109));
        jLabel5.setText("Turno:");

        jPanel2.setBackground(new java.awt.Color(54, 91, 109));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Chandas", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(247, 247, 247));
        jLabel8.setText("FUNCIONARIOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Chandas", 0, 27)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 91, 109));
        jLabel9.setText("SISTEMA DE GERENCIAMENTO DE CLINICAS");

        jButtonSalvar.setText("Cadastrar novo");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jListFuncionarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jListFuncionariosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jListFuncionarios);

        Alterar.setText("Alterar/Consultar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 91, 109));
        jLabel6.setText("Funcionarios existentes:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 91, 109));
        jLabel7.setText("Endereço");

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Alterar)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButtonSalvar)
                                                .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                                .addComponent(txtTurno)
                                                .addComponent(txtEmail)
                                                .addComponent(txtEndereco)))))
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(102, 102, 102)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButtonExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jButtonSalvar)))
                .addGap(10, 10, 10)
                .addComponent(jButtonAtualizar)
                .addGap(15, 15, 15)
                .addComponent(Alterar)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurnoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int selectedIndex = jListFuncionarios.getSelectedIndex();
        
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String email = txtEmail.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String endereco = txtEndereco.getText().trim();
        String turno = txtTurno.getText().trim();

        if (nome.isEmpty() || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome e CPF são obrigatórios.");
            return;
        }

        if (selectedIndex == -1) { // Modo Criação
            Funcionario novoFunc = new Funcionario(nome, cpf, email, telefone, endereco, turno);
            this.clinica.getListaFuncionarios().add(novoFunc);
            JOptionPane.showMessageDialog(this, "Funcionário cadastrado!");
        } else { // Modo Alteração
            Funcionario funcParaAlterar = this.clinica.getListaFuncionarios().get(selectedIndex);
            funcParaAlterar.setNome(nome);
            funcParaAlterar.setCpf(cpf);
            funcParaAlterar.setEmail(email);
            funcParaAlterar.setTelefone(telefone);
            funcParaAlterar.setEndereco(endereco);
            funcParaAlterar.setTurno(turno);
            JOptionPane.showMessageDialog(this, "Dados alterados!");
        }
        
        popularListaFuncionarios();
        limparFormulario();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        // Pega o funcionário que está selecionado na lista da direita
        Funcionario funcSelecionado = jListFuncionarios.getSelectedValue();

        // Se ninguém estiver selecionado, avisa o usuário
        if (funcSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um funcionário na lista para alterar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Se um funcionário foi selecionado, preenche o formulário com seus dados
        txtNome.setText(funcSelecionado.getNome());
        txtCpf.setText(funcSelecionado.getCpf());
        txtEmail.setText(funcSelecionado.getEmail());
        txtTelefone.setText(funcSelecionado.getTelefone());
        txtEndereco.setText(funcSelecionado.getEndereco());
        txtTurno.setText(funcSelecionado.getTurno());

        // Muda o texto do botão Salvar para indicar que estamos no modo de edição
        jButtonSalvar.setText("Salvar Alterações");
    }//GEN-LAST:event_AlterarActionPerformed

    private void jListFuncionariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jListFuncionariosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jListFuncionariosAncestorAdded

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        popularListaFuncionarios();
        limparFormulario(); // É bom limpar o form para evitar confusão
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
         int selectedIndex = jListFuncionarios.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um funcionário para excluir.");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza?");
        if (confirm == JOptionPane.YES_OPTION) {
            Funcionario func = this.clinica.getListaFuncionarios().get(selectedIndex);
            this.clinica.getListaFuncionarios().remove(func);
            popularListaFuncionarios();
            limparFormulario();
            JOptionPane.showMessageDialog(this, "Funcionário excluído.");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       //         new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<Funcionario> jListFuncionarios;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
