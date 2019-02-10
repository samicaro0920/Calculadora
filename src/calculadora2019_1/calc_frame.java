package calculadora2019_1;

/**
 *
 * @author Sandra Cañas
 */
/**
 * Frame con las funcionalidades de la calculadora Muestra dos campos de texto
 * para ingresar numeros enteros Siete botones con las funcionalidades descritas
 * en los métodos de la clase Calculadora2019_1.java y un campo de texto que
 * muestra el resultado
 */
public class calc_frame extends javax.swing.JFrame {

    public calc_frame() {

        initComponents();

    }
    Calculadora2019_1 calc = new Calculadora2019_1();
    int num1, num2, result;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jDialog4 = new javax.swing.JDialog();
        numero_1 = new javax.swing.JTextField();
        numero_2 = new javax.swing.JTextField();
        sumar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        potencia = new javax.swing.JButton();
        sub_ans = new javax.swing.JButton();
        add_ans = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sub = new javax.swing.JTextField();
        add = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("Calc_sami"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numero_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numero_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_1ActionPerformed(evt);
            }
        });
        getContentPane().add(numero_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 73, -1));

        numero_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(numero_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 73, -1));

        sumar.setText("Sumar");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });
        getContentPane().add(sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 79, -1));

        jLabel1.setText("Ingresar primer número");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel2.setText("Ingresar segundo numero");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        potencia.setText("Potencia");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });
        getContentPane().add(potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 100, -1));

        sub_ans.setText("Sustraer al ans");
        sub_ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_ansActionPerformed(evt);
            }
        });
        getContentPane().add(sub_ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        add_ans.setText("Adicionar al ans");
        add_ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ansActionPerformed(evt);
            }
        });
        getContentPane().add(add_ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        dividir.setText("Dividir");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        getContentPane().add(dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 79, -1));

        restar.setText("Restar");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });
        getContentPane().add(restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 79, -1));

        multiplicar.setText("Multiplicar");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 100, -1));

        resultado.setEditable(false);
        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultado.setBorder(null);
        resultado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        resultado.setEnabled(false);
        resultado.setMargin(new java.awt.Insets(0, 0, 0, 0));
        resultado.setOpaque(false);
        resultado.setSelectionColor(new java.awt.Color(255, 255, 255));
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 334, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Calculadora");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RESULTADO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 125, -1));
        getContentPane().add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 60, -1));
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_numero_1ActionPerformed

    /**
     * Despues de hacer click en boton sumar se obtienen los datos ingresados
     * por el usuario y luego llamar a la funcion sumar de la clase
     * Calculadora2019_1 y por ultimo mostrar el resultado de la suma en el
     * frame
     *
     * @param evt
     */
    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed

        num1 = Integer.parseInt(numero_1.getText());
        num2 = Integer.parseInt(numero_2.getText());
        result = calc.suma(num1, num2);
        resultado.setText(String.valueOf(result));

    }//GEN-LAST:event_sumarActionPerformed
    /**
     * Despues de hacer click en boton restar se obtienen los datos ingresados
     * por el usuario y luego llamar a la funcion restar de la clase
     * Calculadora2019_1 y por ultimo mostrar el resultado de la resta en el
     * frame
     *
     * @param evt
     */
    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed

        num1 = Integer.parseInt(numero_1.getText());
        num2 = Integer.parseInt(numero_2.getText());
        result = calc.resta(num1, num2);
        resultado.setText(String.valueOf(result));
    }//GEN-LAST:event_restarActionPerformed
    /**
     * Despues de hacer click en boton multiplicar se obtienen los datos
     * ingresados por el usuario y luego se llama a la funcion multiplicar de la
     * clase Calculadora2019_1 y por ultimo mostrar el resultado de la
     * multiplicacion en el frame
     *
     * @param evt
     */
    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed

        num1 = Integer.parseInt(numero_1.getText());
        num2 = Integer.parseInt(numero_2.getText());
        result = calc.multiplicar(num1, num2);
        resultado.setText(String.valueOf(result));
    }//GEN-LAST:event_multiplicarActionPerformed

    /**
     * Despues de hacer click en boton dividir se obtienen los datos ingresados
     * por el usuario y luego se llama a la funcion dividir de la clase
     * Calculadora2019_1 y por ultimo se muestra el resultado de la division en
     * el frame
     *
     * @param evt
     */
    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed

        num1 = Integer.parseInt(numero_1.getText());
        num2 = Integer.parseInt(numero_2.getText());

        if (num2 == 0) {
            resultado.setText("no se puede dividir por cero");
        }
        float r = calc.dividir(num1, num2);
        resultado.setText(String.valueOf(r));

    }//GEN-LAST:event_dividirActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    /**
     * Despues de hacer click en boton adicionar se obtienen los datos
     * ingresados por el usuario y luego se llama a la funcion adicionar de la
     * clase Calculadora2019_1 y por ultimo se muestra el resultado de la suma
     * en el frame
     *
     * @param evt
     */
    private void add_ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ansActionPerformed
        num1 = Integer.parseInt(add.getText());
        result = calc.adicionar(num1);
        resultado.setText(String.valueOf(result));
    }//GEN-LAST:event_add_ansActionPerformed

    /**
     * cuando se da click en boton potencia se crea un nuevo formulario pot_form
     *
     * @param evt
     */
    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        pot_form pot = new pot_form();
        pot.setVisible(true);

    }//GEN-LAST:event_potenciaActionPerformed
    /**
     * Despues de hacer click en boton sustraer se obtiene el numero ingresado
     * por el usuario y se llama a la funcion sustraer de la clase
     * Calculadora2019_1, luego se muestra el resultado en el frame
     *
     * @param evt
     */
    private void sub_ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_ansActionPerformed
        num1 = Integer.parseInt(sub.getText());
        result = calc.sustraer(num1);
        resultado.setText(String.valueOf(result));
    }//GEN-LAST:event_sub_ansActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JButton add_ans;
    private javax.swing.JButton dividir;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicar;
    private javax.swing.JTextField numero_1;
    private javax.swing.JTextField numero_2;
    private javax.swing.JButton potencia;
    private javax.swing.JButton restar;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField sub;
    private javax.swing.JButton sub_ans;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
