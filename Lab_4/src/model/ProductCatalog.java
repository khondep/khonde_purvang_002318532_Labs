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
public class ProductCatalog {
    
    private ArrayList<Product> productCatalog;
    
    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    //method for adding a new product
    
    public Product addProduct() {
        Product product = new Product();
        productCatalog.add(product);
        return product;
    }
    
    //method for deleting a product
    
    public void removeProduct(Product product) {
        productCatalog.remove(product);
    }
    
    //method for searching for a product
    public Product searchProduct(int id) {

        for(Product product : productCatalog) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    
    public int getProductCount(){
        return productCatalog.size();
    }
    
        public ArrayList<Product> searchProductsByFeature(String searchTerm) {
        ArrayList<Product> results = new ArrayList<>();

        for (Product product : productCatalog) {
            for (Feature feature : product.getFeatures()) {
                if ((feature.getValue() != null && feature.getValue().toString().toLowerCase().contains(searchTerm.toLowerCase()))) {
                    results.add(product);
                    break; 
                }
            }
        }

        return results;
    }


}