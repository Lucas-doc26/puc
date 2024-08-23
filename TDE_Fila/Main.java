// Main
package TDE_Fila;

import java.util.Scanner;
import java.beans.Expression;

public class Main {

    public static void main(String[] args) {
        Fila filaA = new Fila(4);
        Fila filaB = new Fila(1);

        filaA.insere(0);
        filaA.insere(1);
        filaA.insere(2);
        filaA.insere(5);

        filaB.insere(3);


        Merge merge = new Merge(filaA, filaB);
        merge.ordena();



    }
}