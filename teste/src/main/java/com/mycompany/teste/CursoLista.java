package com.mycompany.teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class CursoLista extends javax.swing.JFrame {
    private final DefaultListModel<String> listaModelo = new DefaultListModel<>();
    private final List<Cursos> listaCursos = new ArrayList<>();

    
    public CursoLista() {
        initComponents();
        jListaCurso.setModel(listaModelo);

        jBtnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarCurso();
            }
        });
        jBtnPesquisar.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              consultarCurso();
             }
        });
        jBtnCancelar.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            cancelar();
        }
    });
    }
    
   private void salvarCurso() {
    try {
        String nomeCurso = jTFNomedoCurso.getText().trim();
        String instrutor = jTFInstrutor.getText().trim();
        String dataInicioStr = jFTFDataIni.getText().trim();
        String dataFimStr = jFTFDataFim.getText().trim();

        if (nomeCurso.isEmpty() || instrutor.isEmpty() || dataInicioStr.isEmpty() || dataFimStr.isEmpty()) {
            throw new IllegalArgumentException("Preencha todos os campos!");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse(dataInicioStr, formatter);
        LocalDate dataFim = LocalDate.parse(dataFimStr, formatter);

        Cursos curso = new Cursos(nomeCurso, instrutor, dataInicio, dataFim);
        listaCursos.add(curso);

        listaModelo.addElement(curso.toString());
        JOptionPane.showMessageDialog(this, "Curso salvo com sucesso!");

        // Limpar os campos após salvar
        jTFNomedoCurso.setText("");
        jTFInstrutor.setText("");
        jFTFDataIni.setValue(null);
        jFTFDataFim.setValue(null);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar curso: " + ex.getMessage());
    }
}
     private void cancelar() {
     // Limpar os campos ao cancelar
      jTFNomedoCurso.setText("");
      jTFInstrutor.setText("");
      jFTFDataIni.setValue(null);
      jFTFDataFim.setValue(null);

      JOptionPane.showMessageDialog(this, "Operação cancelada.");
}


    private void consultarCurso() {
    try {
        String consulta = jTFConsulta.getText().trim();

        if (consulta.isEmpty()) {
            throw new IllegalArgumentException("Digite um nome para a consulta!");
        }

        listaModelo.clear();

        boolean cursoEncontrado = false;

        for (Cursos curso : listaCursos) {
            if (curso.getNomeCurso().equalsIgnoreCase(consulta)) {
                listaModelo.addElement(curso.toString());
                cursoEncontrado = true;
            }
        }

        if (!cursoEncontrado) {
            JOptionPane.showMessageDialog(this, "Nenhum curso encontrado para a consulta: " + consulta);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Erro ao realizar consulta: " + ex.getMessage());
    }
}


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUM = new javax.swing.JPanel();
        jLabelNomeCurso = new javax.swing.JLabel();
        jTFNomedoCurso = new javax.swing.JTextField();
        jLabelInstrutor = new javax.swing.JLabel();
        jTFInstrutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFTFDataIni = new javax.swing.JFormattedTextField();
        jLabelDataFim = new javax.swing.JLabel();
        jFTFDataFim = new javax.swing.JFormattedTextField();
        jBtnSalvar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPanelDois = new javax.swing.JPanel();
        jLabelConsulta = new javax.swing.JLabel();
        jTFConsulta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaCurso = new javax.swing.JList<>();
        jBtnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CURCAT - Catálogo de Cursos");
        setResizable(false);

        jLabelNomeCurso.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\nomedocurso.png")); // NOI18N
        jLabelNomeCurso.setText("Nome do Curso:");

        jTFNomedoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomedoCursoActionPerformed(evt);
            }
        });

        jLabelInstrutor.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\instrutor.png")); // NOI18N
        jLabelInstrutor.setText("Instrutor:");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\data.png")); // NOI18N
        jLabel1.setText("Data Inicio:");

        jFTFDataIni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabelDataFim.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\data.png")); // NOI18N
        jLabelDataFim.setText("Data Fim:");

        jFTFDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jBtnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\salvar.png")); // NOI18N
        jBtnSalvar.setText("Salvar");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\cancelar.png")); // NOI18N
        jBtnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanelUMLayout = new javax.swing.GroupLayout(jPanelUM);
        jPanelUM.setLayout(jPanelUMLayout);
        jPanelUMLayout.setHorizontalGroup(
            jPanelUMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUMLayout.createSequentialGroup()
                        .addGroup(jPanelUMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUMLayout.createSequentialGroup()
                                .addComponent(jLabelNomeCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNomedoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelUMLayout.createSequentialGroup()
                                .addComponent(jLabelInstrutor)
                                .addGap(18, 18, 18)
                                .addComponent(jTFInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelUMLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabelDataFim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFTFDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelUMLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jBtnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCancelar)
                        .addGap(128, 128, 128))))
        );
        jPanelUMLayout.setVerticalGroup(
            jPanelUMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUMLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelUMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeCurso)
                    .addComponent(jTFNomedoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstrutor)
                    .addComponent(jTFInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFTFDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataFim)
                    .addComponent(jFTFDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanelUMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalvar)
                    .addComponent(jBtnCancelar))
                .addContainerGap())
        );

        jPanelDois.setBackground(new java.awt.Color(204, 255, 204));

        jLabelConsulta.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\arquivo.png")); // NOI18N
        jLabelConsulta.setText("Consulta:");

        jListaCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jListaCurso.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListaCurso);

        jBtnPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout jPanelDoisLayout = new javax.swing.GroupLayout(jPanelDois);
        jPanelDois.setLayout(jPanelDoisLayout);
        jPanelDoisLayout.setHorizontalGroup(
            jPanelDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDoisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelDoisLayout.createSequentialGroup()
                        .addComponent(jLabelConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDoisLayout.setVerticalGroup(
            jPanelDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoisLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelDoisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsulta)
                    .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomedoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomedoCursoActionPerformed
      
    }//GEN-LAST:event_jTFNomedoCursoActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursoLista().setVisible(true);
            }
        });
    }

public class Cursos {
    private String nomeCurso, instrutor;
    private LocalDate dataInicio, dataFim;

    public Cursos(String nomeCurso, String instrutor, LocalDate dataInicio, LocalDate dataFim) {
        this.nomeCurso = nomeCurso;
        this.instrutor = instrutor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    @Override
    public String toString() {
        return "Nome do Curso: " + nomeCurso +
                ", Instrutor: " + instrutor +
                ", Data de Início: " + dataInicio +
                ", Data de Fim: " + dataFim;
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JFormattedTextField jFTFDataFim;
    private javax.swing.JFormattedTextField jFTFDataIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JLabel jLabelDataFim;
    private javax.swing.JLabel jLabelInstrutor;
    private javax.swing.JLabel jLabelNomeCurso;
    private javax.swing.JList<String> jListaCurso;
    private javax.swing.JPanel jPanelDois;
    private javax.swing.JPanel jPanelUM;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFConsulta;
    private javax.swing.JTextField jTFInstrutor;
    private javax.swing.JTextField jTFNomedoCurso;
    // End of variables declaration//GEN-END:variables
}
