package gui;
import obj.Settings;

/**
 *
 * @author JuanMier
 */
public class Avanzadas extends javax.swing.JFrame {
    
    private PrePartida ventanaSecundaria;

    /**
     * Creates new form Avanzadas
     */
    private Avanzadas() {
        initComponents();
    }
    
    public Avanzadas(PrePartida p) {
        this();
        ventanaSecundaria = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgModos = new javax.swing.ButtonGroup();
        btnClásico = new javax.swing.JRadioButton();
        btnExperimental = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        chkDiagonalMovement = new javax.swing.JCheckBox();
        chkConsoleOutput = new javax.swing.JCheckBox();
        chkHUD = new javax.swing.JCheckBox();
        chkCheatsAvailable = new javax.swing.JCheckBox();
        chkMoreNextValues = new javax.swing.JCheckBox();
        chkBalancedStart = new javax.swing.JCheckBox();
        chkExitOnEnd = new javax.swing.JCheckBox();
        chkPaintArrows = new javax.swing.JCheckBox();
        chkEnhancedDiffMult = new javax.swing.JCheckBox();
        chkSaveResults = new javax.swing.JCheckBox();
        chkDrawZones = new javax.swing.JCheckBox();
        chkDrawGrid = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        chkDrawCoords = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        spnVerbosity = new javax.swing.JSpinner();

        setTitle("SumaTres - Opciones avanzadas");
        setResizable(false);

        btgModos.add(btnClásico);
        btnClásico.setText("Modo clásico");
        btnClásico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClásicoActionPerformed(evt);
            }
        });

        btgModos.add(btnExperimental);
        btnExperimental.setText("Modo experimental");
        btnExperimental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExperimentalActionPerformed(evt);
            }
        });

        chkDiagonalMovement.setText("Movimiento en diagonal");
        chkDiagonalMovement.setToolTipText("Si está activado, se podrán mover las piezas en diagonal además de en los cuatro sentidos clásicos.");
        chkDiagonalMovement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDiagonalMovementActionPerformed(evt);
            }
        });

        chkConsoleOutput.setText("Salida por consola");
        chkConsoleOutput.setToolTipText("Decide si también se muestra el resultado del turno por consola. Se puede cambiar durante la partida.");
        chkConsoleOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConsoleOutputActionPerformed(evt);
            }
        });

        chkHUD.setText("HUD activado");
        chkHUD.setToolTipText("Decide si se muestra el HUD durante la partida.");
        chkHUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHUDActionPerformed(evt);
            }
        });

        chkCheatsAvailable.setText("Posibilidad de activar trucos");
        chkCheatsAvailable.setToolTipText("Si está activado, se podrán activar los trucos durante la partida.");
        chkCheatsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCheatsAvailableActionPerformed(evt);
            }
        });

        chkMoreNextValues.setText("Variar siguientes fichas");
        chkMoreNextValues.setToolTipText("Si está activado, el valor de la ficha \"siguiente\" dependerá del valor de la ficha más alta.");
        chkMoreNextValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMoreNextValuesActionPerformed(evt);
            }
        });

        chkBalancedStart.setText("Inicio de partida equilibrado");
        chkBalancedStart.setToolTipText("Si está activado, la cantidad de fichas al inicio de la partida dependerá del tamaño del tablero.");
        chkBalancedStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBalancedStartActionPerformed(evt);
            }
        });

        chkExitOnEnd.setText("Salir al terminar");
        chkExitOnEnd.setToolTipText("Si está activado, el programa se cierra cuando la partida se termina.");
        chkExitOnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkExitOnEndActionPerformed(evt);
            }
        });

        chkPaintArrows.setText("Dibujar flechas");
        chkPaintArrows.setToolTipText("Si está activado, se pintan las flechas que indican el movimiento de las fichas.");
        chkPaintArrows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPaintArrowsActionPerformed(evt);
            }
        });

        chkEnhancedDiffMult.setText("Mult. de dificultad mejorado");
        chkEnhancedDiffMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEnhancedDiffMultActionPerformed(evt);
            }
        });

        chkSaveResults.setText("Guardar resultados");
        chkSaveResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSaveResultsActionPerformed(evt);
            }
        });

        chkDrawZones.setText("Dibujar zonas");
        chkDrawZones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDrawZonesActionPerformed(evt);
            }
        });

        chkDrawGrid.setText("Dibujar grid");
        chkDrawGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDrawGridActionPerformed(evt);
            }
        });

        jLabel1.setText("Opciones generales");

        jLabel2.setText("Interfaz");

        chkDrawCoords.setText("Dibujar coordenadas");
        chkDrawCoords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDrawCoordsActionPerformed(evt);
            }
        });

        jLabel3.setText("Mejoras experimentales");

        jLabel4.setText("Verbosity level:");

        spnVerbosity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2, 1));
        spnVerbosity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnVerbosityStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnClásico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExperimental)
                .addGap(54, 54, 54))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkDrawGrid)
                                .addComponent(jLabel2)
                                .addComponent(chkHUD))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(chkPaintArrows)
                                    .addGap(86, 86, 86)
                                    .addComponent(chkDrawZones))
                                .addComponent(chkDrawCoords)))
                        .addComponent(jSeparator6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkEnhancedDiffMult)
                                .addComponent(chkCheatsAvailable)
                                .addComponent(chkDiagonalMovement))
                            .addGap(94, 94, 94)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkMoreNextValues)
                                .addComponent(chkBalancedStart)))
                        .addComponent(jSeparator4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(chkConsoleOutput)
                            .addGap(46, 46, 46)
                            .addComponent(chkExitOnEnd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkSaveResults))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnVerbosity, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClásico)
                    .addComponent(btnExperimental))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkConsoleOutput)
                    .addComponent(chkExitOnEnd)
                    .addComponent(chkSaveResults))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkHUD)
                    .addComponent(chkPaintArrows)
                    .addComponent(chkDrawZones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDrawGrid)
                    .addComponent(chkDrawCoords))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDiagonalMovement)
                    .addComponent(chkMoreNextValues))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCheatsAvailable)
                    .addComponent(chkBalancedStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkEnhancedDiffMult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spnVerbosity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClásicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClásicoActionPerformed
        ventanaSecundaria.setClassic();
        readValues();
    }//GEN-LAST:event_btnClásicoActionPerformed

    private void btnExperimentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExperimentalActionPerformed
        ventanaSecundaria.setExperimental();
        readValues();
    }//GEN-LAST:event_btnExperimentalActionPerformed

    private void chkConsoleOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConsoleOutputActionPerformed
        ventanaSecundaria.getSettings().toggleConsole();
    }//GEN-LAST:event_chkConsoleOutputActionPerformed

    private void chkHUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHUDActionPerformed
        ventanaSecundaria.getSettings().toggleHud();
    }//GEN-LAST:event_chkHUDActionPerformed

    private void chkExitOnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkExitOnEndActionPerformed
        ventanaSecundaria.getSettings().toggleExitOnEnd();
    }//GEN-LAST:event_chkExitOnEndActionPerformed

    private void chkPaintArrowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPaintArrowsActionPerformed
        ventanaSecundaria.getSettings().togglePaintArrows();
    }//GEN-LAST:event_chkPaintArrowsActionPerformed

    private void chkSaveResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSaveResultsActionPerformed
        ventanaSecundaria.getSettings().toggleSaveResultsToFile();
    }//GEN-LAST:event_chkSaveResultsActionPerformed

    private void chkDrawZonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDrawZonesActionPerformed
        ventanaSecundaria.getSettings().toggleDrawZones();
    }//GEN-LAST:event_chkDrawZonesActionPerformed

    private void chkDrawGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDrawGridActionPerformed
        ventanaSecundaria.getSettings().toggleDrawGrid();
    }//GEN-LAST:event_chkDrawGridActionPerformed

    private void chkDrawCoordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDrawCoordsActionPerformed
        ventanaSecundaria.getSettings().toggleDrawCoords();
    }//GEN-LAST:event_chkDrawCoordsActionPerformed

    private void chkBalancedStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBalancedStartActionPerformed
        ventanaSecundaria.getSettings().toggleBalancedStart();
    }//GEN-LAST:event_chkBalancedStartActionPerformed

    private void chkMoreNextValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMoreNextValuesActionPerformed
        ventanaSecundaria.getSettings().toggleMoreNextValues();
    }//GEN-LAST:event_chkMoreNextValuesActionPerformed

    private void chkCheatsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCheatsAvailableActionPerformed
        ventanaSecundaria.getSettings().togglePossibleCheats();
    }//GEN-LAST:event_chkCheatsAvailableActionPerformed

    private void chkDiagonalMovementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDiagonalMovementActionPerformed
        ventanaSecundaria.getSettings().toggleDiagonalMovement();
    }//GEN-LAST:event_chkDiagonalMovementActionPerformed

    private void chkEnhancedDiffMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEnhancedDiffMultActionPerformed
        ventanaSecundaria.getSettings().toggleEnhancedDiffMult();
    }//GEN-LAST:event_chkEnhancedDiffMultActionPerformed

    private void spnVerbosityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnVerbosityStateChanged
        ventanaSecundaria.getSettings().setVerbosityLevel((int) spnVerbosity.getValue());
    }//GEN-LAST:event_spnVerbosityStateChanged
 
    public void readValues() {
        Settings op = ventanaSecundaria.getSettings();
        
        btnExperimental.setSelected(op.isExperimental());
        btnClásico.setSelected(!op.isExperimental());
        
        chkDiagonalMovement.setEnabled(op.isExperimental());
        chkHUD.setEnabled(op.isExperimental());
        chkCheatsAvailable.setEnabled(op.isExperimental());
        chkMoreNextValues.setEnabled(op.isExperimental());
        chkBalancedStart.setEnabled(op.isExperimental());
        chkPaintArrows.setEnabled(op.isExperimental());
        chkEnhancedDiffMult.setEnabled(op.isExperimental());
        chkDrawGrid.setEnabled(op.isExperimental());
        chkDrawZones.setEnabled(op.isExperimental());
        chkDrawCoords.setEnabled(op.isExperimental());
        //spnVerbosity.setEnabled(op.isExperimental()); // debería estar desactivado en modo clásico?
        
        chkDiagonalMovement.setSelected(op.isDiagonalMovementEnabled());
        chkHUD.setSelected(op.isHudEnabled());
        chkCheatsAvailable.setSelected(op.isPossibleCheats());
        chkBalancedStart.setSelected(op.isBalancedStartEnabled());
        chkMoreNextValues.setSelected(op.isMoreNextValuesEnabled());
        chkConsoleOutput.setSelected(op.isConsoleEnabled());
        chkExitOnEnd.setSelected(op.isExitOnEndEnabled());
        chkPaintArrows.setSelected(op.isPaintArrowsEnabled());
        chkEnhancedDiffMult.setSelected(op.isEnhancedDiffMultEnabled());
        chkSaveResults.setSelected(op.isSaveResultsToFileEnabled());
        chkDrawGrid.setSelected(op.isDrawGridEnabled());
        chkDrawZones.setSelected(op.isDrawZonesEnabled());
        chkDrawCoords.setSelected(op.isDrawCoordsEnabled());
        spnVerbosity.setValue(op.verbosity());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avanzadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Avanzadas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgModos;
    private javax.swing.JRadioButton btnClásico;
    private javax.swing.JRadioButton btnExperimental;
    private javax.swing.JCheckBox chkBalancedStart;
    private javax.swing.JCheckBox chkCheatsAvailable;
    private javax.swing.JCheckBox chkConsoleOutput;
    private javax.swing.JCheckBox chkDiagonalMovement;
    private javax.swing.JCheckBox chkDrawCoords;
    private javax.swing.JCheckBox chkDrawGrid;
    private javax.swing.JCheckBox chkDrawZones;
    private javax.swing.JCheckBox chkEnhancedDiffMult;
    private javax.swing.JCheckBox chkExitOnEnd;
    private javax.swing.JCheckBox chkHUD;
    private javax.swing.JCheckBox chkMoreNextValues;
    private javax.swing.JCheckBox chkPaintArrows;
    private javax.swing.JCheckBox chkSaveResults;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner spnVerbosity;
    // End of variables declaration//GEN-END:variables
}
