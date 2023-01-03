package calculadora_menu;

import javax.swing.JOptionPane;

/**
 *
 * @author alanny
 */
public class Calculadora extends javax.swing.JFrame {

    //variables para operaciones trabajarlo 
    String primero;
    String operacion;
    String segundo;

    public Calculadora() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnBorrar = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btbborrar1 = new javax.swing.JButton();
        txtpantalla = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menu1salir = new javax.swing.JMenuItem();
        menOpcion = new javax.swing.JMenu();
        menOpcLimpiar = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        Ayuda1 = new javax.swing.JMenuItem();
        version = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalculadoraLaboratorio");
        setBackground(new java.awt.Color(153, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnBorrar.setBackground(java.awt.Color.cyan);
        btnBorrar.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 0, 0));
        btnBorrar.setText("CE");
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnMulti.setBackground(java.awt.Color.cyan);
        btnMulti.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMulti.setText("*");
        btnMulti.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnRest.setBackground(java.awt.Color.cyan);
        btnRest.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRest.setText("-");
        btnRest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });

        btnDivide.setBackground(java.awt.Color.cyan);
        btnDivide.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDivide.setText("/");
        btnDivide.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnNum8.setBackground(java.awt.Color.cyan);
        btnNum8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum8.setText("8");
        btnNum8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum7.setBackground(java.awt.Color.cyan);
        btnNum7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum7.setText("7");
        btnNum7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnSuma.setBackground(java.awt.Color.cyan);
        btnSuma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSuma.setText("+");
        btnSuma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnNum0.setBackground(java.awt.Color.cyan);
        btnNum0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum0.setText("0");
        btnNum0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnNum3.setBackground(java.awt.Color.cyan);
        btnNum3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum3.setText("3");
        btnNum3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnNum5.setBackground(java.awt.Color.cyan);
        btnNum5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum5.setText("5");
        btnNum5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum4.setBackground(java.awt.Color.cyan);
        btnNum4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum4.setText("4");
        btnNum4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum9.setBackground(java.awt.Color.cyan);
        btnNum9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum9.setText("9");
        btnNum9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnNum6.setBackground(java.awt.Color.cyan);
        btnNum6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum6.setText("6");
        btnNum6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnNum1.setBackground(java.awt.Color.cyan);
        btnNum1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum1.setText("1");
        btnNum1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum2.setBackground(java.awt.Color.cyan);
        btnNum2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNum2.setText("2");
        btnNum2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnIgual.setBackground(java.awt.Color.cyan);
        btnIgual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnDecimal.setBackground(java.awt.Color.cyan);
        btnDecimal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDecimal.setText(".");
        btnDecimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btbborrar1.setBackground(java.awt.Color.cyan);
        btbborrar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btbborrar1.setText("C");
        btbborrar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btbborrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbborrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btbborrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNum3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbborrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        txtpantalla.setEditable(false);
        txtpantalla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtpantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-hello-kitty-64.png"))); // NOI18N

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menu1.setText("Calculadora");

        menu1salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK));
        menu1salir.setText("Salir             ");
        menu1salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1salirActionPerformed(evt);
            }
        });
        menu1.add(menu1salir);

        jMenuBar1.add(menu1);

        menOpcion.setText("Opciones");
        menOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcionActionPerformed(evt);
            }
        });

        menOpcLimpiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        menOpcLimpiar.setText("Limpiar todo       ");
        menOpcion.add(menOpcLimpiar);

        jMenuBar1.add(menOpcion);

        Ayuda.setText("Ayuda");

        Ayuda1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        Ayuda1.setText("Acerca de");
        Ayuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ayuda1ActionPerformed(evt);
            }
        });
        Ayuda.add(Ayuda1);

        version.setText("versión");
        version.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versionActionPerformed(evt);
            }
        });

        jMenu2.setText("Version 0.0.000001.2021");
        version.add(jMenu2);

        Ayuda.add(version);

        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpantalla)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //cadena para saber si un numero existe
    public static boolean existe(String cadena) {
        boolean resultado;
        resultado = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(",")) {
                resultado = true;
                break;

            }

        }
        return resultado;
    }

    private void menu1salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1salirActionPerformed
        //esto es el evento al hacer click del menu
        System.exit(0);//salir ,es todo =)
    }//GEN-LAST:event_menu1salirActionPerformed

    private void menOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcionActionPerformed
        txtpantalla.setText("");
    }//GEN-LAST:event_menOpcionActionPerformed

    private void Ayuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ayuda1ActionPerformed
        //esto será un cuadro 

        String titulo = "Calculadora\n";
        String creadores = "\nCreada por  ";
        String Apps = "Alanny Chaverri";
        JOptionPane.showMessageDialog(rootPane, titulo + "\n" + creadores + "\n" + Apps);
    }//GEN-LAST:event_Ayuda1ActionPerformed

    private void versionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versionActionPerformed
        JOptionPane.showMessageDialog(rootPane, " Version 0.0.0.1.2021 ");
    }//GEN-LAST:event_versionActionPerformed

    
    //metodo para sacar el resultado de una operacion
    public static String calculadora(String primero, String segundo, String operacion) {
        Double resultado = 0.0;
        String respuesta;

        if (operacion.equals("-")) {
            resultado = Double.parseDouble(primero) - Double.parseDouble(segundo);
        }
        if (operacion.equals("+")) {
            resultado = Double.parseDouble(primero) + Double.parseDouble(segundo);
        }
        if (operacion.equals("/")) {
            resultado = Double.parseDouble(primero) / Double.parseDouble(segundo);
        }
        if (operacion.equals("*")) {
            resultado = Double.parseDouble(primero) * Double.parseDouble(segundo);
        }

        respuesta = resultado.toString();
        return respuesta;
    }

    //Aqui van los botones de la calculadora
    
    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // resultados
        String resultado;
        segundo = txtpantalla.getText();
        if (!segundo.equals("")) {
            resultado = calculadora(primero, segundo, operacion);
            txtpantalla.setText(resultado);
        }

    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed

        txtpantalla.setText(txtpantalla.getText() + "2");
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        // escribir numero1
        txtpantalla.setText(txtpantalla.getText() + "1");
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed

        txtpantalla.setText(txtpantalla.getText() + "6");
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed

        txtpantalla.setText(txtpantalla.getText() + "9");
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed

        txtpantalla.setText(txtpantalla.getText() + "4");
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        // numero3
        txtpantalla.setText(txtpantalla.getText() + "3");
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        // Sumaaaar
        if (!txtpantalla.getText().equals("")) {
            primero = txtpantalla.getText();
            operacion = "+";
            txtpantalla.setText("");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed

        txtpantalla.setText(txtpantalla.getText() + "7");
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed

        txtpantalla.setText(txtpantalla.getText() + "8");
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        //boton de dividir

        if (!txtpantalla.getText().equals("")) {
            primero = txtpantalla.getText();
            operacion = "/";
            txtpantalla.setText("");
        }
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestActionPerformed
        // restaaa

        if (!txtpantalla.getText().equals("")) {
            primero = txtpantalla.getText();
            operacion = "-";
            txtpantalla.setText("");
        }

    }//GEN-LAST:event_btnRestActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed

        if (!txtpantalla.getText().equals("")) {
            primero = txtpantalla.getText();
            operacion = "*";
            txtpantalla.setText("");
        }
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btbborrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbborrar1ActionPerformed
        // TODO add your handling code here:
        String cadena;
        cadena = txtpantalla.getText();//455
        if (cadena.length() > 0) {//455
            cadena = cadena.substring(0, cadena.length() - 1);//455-1 / 45
            txtpantalla.setText(cadena);//45

        }
    }//GEN-LAST:event_btbborrar1ActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText() + "0");
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        // TODO add your handling code here:
        String cadena;//5
        cadena = txtpantalla.getText();//5
        if (cadena.length() <= 0) {//vacio 
            txtpantalla.setText("0.");//0.
        } else {
            if (!existe(txtpantalla.getText())) {
                txtpantalla.setText(txtpantalla.getText() + ".");//5.
            }
        }
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        // TODO add your handling code here:

        txtpantalla.setText(txtpantalla.getText() + "5");
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem Ayuda1;
    private javax.swing.JButton btbborrar1;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menOpcLimpiar;
    private javax.swing.JMenu menOpcion;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenuItem menu1salir;
    private javax.swing.JTextField txtpantalla;
    private javax.swing.JMenu version;
    // End of variables declaration//GEN-END:variables
}
