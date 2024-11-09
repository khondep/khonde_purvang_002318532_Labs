/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Business {
    
    MasterOrderList mastOrderList;
    SupplierDirectory supplierDirectory;

    public Business() {
        
        supplierDirectory = new SupplierDirectory();
        mastOrderList = new MasterOrderList();
        
    }

    public MasterOrderList getMastOrderList() {
        return mastOrderList;
    }

    public void setMastOrderList(MasterOrderList mastOrderList) {
        this.mastOrderList = mastOrderList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    
    
}
