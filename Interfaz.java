
 


import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rishell
 */
public class Interfaz extends javax.swing.JFrame {

    private Club club;
    Socio socio;
    DefaultListModel modeloSocios;
    DefaultListModel modeloFacturas = new DefaultListModel();
    DefaultListModel modeloAutorizados = new DefaultListModel();
    int sociosR = 0;
    int sociosV = 0;

    public Interfaz() {
        initComponents();
        modeloSocios = new DefaultListModel();
        ListaSocios.setModel(modeloSocios);

        ListaFactura.setModel(modeloFacturas);
        ListaAutorizados.setModel(modeloAutorizados);

        club = new Club();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaSocios = new javax.swing.JList<>();
        AfiliarSocio = new javax.swing.JButton();
        sociosLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RegistrarConsumo = new javax.swing.JButton();
        AumentarFondos = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFondos = new javax.swing.JTextField();
        txtSuss = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PagarFactura = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaFactura = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        AgregarAutorizado = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaAutorizados = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Club Social"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Socios"));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 400));

        ListaSocios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaSociosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaSocios);

        AfiliarSocio.setText("AfiliarSocio");
        AfiliarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfiliarSocioActionPerformed(evt);
            }
        });



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(AfiliarSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sociosLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AfiliarSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(sociosLabel))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos socio"));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));

        jLabel3.setText("Cedula");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Fondos Disponibles:");

        jLabel6.setText("Tipo suscripción:");

        RegistrarConsumo.setText("Registrar Consumo");
        RegistrarConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarConsumoActionPerformed(evt);
            }
        });

        AumentarFondos.setText("Aumentar Fondos");
        AumentarFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AumentarFondosActionPerformed(evt);
            }
        });

        txtCedula.setEditable(false);
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCedula.setText("CEDULA");

        txtNombre.setEditable(false);
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("NOMBRE");

        txtFondos.setEditable(false);
        txtFondos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFondos.setText("FONDOS");

        txtSuss.setEditable(false);
        txtSuss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSuss.setText("TIPO DE SUSCRIPCION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AumentarFondos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegistrarConsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtCedula)
                    .addComponent(txtNombre)
                    .addComponent(txtFondos)
                    .addComponent(txtSuss))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFondos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSuss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(RegistrarConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AumentarFondos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 400));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Facturas"));
        jPanel5.setPreferredSize(new java.awt.Dimension(280, 180));

        PagarFactura.setText("Pagar Factura");
        PagarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarFacturaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(ListaFactura);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(PagarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PagarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Autorizados"));
        jPanel6.setPreferredSize(new java.awt.Dimension(280, 180));

        AgregarAutorizado.setText("Agregar autorizado");
        AgregarAutorizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAutorizadoActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(ListaAutorizados);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(AgregarAutorizado, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgregarAutorizado))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        ///Aqui cambias el tipo de letra y el tamaño
        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        //
        //
        //
        //Aqui cambias el texto de tu interfaz
        jLabel1.setText("Rishell - Aqui puedes poner tu texto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AfiliarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfiliarSocioActionPerformed
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cedula del nuevo Socio"));
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del socio");
        Socio.Tipo[] tipos = {Socio.Tipo.REGULAR, Socio.Tipo.VIP};
        Socio.Tipo select = (Socio.Tipo) JOptionPane.showInputDialog(null, "Selecciona el tipo de suscripcion", "tipo de suscripcion", JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[1]);

        if (String.valueOf(cedula) != null && nombre != null  ) {

            try {

                socio = new Socio(String.valueOf(cedula), nombre, select);
                club.afiliarSocios(socio);

                JOptionPane.showMessageDialog(null, "           Se Agrego       \n" + socio.getCedula() + "\n" + socio.getNombre() + "\n" + socio.getTipoSubscripcion());
                String datos = cedula + " - " + nombre.toUpperCase();
                modeloSocios.addElement(datos);

            } catch (Exception e) {
                String err = e.getMessage();
                JOptionPane.showMessageDialog(this, err);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al capturar datos");
        }
    }//GEN-LAST:event_AfiliarSocioActionPerformed


    private void PagarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarFacturaActionPerformed
        int pos = ListaFactura.getSelectedIndex();

        try {
            if (pos == -1) {
                JOptionPane.showMessageDialog(null, "Selecciona bien la factura");
            } else {
                modeloFacturas.removeElementAt(pos);
                club.PagarFactura(txtCedula.getText(), pos);
                Socio socioF = club.BuscarSocio(txtCedula.getText());
                txtFondos.setText(String.valueOf(socioF.getFondos()));
                ListaFactura.setModel(modeloFacturas);

            }
        } catch (Exception ex) {

            String err = ex.getMessage();
            JOptionPane.showMessageDialog(this, err);
        }

    }//GEN-LAST:event_PagarFacturaActionPerformed

    private void AgregarAutorizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAutorizadoActionPerformed

        if (txtCedula.getText() != null) {
            Socio socioa = club.BuscarSocio(txtCedula.getText());

            String nombreAutorizado = JOptionPane.showInputDialog("Ingresa el nombre del cliente autorizado");
            if (nombreAutorizado != null) {
                try {
                    club.AgregarAutorizadoSocio(socioa, nombreAutorizado);
                    modeloAutorizados.addElement(nombreAutorizado);
                } catch (Exception e) {
                    String err = e.getMessage();
                    JOptionPane.showMessageDialog(this, err);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa correctamente los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona a un socio primero");
        }
    }//GEN-LAST:event_AgregarAutorizadoActionPerformed

    private void RegistrarConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarConsumoActionPerformed

        if (txtCedula.getText() != null) {

            try {

                Socio socioCon = club.BuscarSocio(txtCedula.getText());
                Object[] autorizados = socioCon.getAutorizados().toArray();
                Object nombreAutorizado = JOptionPane.showInputDialog(null, "Selecciona al cliente autorizado", "Cliente Autorizado", JOptionPane.INFORMATION_MESSAGE, null, autorizados, autorizados[0]);

                String concepto = JOptionPane.showInputDialog("Ingres el concepto del consumo");
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del consumo"));
                try {
                    if (valor > socioCon.getFondos()) {
                        JOptionPane.showMessageDialog(null, "Fondos Insuficientes");
                    } else {
                        club.RegistrarConsumo(txtCedula.getText(), String.valueOf(nombreAutorizado), concepto, valor);
                        String consumo = concepto + "  $" + valor + "  " + String.valueOf(nombreAutorizado);
                        modeloFacturas.addElement(consumo);
                        JOptionPane.showMessageDialog(null, "Consumo Registrado");
                    }

                } catch (Exception e) {
                    String err = e.getMessage();
                    JOptionPane.showMessageDialog(this, "Error al registrar consumo");
                }
            } catch (Exception ex) {
                String err = ex.getMessage();
                JOptionPane.showMessageDialog(this, "No existe el socio");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona a un socio primero");
        }

    }//GEN-LAST:event_RegistrarConsumoActionPerformed

    private void ListaSociosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaSociosValueChanged
        modeloAutorizados.clear();
        modeloFacturas.clear();
        String selected = ListaSocios.getSelectedValue();

        String[] words = selected.split(" - ");
        Socio socioD = club.BuscarSocio(words[0]);

        txtCedula.setText(socioD.getCedula());
        txtNombre.setText(socioD.getNombre());
        txtFondos.setText(String.valueOf(socioD.getFondos()));
        txtSuss.setText(String.valueOf(socioD.getTipoSubscripcion()));

        if (txtCedula.getText() != null) {

            try {
                ArrayList Auth = club.ObtenerAutorizadosSocio(socioD.getCedula());
                if (!Auth.isEmpty()) {

                    for (int j = 0; j < Auth.size(); j++) {

                        modeloAutorizados.addElement(Auth.get(j));
                    }
                    ListaAutorizados.setModel(modeloAutorizados);
                }

            } catch (Exception ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ArrayList facturas = club.ObtenerFacturasSocio(socioD.getCedula());
                if (!facturas.isEmpty()) {

                    for (int x = 0; x < facturas.size(); x++) {
                        modeloFacturas.addElement(facturas.get(x));
                    }
                    ListaFactura.setModel(modeloFacturas);
                }

            } catch (Exception ex) {
                String err = ex.getMessage();
                JOptionPane.showMessageDialog(this, err);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona o ingresa a un socio");
        }


    }//GEN-LAST:event_ListaSociosValueChanged

    private void AumentarFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AumentarFondosActionPerformed
        double fondos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los fondos a agregar"));
        if (txtCedula.getText() != null) {
            try {
                club.AumentarFondos(txtCedula.getText(), fondos);
                Socio socioF = club.BuscarSocio(txtCedula.getText());
                txtFondos.setText(String.valueOf(socioF.getFondos()));
            } catch (Exception ex) {
                String err = ex.getMessage();
                JOptionPane.showMessageDialog(this, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione o agrege un socio");
        }
    }//GEN-LAST:event_AumentarFondosActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AfiliarSocio;
    private javax.swing.JButton AgregarAutorizado;
    private javax.swing.JButton AumentarFondos;
    private javax.swing.JList<String> ListaAutorizados;
    private javax.swing.JList<String> ListaFactura;
    private javax.swing.JList<String> ListaSocios;
    private javax.swing.JButton PagarFactura;
    private javax.swing.JButton RegistrarConsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel sociosLabel;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFondos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSuss;
    // End of variables declaration//GEN-END:variables
}
