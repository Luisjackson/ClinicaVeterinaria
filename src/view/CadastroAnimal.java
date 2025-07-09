package view;

import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Tutor;
import ClinicaVeterinaria.Vacina;
import java.time.format.DateTimeFormatter;
import javax.swing.*;


public class CadastroAnimal extends javax.swing.JFrame {
    
    private Clinica clinica;

    public CadastroAnimal(Clinica clinica) {
        initComponents();
        this.clinica = clinica;
        
        popularListaAnimais();
        popularComboBoxTutores();
        limparFormulario();
    }

    private void popularListaAnimais() {
        DefaultListModel<Animal> modelo = new DefaultListModel<>();
        modelo.clear();
        for (Animal animal : this.clinica.getListaAnimais()) {
            modelo.addElement(animal);
        }
        jListAnimais.setModel(modelo);
    }
    
    private void popularComboBoxTutores() {
        jComboBoxTutor.removeAllItems();
        for (Tutor tutor : this.clinica.getListaTutores()) {
            jComboBoxTutor.addItem(tutor);
        }
    }
    
    private void limparFormulario() {
        txtNome.setText("");
        txtRaca.setText("");
        txtDataNascimento.setText("");
        jComboBoxTutor.setSelectedIndex(-1);
        jListAnimais.clearSelection();
        jButtonSalvar.setText("Salvar Novo");
        txtNome.requestFocus();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRaca = new javax.swing.JTextField();
        jComboBoxTutor = new javax.swing.JComboBox<>();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListVacinasAplicadas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAnimais = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonAtualizaHistorico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 91, 109));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 91, 109));
        jLabel3.setText("Raça:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 91, 109));
        jLabel4.setText("Nascimento:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 91, 109));
        jLabel5.setText("Tutor:");

        txtNome.setText(" ");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtRaca.setText(" ");
        txtRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRacaActionPerformed(evt);
            }
        });

        jComboBoxTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTutorActionPerformed(evt);
            }
        });

        txtDataNascimento.setText(" ");

        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(54, 91, 109));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Chandas", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 247, 247));
        jLabel6.setText("CADASTRO ANIMAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Chandas", 0, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 91, 109));
        jLabel7.setText("SISTEMA DE GERENCIAMENTO DE CLINICAS");

        jLabel1.setText("VACINAS APLICADAS");

        jButton2.setText("Cadastar Tutor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListVacinasAplicadas);

        jScrollPane2.setViewportView(jListAnimais);

        jLabel8.setText("Lista de Animais ");

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Alterar/Consultar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Consultar Vacinas a VEncer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAtualizaHistorico.setText("Atualiza");
        jButtonAtualizaHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizaHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDataNascimento)
                    .addComponent(txtRaca)
                    .addComponent(txtNome)
                    .addComponent(jComboBoxTutor, 0, 137, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jButton4)
                                .addGap(48, 48, 48)
                                .addComponent(jButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addComponent(jButtonAtualizaHistorico)
                        .addGap(168, 168, 168))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButtonSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonSalvar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAtualizaHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(47, 47, 47)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int selectedIndex = jListAnimais.getSelectedIndex();
        String nome = txtNome.getText().trim();
        String raca = txtRaca.getText().trim();
        String dataNascimento = txtDataNascimento.getText().trim();
        Tutor tutorSelecionado = (Tutor) jComboBoxTutor.getSelectedItem();

        if (nome.isEmpty() || raca.isEmpty() || tutorSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Nome, Raça e Tutor são obrigatórios.");
            return;
        }

        if (selectedIndex == -1) { // MODO CRIAÇÃO 
            Animal novoAnimal = new Animal(nome, raca, dataNascimento, tutorSelecionado);
            this.clinica.getListaAnimais().add(novoAnimal);
            tutorSelecionado.adicionarAnimal(novoAnimal);
            JOptionPane.showMessageDialog(this, "Animal cadastrado!");
        } else { // MODO ALTERAÇÃO 
            Animal animalParaAlterar = jListAnimais.getSelectedValue();
            Tutor tutorAntigo = animalParaAlterar.getTutor();

            animalParaAlterar.setNome(nome);
            animalParaAlterar.setRaca(raca);
            animalParaAlterar.setDataNascimento(dataNascimento);
            
            if (!tutorAntigo.equals(tutorSelecionado)) {
                tutorAntigo.removerAnimal(animalParaAlterar);
                animalParaAlterar.setTutor(tutorSelecionado);
                tutorSelecionado.adicionarAnimal(animalParaAlterar);
            }
            JOptionPane.showMessageDialog(this, "Dados do animal alterados!");
        }
        
        popularListaAnimais();
        limparFormulario();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void txtRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRacaActionPerformed

    }//GEN-LAST:event_txtRacaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CadastroTutor cadastroTutor = new CadastroTutor(this.clinica);
        cadastroTutor.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Animal animalSelecionado = jListAnimais.getSelectedValue();
        if (animalSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Selecione um animal para excluir.");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?");
        if (confirm == JOptionPane.YES_OPTION) {
            Tutor tutorDoAnimal = animalSelecionado.getTutor();
            if (tutorDoAnimal != null) {
                tutorDoAnimal.removerAnimal(animalSelecionado);
            }
            this.clinica.getListaAnimais().remove(animalSelecionado);
            
            popularListaAnimais();
            limparFormulario();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaVacinasAVencer telaVencimentos = new TelaVacinasAVencer(this.clinica);
        telaVencimentos.setVisible(true);   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTutorActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Animal animalSelecionado = jListAnimais.getSelectedValue();

        if (animalSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um animal na lista.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Preenche o formulário com os dados do animal selecionado
        txtNome.setText(animalSelecionado.getNome());
        txtRaca.setText(animalSelecionado.getRaca());
        txtDataNascimento.setText(animalSelecionado.getDataNascimento());
        jComboBoxTutor.setSelectedItem(animalSelecionado.getTutor());
        
        jButtonSalvar.setText("Salvar Alterações");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        popularComboBoxTutores();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAtualizaHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizaHistoricoActionPerformed
    //Pega o animal que está atualmente selecionado na lista principal
    Animal animalSelecionado = jListAnimais.getSelectedValue();

    // Verifica se um animal está selecionado
    if (animalSelecionado == null) {
        JOptionPane.showMessageDialog(this, "Primeiro, selecione um animal na lista da direita para ver seu histórico.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Recarrega a lista de vacinas para aquele animal específico
    DefaultListModel<String> modeloVacinas = new DefaultListModel<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Verifica se o cartão de vacinas não está vazio
    if (animalSelecionado.getCartaoVacina().isEmpty()) {
        modeloVacinas.addElement("Nenhuma vacina aplicada.");
    } else {
        // Percorre o cartão de vacinas do animal e adiciona na lista
        for (Vacina vac : animalSelecionado.getCartaoVacina()) {
            String infoVacina = vac.getNomeVacina() + 
                                " | Aplicada em: " + vac.getDataAplicacao().format(formatter) + 
                                " | Válida até: " + vac.getDataValidade().format(formatter);
            modeloVacinas.addElement(infoVacina);
        }
    }

    // Define o modelo atualizado na JList de vacinas aplicadas
    jListVacinasAplicadas.setModel(modeloVacinas);

    JOptionPane.showMessageDialog(this, "Histórico de vacinas de " + animalSelecionado.getNome() + " foi atualizado!");
    }//GEN-LAST:event_jButtonAtualizaHistoricoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAtualizaHistorico;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<Tutor> jComboBoxTutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<Animal> jListAnimais;
    private javax.swing.JList<String> jListVacinasAplicadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
