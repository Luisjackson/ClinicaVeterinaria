package view;

import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Tutor;

import javax.swing.*;

public class TelaConsultarTutor extends javax.swing.JPanel {

    private Clinica clinica;
    private Tutor tutor;
    
    public TelaConsultarTutor(Tutor tutor, Clinica clinica) {
        initComponents();
         
        this.clinica = clinica;
        this.tutor = tutor;
         
        // Atualiza a jList1 criada no NetBeans
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Animal animal : tutor.getAnimais()) {
            modelo.addElement(animal.getNome());
        }

        jList1.setModel(modelo);

        // Preenche os campos do tutor
        jTextField1.setText(tutor.getNome());
        jTextField2.setText(tutor.getCpf());
        jTextField3.setText(tutor.getEmail());
        jTextField4.setText(tutor.getEndereco());
        jTextField5.setText(tutor.getTelefone());

        // Torna os campos não editáveis
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabelNome.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(64, 91, 109));
        jLabelNome.setText("Nome:");

        jTextField1.setText("jTextField1");

        jLabelCpf.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(64, 91, 109));
        jLabelCpf.setText("CPF:");

        jLabelEmail.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(64, 91, 109));
        jLabelEmail.setText("Email:");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jLabelEndereco.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(64, 91, 109));
        jLabelEndereco.setText("Endereço:");

        jLabelTelefone.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(64, 91, 109));
        jLabelTelefone.setText("Telefone:");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 91, 109));
        jLabel1.setText("Animal:");

        jButton2.setText("Excluir Animal Selecionado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(54, 91, 109));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Chandas", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(247, 247, 247));
        jLabel9.setText("CONSULTAR DADOS DE TUTOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Chandas", 0, 27)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(64, 91, 109));
        jLabel10.setText("SISTEMA DE GERENCIAMENTO DE CLINICAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEndereco)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelCpf)
                                    .addComponent(jLabelNome))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTelefone)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)))))
                        .addGap(0, 546, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel10))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNome)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(186, 186, 186))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Pega o índice do item selecionado na lista
        int selectedIndex = jList1.getSelectedIndex();

        // Verifica se um animal foi realmente selecionado
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um animal para excluir.", "Nenhum animal selecionado", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        // Pede confirmação antes de excluir
        int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir o animal selecionado?",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION);

        // Se o usuário não confirmar (clicar em "Não"), encerra o método
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Se confirmou, continua com a exclusão
        try {
            // Pega o nome do animal a partir do valor selecionado na lista
            String nomeAnimal = jList1.getSelectedValue();

            // Encontra o objeto Animal correspondente
            Animal animalParaExcluir = null;
            for (Animal animal : this.tutor.getAnimais()) {
                if (animal.getNome().equals(nomeAnimal)) {
                    animalParaExcluir = animal;
                    break;
                }
            }

            // Se encontrou o animal, remove das listas
            if (animalParaExcluir != null) {
                // Remove da lista do tutor (precisaremos criar esse método)
                this.tutor.removerAnimal(animalParaExcluir);

                // Remove da lista geral do sistema
                this.clinica.getListaAnimais().remove(animalParaExcluir);

                // Remove da lista visual (JList)
                DefaultListModel<String> model = (DefaultListModel<String>) jList1.getModel();
                model.remove(selectedIndex);

                JOptionPane.showMessageDialog(this, "Animal excluído com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao excluir o animal.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables



}
