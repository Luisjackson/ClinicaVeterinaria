package view;

import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Vacina;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDate; 
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaVacinasAVencer extends javax.swing.JFrame {
 
    private Clinica clinica;

    public TelaVacinasAVencer(Clinica clinica) {
        initComponents();
        this.clinica = clinica;
        this.setTitle("Consultar Vacinas a Vencer");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // Popula o ComboBox com os OBJETOS Animal
        jComboBoxAnimall.removeAllItems();
        jComboBoxAnimall.addItem(null); // Adiciona uma opção nula para começar
        for (Animal animal : this.clinica.getListaAnimais()) {
            jComboBoxAnimall.addItem(animal);
        }
    }

    private void atualizarListaVacinas() {
        // CORREÇÃO: Pega o objeto Animal diretamente
        Animal animalSelecionado = (Animal) jComboBoxAnimall.getSelectedItem();
        DefaultListModel<String> modelo = new DefaultListModel<>();
        
        if (animalSelecionado == null) {
            jListResultados.setModel(modelo); // Limpa a lista se nenhum animal for selecionado
            return;
        }

        // A sua lógica de busca já estava correta, agora ela vai funcionar
        LocalDate agora = LocalDate.now();
        boolean encontrou = false;
        for (Vacina v : animalSelecionado.getCartaoVacina()) {
            LocalDate validade = v.getDataValidade();
            if (validade.getMonthValue() == agora.getMonthValue() && validade.getYear() == agora.getYear()) {
                modelo.addElement(v.getNomeVacina() + " - Vence em: " + validade.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                encontrou = true;
            }
        }

        if (!encontrou) {
            modelo.addElement("Nenhuma vacina deste animal vence neste mês.");
        }

        jListResultados.setModel(modelo);
    }


    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxAnimall = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListResultados = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxAnimall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnimallActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListResultados);

        jPanel2.setBackground(new java.awt.Color(54, 91, 109));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Chandas", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(247, 247, 247));
        jLabel9.setText("VACINAS A VENCER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 91, 109));
        jLabel2.setText("Animal:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 91, 109));
        jLabel3.setText("Vacinas a vencer:");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel10))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jComboBoxAnimall, 0, 182, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAnimall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
  // 1. Pega o animal selecionado na lista
        Animal animalSelecionado = (Animal) jComboBoxAnimall.getSelectedItem();

        // 2. Valida se um animal foi selecionado
        if (animalSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um animal.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 3. Chama o método da clínica que retorna a lista de vacinas a vencer
        ArrayList<Vacina> vacinasVencendo = this.clinica.vacinasQueVencemEsteMes(animalSelecionado);

        // 4. Prepara o modelo para exibir os resultados na JList
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        
        if (vacinasVencendo.isEmpty()) {
            modeloLista.addElement("Nenhuma vacina deste animal vence neste mês.");
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            modeloLista.addElement("Vacinas de " + animalSelecionado.getNome() + " que vencem este mês:");
            for (Vacina v : vacinasVencendo) {
                // Formata o texto conforme o requisito do trabalho
                String info = "- " + v.getNomeVacina() + " (Vence em: " + v.getDataValidade().format(formatter) + ")";
                modeloLista.addElement(info);
            }
        }
        
        // 5. Exibe o resultado na lista
        jListResultados.setModel(modeloLista);
    
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jComboBoxAnimallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnimallActionPerformed

    }//GEN-LAST:event_jComboBoxAnimallActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox<Animal> jComboBoxAnimall;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListResultados;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}