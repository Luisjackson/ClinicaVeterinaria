package view;

import ClinicaVeterinaria.Agenda;
import ClinicaVeterinaria.Agendamento;
import ClinicaVeterinaria.Animal;
import ClinicaVeterinaria.Clinica;
import ClinicaVeterinaria.Especialidade;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.*;

public class MarcarConsulta extends javax.swing.JFrame {

    private Clinica clinica;

    public MarcarConsulta(Clinica clinica) {
        initComponents();
        this.clinica = clinica;
        
        // Populando os componentes com os dados da clínica
        popularComboBoxAnimal();
        popularComboBoxEspecialidade();
        jComboBox3.removeAllItems(); // ComboBox de Horários começa vazio
        popularListaAgendamentos();
    }

        private void popularComboBoxAnimal() {
        jComboBox1.removeAllItems();
        for (Animal animal : this.clinica.getListaAnimais()) {
            jComboBox1.addItem(animal.getNome());
        }
    }
    
    private void popularComboBoxEspecialidade() {
        jComboBox2.removeAllItems();
        for (Especialidade esp : this.clinica.getListaEspecialidades()) {
            jComboBox2.addItem(esp.getNome());
        }
    }
    
    private void popularListaAgendamentos() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        modelo.clear();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");

        for (Agendamento ag : this.clinica.getAgendamentos()) {
            String info = ag.getAnimal().getNome() + " - " + ag.getEspecialidade().getNome() + " - " + ag.getAgenda().toString();
            modelo.addElement(info);
        }
        jList1.setModel(modelo);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtData = new javax.swing.JTextField();
        jButtonVerificarHorarios = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("AGENDAMENTO DE CONSULTA");

        jLabel2.setText("ANIMAL");

        jLabel3.setText("ESPECIALIDADE");

        jLabel4.setText("DATA");

        jButton1.setText("AGENDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("SISTEMA DE GERENCIAMENTO DE CLINICA");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("ATUALIZAR LISTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EXCLUIR SELECIONADO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonVerificarHorarios.setText("vERIFICAR HORA");
        jButtonVerificarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarHorariosActionPerformed(evt);
            }
        });

        jLabel6.setText("horarios");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(339, 339, 339))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVerificarHorarios)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(211, 211, 211))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(209, 209, 209)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonVerificarHorarios)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)))
                .addComponent(jButton1)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerificarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarHorariosActionPerformed
        
        String dataStr = txtData.getText().trim();
        
        String nomeEspecialidade = (String) jComboBox2.getSelectedItem();

        if (dataStr.isEmpty() || nomeEspecialidade == null) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha a data e selecione uma especialidade.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LocalDate dataSelecionada;
        
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dataSelecionada = LocalDate.parse(dataStr, formatter);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Formato de data inválido. Use dd/mm/aaaa.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Especialidade especialidadeSelecionada = null;
        
        for (Especialidade esp : this.clinica.getListaEspecialidades()) {
            if (esp.getNome().equals(nomeEspecialidade)) {
                especialidadeSelecionada = esp;
                break;
            }
        }
        
        jComboBox3.removeAllItems();
        
        ArrayList<LocalTime> todosOsHorarios = gerarHorariosPermitidos();
        
        for (LocalTime horario : todosOsHorarios) {
            boolean horarioOcupado = false;
            for (Agendamento ag : this.clinica.getAgendamentos()) {
                if (ag.getAgenda().getData().equals(dataSelecionada) && ag.getAgenda().getHorario().equals(horario) &&
                    ag.getEspecialidade().equals(especialidadeSelecionada)) {
                    horarioOcupado = true;
                    break;
                }
            }
            if (!horarioOcupado) {
                jComboBox3.addItem(horario.format(DateTimeFormatter.ofPattern("HH:mm")));
            }
        }
        
    }//GEN-LAST:event_jButtonVerificarHorariosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String nomeAnimal = (String) jComboBox1.getSelectedItem();
        String nomeEspecialidade = (String) jComboBox2.getSelectedItem();
        String dataStr = txtData.getText().trim();
        String horarioStr = (String) jComboBox3.getSelectedItem();

        //garantir que nao seja null
        if (nomeAnimal == null || nomeEspecialidade == null || dataStr.isEmpty() || horarioStr == null) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos e um horário deve ser selecionado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Animal animalSelecionado = null; // Para armazenar o animal realmente, nao a string
            
            for (Animal animal : this.clinica.getListaAnimais()) {
                if (animal.getNome().equals(nomeAnimal)) {
                    animalSelecionado = animal;
                    break;
                }
            }

            Especialidade especialidadeSelecionada = null;
            for (Especialidade esp : this.clinica.getListaEspecialidades()) {
                if (esp.getNome().equals(nomeEspecialidade)) {
                    especialidadeSelecionada = esp;
                    break;
                }
            }

            LocalDate dataSelecionada = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalTime horarioSelecionado = LocalTime.parse(horarioStr, DateTimeFormatter.ofPattern("HH:mm"));

            Agenda novaAgenda = new Agenda(dataSelecionada, horarioSelecionado);
            
            boolean sucesso = this.clinica.marcarAgendamento(animalSelecionado, especialidadeSelecionada, novaAgenda);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Agendamento realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                popularListaAgendamentos();
                jComboBox3.removeAllItems();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível realizar o agendamento. O horário pode ter sido ocupado.", "Falha no Agendamento", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao processar o agendamento.\nVerifique os dados e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            popularListaAgendamentos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedIndex = jList1.getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um agendamento para excluir.", "Nenhum agendamento selecionado", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja cancelar o agendamento selecionado?", "Confirmar Cancelamento", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Agendamento agendamentoParaCancelar = this.clinica.getAgendamentos().get(selectedIndex);
                
                boolean sucesso = this.clinica.cancelarAgendamento(agendamentoParaCancelar);

                if (sucesso) {
                    JOptionPane.showMessageDialog(this, "Agendamento cancelado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    popularListaAgendamentos();
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível encontrar e cancelar o agendamento.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(this, "Erro ao selecionar o agendamento. Por favor, atualize a lista e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
     public ArrayList<LocalTime> gerarHorariosPermitidos() {
        ArrayList<LocalTime> horarios = new ArrayList<>();
        
        for (int hora = 8; hora < 12; hora++) {
            horarios.add(LocalTime.of(hora, 0));
            horarios.add(LocalTime.of(hora, 20));
            horarios.add(LocalTime.of(hora, 40));
        }
        
        for (int hora = 14; hora < 18; hora++) {
            horarios.add(LocalTime.of(hora, 0));
            horarios.add(LocalTime.of(hora, 20));
            horarios.add(LocalTime.of(hora, 40));
        }
        
        return horarios;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new MarcarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonVerificarHorarios;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
