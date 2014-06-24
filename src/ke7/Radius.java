/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke7;

/**
 *
 * @author goesta
 */
public class Radius {

    public double radius(double flaeche) {

        double pi = Math.PI;
        double radius = Math.sqrt(flaeche / pi);
        return radius;
    }

}
