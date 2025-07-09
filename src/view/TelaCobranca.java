package view;

import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Animal;
import javax.swing.*;
import view.Cobranca;

public class TelaCobranca extends javax.swing.JFrame {

    private Clinica clinica;

    public TelaCobranca(Clinica clinica) {
        initComponents();
        this.clinica = clinica;
    
        popularComboBoxAnimais();
    }

    public void popularComboBoxAnimais(){
                jComboBoxAnimal.removeAllItems();
        jComboBoxAnimal.addItem(null); // Opção vazia
        for (Animal animal : this.clinica.getListaAnimais()) {
            jComboBoxAnimal.addItem(animal);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxAnimal = new javax.swing.JComboBox<>();
        jButtonVerValores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("TELA COBRANCA");

        jLabel2.setText("ANIMAL");

        jComboBoxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnimalActionPerformed(evt);
            }
        });

        jButtonVerValores.setText("VER VALORES");
        jButtonVerValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerValoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62)
                        .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonVerValores)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(jButtonVerValores)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnimalActionPerformed

    }//GEN-LAST:event_jComboBoxAnimalActionPerformed

    private void jButtonVerValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerValoresActionPerformed
        Animal animalSelecionado = (Animal) jComboBoxAnimal.getSelectedItem();

        if (animalSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um animal.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // MUDANÇA: Agora cria e exibe a janela de cobrança diretamente.
        Cobranca telaResultado = new Cobranca(animalSelecionado, this.clinica);
        telaResultado.setVisible(true);
    }//GEN-LAST:event_jButtonVerValoresActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TelaCobranca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerValores;
    private javax.swing.JComboBox<Animal> jComboBoxAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
