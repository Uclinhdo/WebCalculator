/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author linhdo
 */
public class CalculatorService {
    private double length;
    private double width;
    private double area;
    
    public final double getArea(){
        area = length * width;
        return area;
    }
    
    
}
