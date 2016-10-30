package com.srl.gui;

import java.io.IOException;
import javax.swing.ImageIcon;

public class SRL extends javax.swing.JFrame implements Runnable {

    public SRL() {
        initComponents();
        setSize(255, 225);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.JComboBox();
        windows = new javax.swing.JLabel();
        all1 = new javax.swing.JLabel();
        in = new javax.swing.JLabel();
        timer = new javax.swing.JSpinner();
        time = new javax.swing.JComboBox();
        all2 = new javax.swing.JLabel();
        enabletimer = new javax.swing.JButton();
        timeleft = new javax.swing.JLabel();
        all = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shutdown Timer");
        setIconImage(new ImageIcon(getClass().getResource("/com/srl/gui/icons/Shutdown.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(null);

        options.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        options.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shut down", "Restart", "Log off", "Hibernate" }));
        getContentPane().add(options);
        options.setBounds(40, 50, 90, 23);

        windows.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        windows.setText("Windows");
        getContentPane().add(windows);
        windows.setBounds(150, 50, 60, 20);

        all1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(all1);
        all1.setBounds(30, 40, 190, 40);

        in.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        in.setText("in");
        getContentPane().add(in);
        in.setBounds(40, 100, 20, 17);

        timer.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        timer.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        getContentPane().add(timer);
        timer.setBounds(61, 100, 60, 20);

        time.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "minutes", "hours" }));
        getContentPane().add(time);
        time.setBounds(130, 100, 80, 23);

        all2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(all2);
        all2.setBounds(30, 90, 190, 40);

        enabletimer.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        enabletimer.setText("Enable Timer");
        enabletimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enabletimerActionPerformed(evt);
            }
        });
        getContentPane().add(enabletimer);
        enabletimer.setBounds(40, 150, 103, 25);

        timeleft.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        timeleft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeleft.setText("Time left");
        timeleft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(timeleft);
        timeleft.setBounds(150, 150, 80, 20);

        all.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 11))); // NOI18N
        getContentPane().add(all);
        all.setBounds(10, 10, 230, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enabletimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enabletimerActionPerformed
        if (enable == null) {
            enable = new Thread(this);
            enable.start();
            enabletimer.setText("Disable Timer");
        } else {
            enable.stop();
            enabletimer.setText("Enable Timer");
            timeleft.setText("Time left");
            enable = null;
        }


    }//GEN-LAST:event_enabletimerActionPerformed

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
            java.util.logging.Logger.getLogger(SRL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SRL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SRL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SRL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new SRL().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel all;
    private javax.swing.JLabel all1;
    private javax.swing.JLabel all2;
    private javax.swing.JButton enabletimer;
    private javax.swing.JLabel in;
    private javax.swing.JComboBox options;
    private javax.swing.JComboBox time;
    private javax.swing.JLabel timeleft;
    private javax.swing.JSpinner timer;
    private javax.swing.JLabel windows;
    // End of variables declaration//GEN-END:variables

    Thread enable;

    @Override
    public void run() {

        String optionsact = options.getSelectedItem().toString();
        int timeract = (int) timer.getValue();
        String timeact = time.getSelectedItem().toString();

        if (timeact.equals("minutes")) {

            timeract = timeract * 60;

        } else if (timeact.equals("hours")) {

            timeract = timeract * 3600;

        }

        if (optionsact.equals("Shut down")) {

            optionsact = "shutdown -s";

        } else if (optionsact.equals("Restart")) {

            optionsact = "shutdown -r";

        } else if (optionsact.equals("Log off")) {

            optionsact = "shutdown -l";

        } else if (optionsact.equals("Hibernate")) {

            optionsact = "shutdown /h";

        }

        for (int i = timeract; i >= 0; i--) {
            timeleft.setText(i + " Sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }

            if (i == 0) {

                try {
                    Runtime.getRuntime().exec(optionsact);
                } catch (IOException ex) {

                }

            }

        }

    }
}
