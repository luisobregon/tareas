/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Marco
 */
public class Rectangulo {
    private double Base;
    private double Altura;
    
    public Rectangulo(double Base,double Altura)
    {
        this.Base=Base;
        this.Altura=Altura;
    }

    public double Altura()
    {
        return this.Altura;
    }
    public double Base()
    {
        return this.Base;
    }
}
