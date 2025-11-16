package ui;

import data.GestorDatos;
import model.CentroCultivo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creo una instancia del gestor de datos
        GestorDatos gestor = new GestorDatos();

        //Cargo los datos desde el archivo
        ArrayList<CentroCultivo> centros = gestor.cargarCentros("resources/centros.txt");

        //Se muestran todos los centros de cultivo
        System.out.println("Lista completa de centros de cultivo");
        for (CentroCultivo c : centros) {
            System.out.println(c);
        }

        //Se filtran los centros que producen mas de 1000 toneladas
        System.out.println("\nCentros con produccion mayor a 1000 toneladas");
        for (CentroCultivo c : centros) {
            if (c.getToneladas() > 1000) {
                System.out.println(c);
            }
        }
    }
}

