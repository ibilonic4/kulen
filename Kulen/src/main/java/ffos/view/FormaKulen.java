/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.view;

import ffos.controller.ObradaKulena;
import ffos.controller.ObradaMesara;
import ffos.controller.ObradaMjesto;
import ffos.model.Kulen;
import ffos.model.Mesar;
import ffos.model.Mjesto;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class FormaKulen extends javax.swing.JFrame implements ViewAktivnosti{
private ObradaKulena ok;
private ObradaMesara oms;
private ObradaMjesto omj;
    /**
     * Creates new form FormaKulen
     */
    public FormaKulen() {
        ok = new ObradaKulena();
        oms = new ObradaMesara();
        omj = new ObradaMjesto();
        
        initComponents();
        ucitajPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBroj = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        cmcMjesto = new javax.swing.JComboBox<>();
        cmbMesar = new javax.swing.JComboBox<>();
        btnc = new javax.swing.JButton();
        btnu = new javax.swing.JButton();
        btnd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst);

        jLabel1.setText("broj");

        jLabel2.setText("datum");

        btnc.setText("c");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnu.setText("u");
        btnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuActionPerformed(evt);
            }
        });

        btnd.setText("d");
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtDatum))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtBroj)))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbMesar, 0, 138, Short.MAX_VALUE)
                            .addComponent(cmcMjesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnc)
                .addGap(103, 103, 103)
                .addComponent(btnu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnd)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmcMjesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cmbMesar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnc)
                    .addComponent(btnu)
                    .addComponent(btnd))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstValueChanged
        if (evt.getValueIsAdjusting() || lst.getSelectedValue() == null) {
            postaviVrijednostiNaViewKontrole();} return;
    }//GEN-LAST:event_lstValueChanged

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        ok.setEntitet(new Kulen());
        ucitajVrijednostiIzViewKontrola();
        try {
            ok.create();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_btncActionPerformed

    private void btnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuActionPerformed
        if(ok.getEntitet()==null){
            JOptionPane.showMessageDialog(this,"Prvo odaberite stavku");
            return;
        }
        ucitajVrijednostiIzViewKontrola();
        try {
            ok.update();
            ucitajPodatke();
        } catch (Exception e) {}
    }//GEN-LAST:event_btnuActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        if(ok.getEntitet()==null){
            JOptionPane.showMessageDialog(this,"Prvo odaberite stavku");
            return;
        }
        try {
            ok.delete();
            ucitajPodatke();
        } catch (Exception e) {}
    }//GEN-LAST:event_btndActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btnu;
    private javax.swing.JComboBox<Mesar> cmbMesar;
    private javax.swing.JComboBox<Mjesto> cmcMjesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Kulen> lst;
    private javax.swing.JTextField txtBroj;
    private javax.swing.JTextField txtDatum;
    // End of variables declaration//GEN-END:variables

    @Override
    public void ucitajPodatke() {
DefaultListModel<Kulen> k= new DefaultListModel<>();
        k.addAll(ok.read());
        lst.setModel(k);  

DefaultComboBoxModel<Mjesto> mj = new DefaultComboBoxModel<>();
        mj.addAll(omj.read());
        cmcMjesto.setModel(mj);
        
        DefaultComboBoxModel<Mesar> ms = new DefaultComboBoxModel<>();
        ms.addAll(oms.read());
        cmbMesar.setModel(ms);
    }

    @Override
    public void postaviVrijednostiNaViewKontrole() {
ok.setEntitet(lst.getSelectedValue());
        txtBroj.setText(lst.getSelectedValue().getBroj().toString());
    txtDatum.setText(lst.getSelectedValue().getDatum().toString());  
     cmcMjesto.setSelectedItem(lst.getSelectedValue().getMjesto()); 
    cmbMesar.setSelectedItem(lst.getSelectedValue().getMesar());    }

    @Override
    public void ucitajVrijednostiIzViewKontrola() {
ok.SetData(txtBroj.getText(), txtDatum.getText());
ok.getEntitet().setMesar((Mesar) cmbMesar.getSelectedItem());
ok.getEntitet().setMjesto((Mjesto) cmcMjesto.getSelectedItem()); 
    }
}
