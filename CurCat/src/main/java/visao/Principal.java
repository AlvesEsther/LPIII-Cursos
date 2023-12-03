
package visao;

import javax.swing.JFrame;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmLogoCurso = new javax.swing.JMenu();
        jmCadastros = new javax.swing.JMenu();
        jmiNome = new javax.swing.JMenuItem();
        jmiInstrutor = new javax.swing.JMenuItem();
        jmiData = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiCursosLista = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CURCAT - Catálogo de Cursos");
        setResizable(false);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        jmLogoCurso.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\logo.png")); // NOI18N
        jmLogoCurso.setMnemonic('C');
        jmLogoCurso.setText("Cursos");

        jmCadastros.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\cadastro.png")); // NOI18N
        jmCadastros.setMnemonic('L');
        jmCadastros.setText("Cadastros");

        jmiNome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiNome.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\nomedocurso.png")); // NOI18N
        jmiNome.setText("Nome do Curso");
        jmCadastros.add(jmiNome);

        jmiInstrutor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiInstrutor.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\instrutor.png")); // NOI18N
        jmiInstrutor.setText("Instrutor");
        jmCadastros.add(jmiInstrutor);

        jmiData.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiData.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\data.png")); // NOI18N
        jmiData.setText("Data");
        jmCadastros.add(jmiData);

        jmLogoCurso.add(jmCadastros);
        jmLogoCurso.add(jSeparator1);

        jmiCursosLista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiCursosLista.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\cursos cada.png")); // NOI18N
        jmiCursosLista.setText("Lista de Cursos ");
        jmiCursosLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCursosListaActionPerformed(evt);
            }
        });
        jmLogoCurso.add(jmiCursosLista);

        jmbBarraMenu.add(jmLogoCurso);

        jmSobre.setIcon(new javax.swing.ImageIcon("C:\\Users\\rezen\\Downloads\\img lp3\\sobre.png")); // NOI18N
        jmSobre.setMnemonic('I');
        jmSobre.setText("Sobre");
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        setSize(new java.awt.Dimension(874, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCursosListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCursosListaActionPerformed
        FormPadrao tela = new FormPadrao();
        jDesktop.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCursosListaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmLogoCurso;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiCursosLista;
    private javax.swing.JMenuItem jmiData;
    private javax.swing.JMenuItem jmiInstrutor;
    private javax.swing.JMenuItem jmiNome;
    // End of variables declaration//GEN-END:variables
}
