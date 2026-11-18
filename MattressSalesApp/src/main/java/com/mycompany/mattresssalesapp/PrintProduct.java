/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesapp;

/**
 *
 * @author Student
 */
public class PrintProduct {
    
    
private Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    // println to output the total product sales
    public void printTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    // to print the average product sales 
    public void printAverageSales() {
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(product.GetAverageProductSold()));
    }

    
    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    // Print full report
    public void printReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("************************************");
        printTotalSales();
        printAverageSales();
        printMostPopularProduct();
    }
}
