package view;

import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaProntuario extends javax.swing.JFrame {

    private Clinica clinica;

    public TelaProntuario(Clinica clinica) {
        initComponents();
        this.clinica = clinica;
        this.setTitle("Consultar Prontuário");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha só esta janela

        // Popula o ComboBox de Animais
        jComboBoxAnimal.removeAllItems();
        jComboBoxAnimal.addItem(null); // Adiciona uma opção vazia
        for (Animal animal : this.clinica.getListaAnimais()) {
            jComboBoxAnimal.addItem(animal);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxAnimal = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonEmitir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(54, 91, 109));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Chandas", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(247, 247, 247));
        jLabel9.setText("PRONTUARIO");

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

        jComboBoxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnimalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 91, 109));
        jLabel2.setText("Animal:");

        jButtonEmitir.setText("EMITIR");
        jButtonEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmitirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel10))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(367, 367, 367))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jButtonEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAnimalActionPerformed

    private void jButtonEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmitirActionPerformed
        Animal animalSelecionado = (Animal) jComboBoxAnimal.getSelectedItem();

        if (animalSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um animal.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // CORREÇÃO: Chama a classe Prontuario do pacote view
        Prontuario telaRelatorio = new Prontuario(animalSelecionado, this.clinica);
        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_jButtonEmitirActionPerformed

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TelaProntuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEmitir;
    private javax.swing.JComboBox<Animal> jComboBoxAnimal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
