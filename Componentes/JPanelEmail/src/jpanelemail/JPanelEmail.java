package jpanelemail;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.border.Border;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author David
 */
public class JPanelEmail extends javax.swing.JPanel implements Serializable {

    private String nombreJlabelEmail;
    private String hint;
    private String emailNoValido;

    private Color nombreJlabelEmailColor;
    private Color hintColor;
    private Color emailNoValidoColor;
    private Color textoEmailColor;

    private Font nombreJlabelEmailFont;
    private Font hintFont;
    private Font emailNoValidoFont;
    private Font textoEmailFont;

    private Border borderColorEmailValido;
    private Border borderColorEmailNoValido;

    public JPanelEmail() {
        initComponents();
        this.jLabelValidate.setVisible(false);

        this.nombreJlabelEmail = "Correo electrónico:";
        this.hint = "  usuario@dominio.com";
        this.emailNoValido = "El email no es válido";

        this.nombreJlabelEmailColor = this.jLabelNombre.getForeground();
        this.hintColor = this.jLabelHint.getForeground();
        this.emailNoValidoColor = this.jLabelValidate.getForeground();
        this.textoEmailColor = this.jTextFieldEmail.getForeground();

        this.nombreJlabelEmailFont = this.jLabelNombre.getFont();
        this.hintFont = this.jLabelHint.getFont();
        this.emailNoValidoFont = this.jLabelValidate.getFont();
        this.textoEmailFont = this.jTextFieldEmail.getFont();

        this.borderColorEmailValido = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0));
        this.borderColorEmailNoValido = javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0));
    }

    // Propiedades para cambiar el texto
    public String getNombreJlabelEmail() {
        return nombreJlabelEmail;
    }

    public void setNombreJlabelEmail(String nombreJlabelEmail) {
        this.nombreJlabelEmail = nombreJlabelEmail;
        this.jLabelNombre.setText(this.nombreJlabelEmail);
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
        this.jLabelHint.setText(this.hint);
    }

    public String getEmailNoValido() {
        return emailNoValido;
    }

    public void setEmailNoValido(String emailNoValido) {
        this.emailNoValido = emailNoValido;
        this.jLabelValidate.setText(this.emailNoValido);
    }

    // Propiedades para cambiar el color del texto
    public Color getNombreJlabelEmailColor() {
        return nombreJlabelEmailColor;
    }

    public void setNombreJlabelEmailColor(Color nombreJlabelEmailColor) {
        this.nombreJlabelEmailColor = nombreJlabelEmailColor;
        this.jLabelNombre.setForeground(this.nombreJlabelEmailColor);
    }

    public Color getHintColor() {
        return hintColor;
    }

    public void setHintColor(Color hintColor) {
        this.hintColor = hintColor;
        this.jLabelHint.setForeground(this.hintColor);
    }

    public Color getEmailNoValidoColor() {
        return emailNoValidoColor;
    }

    public void setEmailNoValidoColor(Color emailNoValidoColor) {
        this.emailNoValidoColor = emailNoValidoColor;
        this.jLabelValidate.setForeground(this.emailNoValidoColor);
    }

    public Color getTextoEmailColor() {
        return textoEmailColor;
    }

    public void setTextoEmailColor(Color textoEmailColor) {
        this.textoEmailColor = textoEmailColor;
        this.jTextFieldEmail.setForeground(this.textoEmailColor);
    }

    // Propiedades para cambiar la fuente y el tamaño de fuente
    public Font getNombreJlabelEmailFont() {
        return nombreJlabelEmailFont;
    }

    public void setNombreJlabelEmailFont(Font nombreJlabelEmailFont) {
        this.nombreJlabelEmailFont = nombreJlabelEmailFont;
        this.jLabelNombre.setFont(this.nombreJlabelEmailFont);
    }

    public Font getHintFont() {
        return hintFont;
    }

    public void setHintFont(Font hintFont) {
        this.hintFont = hintFont;
        this.jLabelHint.setFont(this.hintFont);
    }

    public Font getEmailNoValidoFont() {
        return emailNoValidoFont;
    }

    public void setEmailNoValidoFont(Font emailNoValidoFont) {
        this.emailNoValidoFont = emailNoValidoFont;
        this.jLabelValidate.setFont(this.emailNoValidoFont);
    }

    public Font getTextoEmailFont() {
        return textoEmailFont;
    }

    public void setTextoEmailFont(Font textoEmailFont) {
        this.textoEmailFont = textoEmailFont;
        this.jTextFieldEmail.setFont(this.textoEmailFont);
    }

    // Propiedades para cambiar el color del borde del mail
    public Border getBorderColorEmailValido() {
        return borderColorEmailValido;
    }

    public void setBorderColorEmailValido(Border borderColorEmailValido) {
        this.borderColorEmailValido = borderColorEmailValido;
    }

    public Border getBorderColorEmailNoValido() {
        return borderColorEmailNoValido;
    }

    public void setBorderColorEmailNoValido(Border borderColorEmailNoValido) {
        this.borderColorEmailNoValido = borderColorEmailNoValido;
    }

    // Validar email
    private boolean validateEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
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
        jLabelNombre = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabelValidate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelHint = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();

        jLabel1.setText("Nombre:");

        jLabelNombre.setText("Correo electrónico:");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));

        jLabelValidate.setForeground(new java.awt.Color(255, 51, 51));
        jLabelValidate.setText("El email no es válido");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHint.setForeground(new java.awt.Color(153, 153, 153));
        jLabelHint.setText("  usuario@dominio.com");
        jPanel1.add(jLabelHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(187, 187, 187)));
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyReleased
        if (validateEmail(this.jTextFieldEmail.getText())) {
            cambiaColorEmail(false, this.borderColorEmailValido);
        } else {
            cambiaColorEmail(true, this.borderColorEmailNoValido);
        }
    }//GEN-LAST:event_jTextFieldEmailKeyReleased

    private void cambiaColorEmail(Boolean mensajeVisible, Border emailBorder) {
        this.jLabelValidate.setVisible(mensajeVisible);
        this.jTextFieldEmail.setBorder(emailBorder);
    }


    private void jTextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusGained
        this.jLabelHint.setText("");
    }//GEN-LAST:event_jTextFieldEmailFocusGained

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
        if (this.jTextFieldEmail.getText().equals("")) {
            this.jLabelHint.setText(this.hint);
        }
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelHint;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelValidate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables

}
