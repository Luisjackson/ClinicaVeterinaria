
package view;

import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Vacina;
import ClinicaVeterinaria.VacinaOferecidas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class AplicarVacina extends javax.swing.JFrame {

    private Clinica clinica;
    
    public AplicarVacina(Clinica clinica) {
            initComponents();
            this.clinica = clinica; // Guarda a referência da clinica

            // acessa as listas para preencher a comboBox de Animais e vacinas
            jComboBoxAnimal.removeAllItems();
            for (Animal animal : this.clinica.getListaAnimais()) {
                jComboBoxAnimal.addItem(animal);
            }

            jComboBoxVacina.removeAllItems();
            for (VacinaOferecidas vac : this.clinica.getListaVacinas()) {
                jComboBoxVacina.addItem(vac);
            }

            txtDataAplicacao.setText(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDate.now()));
        }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBoxAnimal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtDataAplicacao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxVacina = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 91, 109));
        jLabel2.setText("Animal:");

        jComboBoxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnimalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 91, 109));
        jLabel3.setText("Vacina:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 91, 109));
        jLabel4.setText("Data da Aplicação (dd/mm/aaaa):");

        jButton1.setText("APLICAR VACINA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(54, 91, 109));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Chandas", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 247, 247));
        jLabel6.setText("APLICAR VACINA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Chandas", 0, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 91, 109));
        jLabel7.setText("SISTEMA DE GERENCIAMENTO DE CLINICAS");

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
                                .addComponent(jLabel7))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataAplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxVacina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addComponent(jButton1)))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataAplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Pega o animal selecionado, a Vacina selecionada e a data.
        Animal animalSelecionado = (Animal) jComboBoxAnimal.getSelectedItem(); 
        VacinaOferecidas tipoVacinaSelecionada = (VacinaOferecidas) jComboBoxVacina.getSelectedItem();
        String dataStr = txtDataAplicacao.getText().trim();

        //Verificação de caso não selecionado ou preenchido algo, pois tudo é obrigatorio.
        if (animalSelecionado == null || tipoVacinaSelecionada == null || dataStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campsos", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LocalDate dataAplicacao;
        
        try {
                  // Tenta converter o texto da data para um objeto LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dataAplicacao = LocalDate.parse(dataStr, formatter); //Utiliza texto preenchido e tranasforma para dias/mes/ano
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Use dd/mm/aaaa.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Vacina novaAplicacao = new Vacina(dataAplicacao, tipoVacinaSelecionada);
        
        animalSelecionado.adicionarVacina(novaAplicacao);

        String mensagem = "Vacina '" + novaAplicacao.getNomeVacina() + "' aplicada com sucesso em " + animalSelecionado.getNome() + "!\n" +
                          "Data de validade: " + novaAplicacao.getDataValidade().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n" +
                          "Valor a pagar: R$ " + String.format("%.2f", novaAplicacao.cobrar());
        
        JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAnimalActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AplicarVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Animal> jComboBoxAnimal;
    private javax.swing.JComboBox<VacinaOferecidas> jComboBoxVacina;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDataAplicacao;
    // End of variables declaration//GEN-END:variables
}
