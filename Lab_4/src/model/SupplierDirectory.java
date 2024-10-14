/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory() {
        supplierList = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    
    //method to add a new supplier
    
    public Supplier addSupplier() {
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
    }
    
    public void removeSupplier(Supplier supplier) {
        supplierList.remove(supplier);
    }
    
    public Supplier searchSupplier(String keyWord) {
        for(Supplier supplier : supplierList) {
            if(keyWord.equals(supplier.getSupplyName())) {
                return supplier;
            }
        }
        return null;
    }
    
}
