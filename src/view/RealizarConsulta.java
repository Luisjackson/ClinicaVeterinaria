package view;


import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica; // ok sem sistema
import ClinicaVeterinaria.Especialidade;
import ClinicaVeterinaria.Consulta;
import ClinicaVeterinaria.Agendamento;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author luis
 */
public class RealizarConsulta extends javax.swing.JFrame {
    private Clinica clinica;

    public RealizarConsulta(Clinica clinica) {
        initComponents();
        this.clinica = clinica;

        // Popula os ComboBoxes usando a instância da clínica
        jComboBoxAnimal.removeAllItems();
        for (Animal animal : this.clinica.getListaAnimais()) {
            jComboBoxAnimal.addItem(animal);
        }

        jComboBoxEspecialidade.removeAllItems();
        for (Especialidade esp : this.clinica.getListaEspecialidades()) {
            jComboBoxEspecialidade.addItem(esp);
        }
        
        jComboBoxAgendamentos.removeAllItems();
        jComboBoxAgendamentos.addItem(null); // Opção para consulta direta
        for(Agendamento ag : this.clinica.getAgendamentos()) {
            jComboBoxAgendamentos.addItem(ag);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAnimal = new javax.swing.JComboBox<>();
        jComboBoxEspecialidade = new javax.swing.JComboBox<>();
        jButtonSalvarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMedicamentos = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxAgendamentos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("REALIZACAO DE CONSULTA");

        jLabel3.setText("ANIMAL");

        jLabel4.setText("ESPECIALIDADE");

        jLabel5.setText("MOTIVO ");

        jLabel6.setText("DIAGNOSTICO");

        jLabel7.setText("MEDICAMETNO");

        jButtonSalvarConsulta.setText("SALVAR");
        jButtonSalvarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarConsultaActionPerformed(evt);
            }
        });

        txtMotivo.setColumns(20);
        txtMotivo.setRows(5);
        jScrollPane1.setViewportView(txtMotivo);

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        txtMedicamentos.setColumns(20);
        txtMedicamentos.setRows(5);
        jScrollPane3.setViewportView(txtMedicamentos);

        jLabel8.setText("COM CONSULTA");

        jComboBoxAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAgendamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSalvarConsulta)
                        .addGap(477, 477, 477))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBoxEspecialidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(116, 116, 116)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jComboBoxAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel2)))
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvarConsulta)))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarConsultaActionPerformed
        String motivo = txtMotivo.getText().trim();
        String diagnostico = txtDiagnostico.getText().trim();
        String medicamentos = txtMedicamentos.getText().trim();

        // Pega o agendamento selecionado. Pode ser 'null' se o usuário não escolheu nenhum.
     Agendamento agendamentoSelecionado = (Agendamento) jComboBoxAgendamentos.getSelectedItem();
        // CASO É UMA CONSULTA COM AGENDAMENTO
        if (agendamentoSelecionado != null) {

            // Chama o método específico para consultas agendadas
            Consulta consultaRealizada = this.clinica.realizarConsulta(agendamentoSelecionado, motivo, diagnostico, medicamentos);

            if (consultaRealizada != null) {
                String mensagem = "Consulta (agendada) registrada com sucesso para " + agendamentoSelecionado.getAnimal().getNome() + "!\n\n" +
                                  "Valor da consulta: R$ " + String.format("%.2f", consultaRealizada.cobrar());
                JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi encontrado um veterinário disponível para este agendamento.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            // CASO 2 É UMA CONSULTA DIRETA (SEM AGENDAMENTO)

            // Pega o animal e a especialidade das outras JComboBoxes
            Animal animalSelecionado = (Animal) jComboBoxAnimal.getSelectedItem();
            Especialidade especialidadeSelecionada = (Especialidade) jComboBoxEspecialidade.getSelectedItem();

            // Validação para a consulta direta
            if (animalSelecionado == null || especialidadeSelecionada == null || motivo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Para uma consulta direta, os campos Animal, Especialidade e Motivo são obrigatórios.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Chama o método específico para consultas diretas
            Consulta consultaRealizada = this.clinica.realizarConsultaDireta(animalSelecionado, especialidadeSelecionada, motivo, diagnostico, medicamentos);

            if (consultaRealizada != null) {
                String mensagem = "Consulta (direta) registrada com sucesso para " + animalSelecionado.getNome() + "!\n\n" +
                                  "Valor da consulta: R$ " + String.format("%.2f", consultaRealizada.cobrar());
                JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi encontrado um veterinário com a especialidade selecionada para a consulta direta.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSalvarConsultaActionPerformed

    private void jComboBoxAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAgendamentosActionPerformed
        // Pega o objeto Agendamento que foi selecionado
        Agendamento agendamentoSelecionado = (Agendamento) jComboBoxAgendamentos.getSelectedItem();

        // Verifica se um agendamento real foi selecionado (e não a opção "Nenhum")
        if (agendamentoSelecionado != null) {
            // CASO SEJA COM CONSULTA:
            // Preenche os outros campos com os dados do agendamento
            jComboBoxAnimal.setSelectedItem(agendamentoSelecionado.getAnimal());
            jComboBoxEspecialidade.setSelectedItem(agendamentoSelecionado.getEspecialidade());

            // Desabilita os campos para que o usuário não possa alterá-los
            jComboBoxAnimal.setEnabled(false);
            jComboBoxEspecialidade.setEnabled(false);
        } else {
            // MODO "SEM CONSULTA":
            // Se o usuário selecionar "Nenhum", reabilita os campos para uma consulta direta
            jComboBoxAnimal.setEnabled(true);
            jComboBoxEspecialidade.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxAgendamentosActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new RealizarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarConsulta;
    private javax.swing.JComboBox<Agendamento> jComboBoxAgendamentos;
    private javax.swing.JComboBox<Animal> jComboBoxAnimal;
    private javax.swing.JComboBox<Especialidade> jComboBoxEspecialidade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextArea txtMedicamentos;
    private javax.swing.JTextArea txtMotivo;
    // End of variables declaration//GEN-END:variables
}
