/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author goesta
 */
public class Rechner {

    private String dateiname;

    public Rechner(String dateiname) {
        this.dateiname = dateiname;
    }

    public long addiere() {
        long summe = 0;
        long temp = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(dateiname));
            String line = br.readLine();
            System.out.println("line = " + line);
            while (line != null) {
                temp = Long.parseLong(line);
                summe += temp;
                line = br.readLine();
            }

        } catch (FileNotFoundException fe) {
            System.out.println("Datei nicht gefunden");

        } catch (IOException ie) {
            System.out.println("Fehler beim Einlesen ");
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
