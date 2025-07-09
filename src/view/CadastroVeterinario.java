
package view;

import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Especialidade;
import ClinicaVeterinaria.Veterinario;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class CadastroVeterinario extends javax.swing.JFrame {

    private Clinica clinica;

    public CadastroVeterinario(Clinica clinica) {
        initComponents();
        this.clinica = clinica;
        
        popularComboBoxEspecialidades();
        popularListaVeterinarios();
        
        limparFormulario();
    }

    private void popularListaVeterinarios() {
        
        DefaultListModel<Veterinario> modelo = new DefaultListModel<>();
        modelo.clear();
        for (Veterinario vet : this.clinica.getListaVeterinarios()) {
            modelo.addElement(vet); // Adiciona o objeto inteiro
        }
        jListVeterinarios.setModel(modelo);
    }
    
    private void popularComboBoxEspecialidades(){
        jComboBoxEspecialidade.removeAllItems();
        for (Especialidade esp : this.clinica.getListaEspecialidades()) {
            jComboBoxEspecialidade.addItem(esp);
        }
    }
    
    // Limpa o formulário e reseta para o modo de criação
    private void limparFormulario() {
        jListVeterinarios.clearSelection();
        txtNome.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        txtTurno.setText("");
        txtCfmv.setText("");
        jComboBoxEspecialidade.setSelectedIndex(-1);
        botaoCadastro.setText("Salvar Novo");
        txtNome.requestFocus();
    }
    
    // Preenche o formulário com os dados do veterinário selecionado
    private void preencherFormulario(Veterinario vet) {
        txtNome.setText(vet.getNome());
        txtCpf.setText(vet.getCpf());
        txtEmail.setText(vet.getEmail());
        txtTelefone.setText(vet.getTelefone());
        txtEndereco.setText(vet.getEndereco());
        txtTurno.setText(vet.getTurno());
        txtCfmv.setText(vet.getCfmv());
        jComboBoxEspecialidade.setSelectedItem(vet.getEspecialidade());
        botaoCadastro.setText("Salvar Alterações");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtCpf2 = new javax.swing.JTextField();
        txtCpf4 = new javax.swing.JTextField();
        txtCpf6 = new javax.swing.JTextField();
        txtCpf8 = new javax.swing.JTextField();
        txtCpf10 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTurno = new javax.swing.JTextField();
        txtCfmv = new javax.swing.JTextField();
        botaoCadastro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxEspecialidade = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListVeterinarios = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        txtCpf2.setText("jTextField1");
        txtCpf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf2ActionPerformed(evt);
            }
        });

        txtCpf4.setText("jTextField1");
        txtCpf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf4ActionPerformed(evt);
            }
        });

        txtCpf6.setText("jTextField1");
        txtCpf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf6ActionPerformed(evt);
            }
        });

        txtCpf8.setText("jTextField1");
        txtCpf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf8ActionPerformed(evt);
            }
        });

        txtCpf10.setText("jTextField1");
        txtCpf10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf10ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setSize(new java.awt.Dimension(0, 0));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 91, 109));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 91, 109));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 91, 109));
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 91, 109));
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(64, 91, 109));
        jLabel6.setText("Endereço:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 91, 109));
        jLabel7.setText("Turno:");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 91, 109));
        jLabel8.setText("Especialidade:");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(64, 91, 109));
        jLabel9.setText("CFMV:");

        txtNome.setText(" ");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCpf.setText(" ");
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtEmail.setText(" ");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtTelefone.setText(" ");
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtEndereco.setText(" ");
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        txtTurno.setText(" ");
        txtTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurnoActionPerformed(evt);
            }
        });

        txtCfmv.setText(" ");
        txtCfmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCfmvActionPerformed(evt);
            }
        });

        botaoCadastro.setText("CADASTRAR");
        botaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(54, 91, 109));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Chandas", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(247, 247, 247));
        jLabel10.setText("CADASTRAR VETERINARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Chandas", 0, 27)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(64, 91, 109));
        jLabel11.setText("SISTEMA DE GERENCIAMENTO DE CLINICAS");

        jButton1.setText("ATUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListVeterinarios);

        jLabel1.setText("LISTA DE VETERINARIOS");

        jButton2.setText("EXCLUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ALTERAR/CONSULTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel11)
                        .addGap(187, 187, 187))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(botaoCadastro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(108, 108, 108))))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCfmv, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTurno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCfmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCpf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf2ActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtCpf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf4ActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtCpf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf6ActionPerformed

    private void txtTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurnoActionPerformed

    private void txtCpf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf8ActionPerformed

    private void txtCfmvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCfmvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCfmvActionPerformed

    private void txtCpf10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf10ActionPerformed

    private void botaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroActionPerformed
        int selectedIndex = jListVeterinarios.getSelectedIndex();
        
        // Coleta os dados da tela
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String email = txtEmail.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String endereco = txtEndereco.getText().trim();
        String turno = txtTurno.getText().trim();
        String cfmv = txtCfmv.getText().trim();
        Especialidade especialidade = (Especialidade) jComboBoxEspecialidade.getSelectedItem();

        if (nome.isEmpty() || cpf.isEmpty() || cfmv.isEmpty() || especialidade == null) {
            JOptionPane.showMessageDialog(this, "Nome, CPF, CFMV e Especialidade são obrigatórios.");
            return;
        }

        if (selectedIndex == -1) { // MODO CRIAÇÃO
            Veterinario novoVet = new Veterinario(nome, cpf, email, endereco, telefone, turno, especialidade, cfmv);
            this.clinica.getListaVeterinarios().add(novoVet);
            JOptionPane.showMessageDialog(this, "Veterinário cadastrado!");
        } else { // MODO ALTERAÇÃO
            Veterinario vetParaAlterar = this.clinica.getListaVeterinarios().get(selectedIndex);
            vetParaAlterar.setNome(nome);
            vetParaAlterar.setCpf(cpf);
            vetParaAlterar.setEmail(email);
            vetParaAlterar.setTelefone(telefone);
            vetParaAlterar.setEndereco(endereco);
            vetParaAlterar.setTurno(turno);
            vetParaAlterar.setCfmv(cfmv);
            vetParaAlterar.setEspecialidade(especialidade);
            JOptionPane.showMessageDialog(this, "Dados do veterinário alterados!");
        }
        
        popularListaVeterinarios();
        limparFormulario();
    }//GEN-LAST:event_botaoCadastroActionPerformed
    

   
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedIndex = jListVeterinarios.getSelectedIndex();
        
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um veterinário para excluir.");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza?");
        
        if (confirm == JOptionPane.YES_OPTION) {
            Veterinario vet = this.clinica.getListaVeterinarios().get(selectedIndex);
            
            this.clinica.getListaVeterinarios().remove(vet);
            
            popularListaVeterinarios();
            limparFormulario();
        }
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             popularListaVeterinarios();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Veterinario vetSelecionado = jListVeterinarios.getSelectedValue();

        if (vetSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um veterinário na lista.");
            return;
        }

        // Preenche o formulário com os dados do veterinário selecionado
        txtNome.setText(vetSelecionado.getNome());
        txtCpf.setText(vetSelecionado.getCpf());
        txtEmail.setText(vetSelecionado.getEmail());
        txtTelefone.setText(vetSelecionado.getTelefone());
        txtEndereco.setText(vetSelecionado.getEndereco());
        txtTurno.setText(vetSelecionado.getTurno());
        txtCfmv.setText(vetSelecionado.getCfmv());
        jComboBoxEspecialidade.setSelectedItem(vetSelecionado.getEspecialidade());
        
        botaoCadastro.setText("Salvar Alterações");
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CadastroVeterinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<Especialidade> jComboBoxEspecialidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<Veterinario> jListVeterinarios;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCfmv;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpf10;
    private javax.swing.JTextField txtCpf2;
    private javax.swing.JTextField txtCpf4;
    private javax.swing.JTextField txtCpf6;
    private javax.swing.JTextField txtCpf8;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
