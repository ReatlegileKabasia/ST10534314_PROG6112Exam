/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesapp;

import java.util.Scanner;
/**
 *
 * @author Student
 */

public class MattressSalesApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // names in 1d array
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

       // 2d array
        int[][] sales = new int[3][3];

        // get the  sales data from user input
        for (int row = 0; row < products.length; row++) {
            
            for (int col = 0; col < sales[row].length; col++) {
                System.out.print("Enter number of sales for month " + (col + 1) + " for " + products[row] + " mattress: ");
                        
                sales[row][col] = input.nextInt();
                
            }
            
            System.out.println();
        }

       
        
        Product product = new Product(products, sales);
        PrintProduct printer = new PrintProduct(product);
        printer.printReport();

        input.close();
    }
}