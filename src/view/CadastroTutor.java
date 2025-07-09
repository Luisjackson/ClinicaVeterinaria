package view;

import ClinicaVeterinaria.Tutor;
import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica;
import javax.swing.*;


public class CadastroTutor extends javax.swing.JFrame {

    private Clinica clinica;    

    public CadastroTutor(Clinica clinica) {
        initComponents();
        this.clinica = clinica;
        this.setTitle("Gerenciamento de Tutores");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        popularListaTutores();
//        limparFormulario();
    }

    private void popularListaTutores() {
        DefaultListModel<Tutor> modelo = new DefaultListModel<>();
        modelo.clear();
        for (Tutor tutor : this.clinica.getListaTutores()) {
            modelo.addElement(tutor);
        }
        jListTutores.setModel(modelo);
    }

    private void limparFormulario() {
        txtNome.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        jListTutores.clearSelection();
        
        // Limpa a ComboBox de animais
        jComboBoxAnimais.setModel(new DefaultComboBoxModel<>());
        
        jButtonSalvar.setText("Cadastrar Novo");
        txtNome.requestFocus();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jComboBoxAnimais = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTutores = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();

        jTextField5.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 91, 109));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 91, 109));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 91, 109));
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 91, 109));
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 91, 109));
        jLabel6.setText("Endereço:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 91, 109));
        jLabel7.setText("Animal:");

        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        txtNome.setText(" ");

        txtTelefone.setText(" ");

        txtEndereco.setText(" ");

        txtEmail.setText(" ");

        jComboBoxAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnimaisActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(54, 91, 109));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Chandas", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(247, 247, 247));
        jLabel8.setText("CADASTRO DE TUTOR");

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

        jScrollPane1.setViewportView(jListTutores);

        jLabel1.setText("LISTA DE TUTORES");

        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("CONSULTAR/ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("ATUALIZAR");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefone)
                            .addComponent(txtEmail)
                            .addComponent(txtCpf)
                            .addComponent(jComboBoxAnimais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jButtonSalvar)))
                        .addGap(239, 239, 239)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonAtualizar))))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButtonExcluir)))
                .addGap(27, 27, 27)
                .addComponent(jButtonAlterar)
                .addGap(31, 31, 31)
                .addComponent(jButtonAtualizar)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jComboBoxAnimais.getAccessibleContext().setAccessibleName("");
        jComboBoxAnimais.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       int selectedIndex = jListTutores.getSelectedIndex();
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String email = txtEmail.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String endereco = txtEndereco.getText().trim();

        if (nome.isEmpty() || cpf.isEmpty()) { /* ... (mensagem de erro) ... */ return; }

        if (selectedIndex == -1) { // Modo Criação
            Tutor novoTutor = new Tutor(nome, cpf, email, telefone, endereco);
            this.clinica.getListaTutores().add(novoTutor);
            JOptionPane.showMessageDialog(this, "Tutor cadastrado!");
        } else { // Modo Alteração
            Tutor tutorParaAlterar = jListTutores.getSelectedValue();
            tutorParaAlterar.setNome(nome);
            tutorParaAlterar.setCpf(cpf);
            tutorParaAlterar.setEmail(email);
            tutorParaAlterar.setTelefone(telefone);
            tutorParaAlterar.setEndereco(endereco);
            JOptionPane.showMessageDialog(this, "Dados do tutor alterados!");
        }
        
        // CORREÇÃO DO BUG: Atualiza a lista e limpa o formulário
        popularListaTutores();
        limparFormulario();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        Tutor tutorSelecionado = jListTutores.getSelectedValue();
        if (tutorSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Selecione um tutor para excluir.");
            return;
        }
        
        if (!tutorSelecionado.getAnimais().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não é possível excluir um tutor que possui animais.", "Ação Bloqueada", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?");
        if (confirm == JOptionPane.YES_OPTION) {
            this.clinica.getListaTutores().remove(tutorSelecionado);
            popularListaTutores();
            limparFormulario();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
    // Pega o objeto Tutor que está selecionado na lista da direita
    Tutor tutorSelecionado = jListTutores.getSelectedValue();

    // Se ninguém estiver selecionado, avisa o usuário
    if (tutorSelecionado == null) {
        JOptionPane.showMessageDialog(this, "Por favor, selecione um tutor na lista.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // --- Parte que já funcionava ---
    // Preenche os campos de texto com os dados do tutor
    txtNome.setText(tutorSelecionado.getNome());
    txtCpf.setText(tutorSelecionado.getCpf());
    txtEmail.setText(tutorSelecionado.getEmail());
    txtTelefone.setText(tutorSelecionado.getTelefone());
    txtEndereco.setText(tutorSelecionado.getEndereco());
    
    // Cria um novo modelo para a ComboBox de animais
    DefaultComboBoxModel<Animal> modeloAnimais = new DefaultComboBoxModel<>();
    
    // Percorre a lista de animais DAQUELE TUTOR ESPECÍFICO
    for (Animal animal : tutorSelecionado.getAnimais()) {
        // 3. Adiciona cada animal do tutor na ComboBox
        modeloAnimais.addElement(animal);
    }
    
    // Define este novo modelo naComboBox
    jComboBoxAnimais.setModel(modeloAnimais);
    // ------------------------------------
    
    // Habilita a ComboBox para que o usuário possa vê-la
    jComboBoxAnimais.setEnabled(true);
    jLabel7.setEnabled(true); // Habilita o label "Animal:"
    
    // Muda o texto do botão Salvar para indicar que estamos no modo de edição
    jButtonSalvar.setText("Salvar Alterações");
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jComboBoxAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnimaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAnimaisActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
            
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

//    public void popularComboBoxAnimais(){
//        jComboBoxAnimais.removeAllItems();
//        jComboBoxAnimais.addItem("Nenhum"); // Opção para não associar um animal
//        // Usa a lista da clínica
//        for (Animal animal : this.clinica.getListaAnimais()) {
//            // Mostra apenas animais que ainda não têm um tutor
//            if (animal.getTutor() == null) {
//                jComboBoxAnimais.addItem(animal.getNome());
//            }
//        }
//    }
    

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        
//                new CadastroTutor().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<Animal> jComboBoxAnimais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<Tutor> jListTutores;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
