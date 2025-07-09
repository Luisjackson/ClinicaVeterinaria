
package view;

import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Vacina;
import ClinicaVeterinaria.VacinaOferecidas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class CadastroVacina extends javax.swing.JFrame {

    private Clinica clinica;

    public CadastroVacina(Clinica clinica) {
        initComponents();
        this.clinica = clinica;

        popularListaVacinas();
        limparFormulario();
    }

    private void popularListaVacinas() {
        DefaultListModel<VacinaOferecidas> modelo = new DefaultListModel<>();
        modelo.clear();
        for (VacinaOferecidas vac : this.clinica.getListaVacinas()) {
            modelo.addElement(vac);
        }
        jListVacinas1.setModel(modelo);
    }

    private void limparFormulario() {
        TextNome.setText("");
        TextPreco.setText("");
        TextValidade.setText("");
        jListVacinas.clearSelection();
        jButtonSalvar.setText("Salvar Nova");
    }

    private void preencherFormulario(VacinaOferecidas vac) {
        TextNome.setText(vac.getNome());
        TextPreco.setText(String.valueOf(vac.getPreco()));

        // Formata a data para exibir no campo de texto
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        TextValidade.setText(vac.getValidade().format(formatter));
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListVacinas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        TextPreco = new javax.swing.JTextField();
        TextValidade = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir1 = new javax.swing.JButton();
        jButtonAtualizar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListVacinas1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jButtonConsultar = new javax.swing.JButton();

        jButtonAlterar.setText("CONSULTAR/ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("ATUALIZAR");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButton1.setText("APLICAR VACINAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ADICIONAR VACINA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListVacinas);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("SISTEMA GERENCIAMEN");

        jLabel2.setText("CADASTRARA VACINA");

        jLabel3.setText("NOME");

        jLabel4.setText("PRECO");

        jLabel5.setText("VALIDADE");

        jButtonSalvar.setText("CADASTRAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir1.setText("EXCLUIR");
        jButtonExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluir1ActionPerformed(evt);
            }
        });

        jButtonAtualizar1.setText("ATUALIZAR");
        jButtonAtualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizar1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListVacinas1);

        jLabel6.setText("VACINAS");

        jButtonConsultar.setText("Consultar/Alterar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(72, 72, 72))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(99, 99, 99)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                    .addComponent(TextNome)
                                    .addComponent(TextPreco))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(384, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)
                        .addGap(336, 336, 336)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(230, 230, 230))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConsultar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtualizar1)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultar)
                        .addGap(28, 28, 28)))
                .addComponent(jButtonExcluir1)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtualizar1)
                .addGap(0, 165, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       VacinaOferecidas vacinaSelecionada = jListVacinas1.getSelectedValue();
             
        String nome = TextNome.getText().trim();
        String precoStr = TextPreco.getText().trim();
        String validadeStr = TextValidade.getText().trim();
        float preco;
        LocalDate validade;

        if (nome.isEmpty() || precoStr.isEmpty() || validadeStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios.");
            return;
        }

        // garantir o formato certo
        try {
            preco = Float.parseFloat(precoStr);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            validade = LocalDate.parse(validadeStr, formatter);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Preço deve ser um número válido.");
            return;
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Use dd/mm/aaaa.");
            return;
        }

        // SE NADA ESTIVER SELECIONADO, CRIA UMA NOVA VACINA
        if (vacinaSelecionada == null) { 
            VacinaOferecidas novaVacina = new VacinaOferecidas(nome, preco, validade);
            this.clinica.getListaVacinas().add(novaVacina);
            JOptionPane.showMessageDialog(this, "Tipo de vacina cadastrado!");
        } else { // SE ALGO ESTIVER SELECIONADO, ALTERA A VACINA EXISTENTE
            // Usa o objeto que já pegamos
            vacinaSelecionada.setNome(nome);
            vacinaSelecionada.setPreco(preco);
            vacinaSelecionada.setValidade(validade);
            JOptionPane.showMessageDialog(this, "Dados da vacina alterados!");
        }
        
        popularListaVacinas();
        limparFormulario();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
  
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
//        int selectedIndex = jListVacinas.getSelectedIndex();
//        if (selectedIndex == -1) { 
//            return;
//        }
//
//        int confirma = JOptionPane.showConfirmDialog(this, "Tem certeza?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
//        
//        if (confirma == JOptionPane.YES_OPTION) {
//            VacinaOferecidas vacinaParaExcluir = jListVacinas.getSelectedValue();
//
//
//            // Remove da lista da clínica
//            this.clinica.getListaVacinas().remove(vacinaParaExcluir);
//            popularListaVacinas(); // atualia lista de vacins
//            JOptionPane.showMessageDialog(this, "Vacina excluída com sucesso!");
//        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        popularListaVacinas();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        AplicarVacina aplicarVacina = new AplicarVacina(this.clinica);
//        aplicarVacina.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        CadastroVacina cadastroVacina = new CadastroVacina(this.clinica);
//        cadastroVacina.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluir1ActionPerformed
        VacinaOferecidas vacinaSelecionada = jListVacinas1.getSelectedValue();
        if (vacinaSelecionada == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma vacina para excluir.");
            return;
        }
        
        //não permitir exclusão se já foi aplicada
        for (Animal animal : this.clinica.getListaAnimais()) {
            for (Vacina vacinaAplicada : animal.getCartaoVacina()) {
                if (vacinaAplicada.getNomeVacina().equalsIgnoreCase(vacinaSelecionada.getNome())) {
                    JOptionPane.showMessageDialog(this, "Não é possível excluir. Esta vacina já foi aplicada no animal: " + animal.getNome(), "Ação Bloqueada", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?");
        
        if (confirm == JOptionPane.YES_OPTION) {
            this.clinica.getListaVacinas().remove(vacinaSelecionada);
            popularListaVacinas();
            limparFormulario();
        }
  
    }//GEN-LAST:event_jButtonExcluir1ActionPerformed

    private void jButtonAtualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizar1ActionPerformed
       popularListaVacinas();
    }//GEN-LAST:event_jButtonAtualizar1ActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        VacinaOferecidas vacinaSelecionada = jListVacinas1.getSelectedValue();

        if (vacinaSelecionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma vacina na lista.");
            return;
        }

        // Preenche o formulário para edição
        TextNome.setText(vacinaSelecionada.getNome());
        TextPreco.setText(String.valueOf(vacinaSelecionada.getPreco()));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        TextValidade.setText(vacinaSelecionada.getValidade().format(formatter));
        
        jButtonSalvar.setText("Salvar Alterações");
    }//GEN-LAST:event_jButtonConsultarActionPerformed
    

    private void limparCampos() {
        TextNome.setText("");
        TextPreco.setText("");
        TextValidade.setText("");
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
         //       new CadastroVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextPreco;
    private javax.swing.JTextField TextValidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonAtualizar1;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonExcluir1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<VacinaOferecidas> jListVacinas;
    private javax.swing.JList<VacinaOferecidas> jListVacinas1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
