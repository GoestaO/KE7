/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author goesta
 */
public class ScannerRechner {

    private String dateiname;

    public ScannerRechner(String dateiname) {
        this.dateiname = dateiname;
    }

    public long addiere() {
        long summe = 0;
//        long temp = 0;
        try {
            Scanner sc = new Scanner(new File(dateiname));
            while (sc.hasNextLong()) {
                long aLong = sc.nextLong();
                summe += aLong;
            }

        } catch (FileNotFoundException fe) {
            System.err.println("Datei nicht gefunden.");
        }
        return summe;
    }

    public String getDateiname() {
        return dateiname;
    }

    public void setDateiname(String dateiname) {
        this.dateiname = dateiname;
    }

}
