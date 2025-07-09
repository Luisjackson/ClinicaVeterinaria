
package view;

import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Especialidade;
import ClinicaVeterinaria.Veterinario;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class CadastroEspecialidade extends javax.swing.JFrame {

    private Clinica clinica;

    public CadastroEspecialidade(Clinica clinica) {
        initComponents();
        this.clinica = clinica;
        popularListaEspecialidades();
        limparFormulario();
    }

    private void popularListaEspecialidades() {
        DefaultListModel<Especialidade> modelo = new DefaultListModel<>();
        modelo.clear();
        for (Especialidade esp : this.clinica.getListaEspecialidades()) {
            modelo.addElement(esp);
        }
        jListEspecialidades.setModel(modelo);
    }

    private void limparFormulario() {
        txtNome.setText("");
        txtPreco.setText("");
        jListEspecialidades.clearSelection();
        txtNome.requestFocus(); // //?
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("NOME");

        jLabel2.setText("PRECO");

        Titulo.setText("ESPECIALIDADE");

        jScrollPane1.setViewportView(jListEspecialidades);

        jLabel3.setText("lista especialidades");

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButton2.setText("Alterar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Titulo)
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addComponent(jButtonSalvar)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int selectedIndex = jListEspecialidades.getSelectedIndex();
        String nome = txtNome.getText().trim();
        String precoStr = txtPreco.getText().trim();
        float preco;

        if (nome.isEmpty() || precoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome e Preço são obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            preco = Float.parseFloat(precoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um preço válido (ex: 150.00).", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (selectedIndex == -1) { // MODO CRIAÇÃO
            Especialidade novaEspecialidade = new Especialidade(nome, preco);
            this.clinica.getListaEspecialidades().add(novaEspecialidade);
            JOptionPane.showMessageDialog(this, "Especialidade cadastrada!");
        } else { // MODO ALTERAÇÃO
            Especialidade espParaAlterar = jListEspecialidades.getSelectedValue();
            espParaAlterar.setNome(nome);
            espParaAlterar.setPreco(preco);
            JOptionPane.showMessageDialog(this, "Especialidade alterada!");
        }
        
        popularListaEspecialidades();
        limparFormulario();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Especialidade espSelecionada = jListEspecialidades.getSelectedValue();

        if (espSelecionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione uma especialidade na lista.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Preenche o formulário com os dados
        txtNome.setText(espSelecionada.getNome());
        txtPreco.setText(String.valueOf(espSelecionada.getPreco()));
        
        jButtonSalvar.setText("Salvar Alterações");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        Especialidade espSelecionada = jListEspecialidades.getSelectedValue();
        if (espSelecionada == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma especialidade para excluir.");
            return;
        }
        
        // Regra de negócio: não permitir exclusão se estiver em uso
        for (Veterinario vet : this.clinica.getListaVeterinarios()) {
            if (vet.getEspecialidade().equals(espSelecionada)) {
                JOptionPane.showMessageDialog(this, "Não é possível excluir. A especialidade está em uso pelo veterinário: " + vet.getNome(), "Ação Bloqueada", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir?");
        if (confirm == JOptionPane.YES_OPTION) {
            this.clinica.getListaEspecialidades().remove(espSelecionada);
            popularListaEspecialidades();
            limparFormulario();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new CadastroEspecialidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<Especialidade> jListEspecialidades;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
