/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.pkg2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author daniela
 */
/**
 * La clase CrearDoc proporciona una interfaz gráfica para crear documentos asociados a usuarios
 * y actualizar una lista de documentos junto con la información del usuario respectivo.
 */
public class CrearDoc extends javax.swing.JFrame {
    
     private Lista<Usuario> listaUsuarios;
     private JTextArea textA;
     private Lista<Documento> ldoc;

    /**
     * Constructor de la clase CrearDoc.
     *
     * @param listaUsuario Lista enlazada de Usuarios
     * @param texta JTextArea para mostrar información de usuarios y documentos
     * @param ldoc Lista enlazada de Documentos
     */
    /**
     * Creates new form CrearDoc
     */
    public CrearDoc(Lista<Usuario> listaUsuario, JTextArea texta, Lista<Documento> ldoc) {
        initComponents();
        this.listaUsuarios = listaUsuario;
        this.textA = texta;
        this.ldoc = ldoc;
        
        this.setResizable(false);
        this.setTitle("CREAR DOCUMENTOS");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombreDoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tamaño = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        docTipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("Ingrese el nombre del documento:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(nombreDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 112, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Ingrese el tamaño del documento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        getContentPane().add(tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 112, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Ingrese el tipo de documento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 28));
        getContentPane().add(docTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 112, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Ingrese el nombre de su usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 112, -1));

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg2/Imagenes/5773495.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg2/Imagenes/doc2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg2/Imagenes/fondoazul.jpeg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Acción realizada al ingresar el nombre del usuario.
     *
     * @param evt Evento de acción (ingresar texto)
     */
    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed
    /**
     * Acción para crear y agregar un documento con la información proporcionada.
     *
     * @param evt Evento de acción (clic en el botón Aceptar)
     */
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        if(nombreUsuario.getText().isEmpty() || nombreDoc.getText().isEmpty() || tamaño.getText().isEmpty() || docTipo.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }else {
        try {
            int tamano = Integer.parseInt(tamaño.getText());
            if(listaUsuarios.buscarUsuario(nombreUsuario.getText())){
                 Documento doc = new Documento(nombreUsuario.getText(), nombreDoc.getText(), Integer.parseInt(tamaño.getText()), docTipo.getText());                  
                 ldoc.InsertarFinal(doc);

                Nodo aux = listaUsuarios.getpFirst();
                while(aux!= null){
                    Usuario usAux = (Usuario) aux.getDato();
                    if(usAux.getNombre().equalsIgnoreCase(nombreUsuario.getText())){
                        ldoc.HT(usAux);
                        break;
                    }   
                    aux = aux.getpNext();
                }
                

                 textA.setText(listaUsuarios.TextAreaUD(ldoc));
                 JOptionPane.showMessageDialog(this, "Documento agregado con éxito!");
                 
            }else{
                JOptionPane.showMessageDialog(this, "El usuario ingresado no existe");
            }             
                     
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "El tamaño debe ser un número");
        }
    }
            
    }//GEN-LAST:event_aceptarActionPerformed
    /**
     * Acción para volver atrás.
     *
     * @param evt Evento de acción (clic en el botón Volver)
     */
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(CrearDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CrearDoc().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField docTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombreDoc;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTextField tamaño;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}