/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package ui.supplier;

import model.Product;
import model.Supplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.ProductCatalog;




/**
 *
 * @author Rushabh
 */
public class SearchForProductJPanel extends javax.swing.JPanel {

   JPanel workArea;
    Supplier supplier;

    
    /** Creates new form CreateProductJPanel */
    public SearchForProductJPanel(JPanel workArea, Supplier supplier) {
  
        initComponents();
        this.workArea = workArea;
        this.supplier = supplier; 

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

   


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblProductId = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblProductId1 = new javax.swing.JLabel();
        idCompany = new javax.swing.JTextField();
        searchCompanyButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setText("Search for Product");

        lblProductId.setText("Product Id:");

        searchButton.setText("Search Now >>");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblProductId1.setText("Features:");

        idCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCompanyActionPerformed(evt);
            }
        });

        searchCompanyButton.setText("Search Now >>");
        searchCompanyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCompanyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductId1)
                    .addComponent(lblProductId)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchCompanyButton)
                            .addComponent(searchButton))))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblTitle))
                .addGap(61, 61, 61)
                .addComponent(lblProductId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(37, 37, 37)
                .addComponent(lblProductId1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCompanyButton))
                .addContainerGap(246, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idField, searchButton});

    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
     String id = idField.getText();
if (id.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter some value");
} else {
    boolean found = false;
     try {
         
    int id1 = Integer.parseInt(id);
    for (Product product : supplier.getProductCatalog().getProductCatalog()) {
        if (product.getId() == id1) {
            ViewProductDetailJPanel vpdjp = new ViewProductDetailJPanel(workArea, product);
            workArea.add("ViewProductDetailJPanelSupplier", vpdjp);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
            found = true;
            break;
        }
    }
        if (!found) {
        JOptionPane.showMessageDialog(this, "No product found for the ID");
        }
       }
     
     
    catch (NumberFormatException e) {
        // if stringPrice is not a valid integer
        JOptionPane.showMessageDialog(this, "Enter a valid Product id (it is an positive integer value)", "Error", JOptionPane.ERROR_MESSAGE);
    }
     
     idField.setText("");
}
}//GEN-LAST:event_searchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout)workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCompanyActionPerformed

    private void searchCompanyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCompanyButtonActionPerformed
        // TODO add your handling code here:
        String idc = idCompany.getText();
        if (idc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter some value");
        }
        else{
            FilterResultJPanel frjp = new FilterResultJPanel(workArea, supplier,idc);
            workArea.add("ManageProductCatalogJPanel", frjp);
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.next(workArea);
        }

        idCompany.setText("");

    }//GEN-LAST:event_searchCompanyButtonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idCompany;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductId1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchCompanyButton;
    // End of variables declaration//GEN-END:variables
}
