/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesapp;

/**
 *
 * @author Student
 */
public class Product implements IProduct{

    private String[] products;
    private int[][] sales;

    // Constructor accepting the 1D product names array and 2D sales array
    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    //  total number of mattresses sold 
    @Override
    public int GetTotalProductsSold() {
        
        int total = 0;
        
        for (int row = 0; row < sales.length; row++) {
            
            for (int col = 0; col < sales[row].length; col++) {
                
                total += sales[row][col];
            }
        
        
       }
        return total;
    }

    // average number of mattresses sold for every entry
    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int row = 0; row < sales.length; row++) {
            count += sales[row].length;
     }
        return (double) total / count;
  }

    // gets  the most popular product 
    @Override
    public String GetMostPopularProduct() {
        
        int highestTotal = -1;
        int topProductIndex = 0;

        for (int row = 0; row < sales.length; row++) {
            
            int rowTotal = 0;
            
            
            for (int col = 0; col < sales[row].length; col++) {
                rowTotal += sales[row][col];
            }
            
            
            if (rowTotal > highestTotal) {
                highestTotal = rowTotal;
                topProductIndex = row;
                
            }
        
     }

        // look for highest sale  fo the month of the product that performs the best
        int maxSingleMonthSale = 0;
        for (int col = 0; col < sales[topProductIndex].length; col++) {
            if (sales[topProductIndex][col] > maxSingleMonthSale) {
                maxSingleMonthSale = sales[topProductIndex][col];
            }
        }

        return products[topProductIndex] + "(" + maxSingleMonthSale + ")";
    }
}




