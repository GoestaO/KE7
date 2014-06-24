/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author goesta
 */
public class Filter {

    private String eingabeDatei;
    private String ausgabeDatei;

    public Filter(String eingabeDatei, String ausgabeDatei) {
        this.eingabeDatei = eingabeDatei;
        this.ausgabeDatei = ausgabeDatei;
    }

    public Filter(String eingabeDatei) {
        this.eingabeDatei = eingabeDatei;
    }

    public void filter() {
        try {

            Scanner s = new Scanner(new File(eingabeDatei));
            PrintWriter writer = new PrintWriter(ausgabeDatei);
            while (s.hasNextLine()) {
                String line = s.nextLine();
//                Character.isLowerCase(line.charAt(0));
                System.out.println(line.charAt(0));
//                System.out.println("line = " + array[0]);
            }
        } catch (FileNotFoundException fe) {
            System.err.println("Datei nicht gefunden");
        }
    }

    public String getEingabeDatei() {
        return eingabeDatei;
    }

    public void setEingabeDatei(String eingabeDatei) {
        this.eingabeDatei = eingabeDatei;
    }

    public String getAusgabeDatei() {
        return ausgabeDatei;
    }

    public void setAusgabeDatei(String ausgabeDatei) {
        this.ausgabeDatei = ausgabeDatei;
    }

}
