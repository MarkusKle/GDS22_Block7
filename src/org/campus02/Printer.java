package org.campus02;

public class Printer {
    public static void main(String[] args) {
        //printFromNToZero(5);
        //printFromNToZeroRecursive(5);
        printFromZeroToNRecursive(5);


    }

    //Methodendeklaration
    public static void printFromNToZero(int n) {
        // iterativer Lösungsansatz
        while (n >= 0) {
            System.out.println("n =" + n);
            n--;
            // n = n - 1;
        }
    }



    // Rekursion = die Methode ruft sich selbst auf
    public static void printFromNToZeroRecursive(int n) {
        // Abbruchsbestimmung
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        // rufe mich selbst nochmal auf
        printFromNToZeroRecursive(n - 1);   //n updaten und um 1 verringern   //oder --n da sonst mit n-- der wert übergeben wird und danach verringert wird
    }


    //Übung 1

    public static void printFromZeroToNRecursive(int n) {
        // Abbruchsbestimmung
        if (n < 0) {
            return;
        }
        // rufe mich selbst nochmal auf
        printFromZeroToNRecursive(n - 1);

        //Schreibe erst auf die Konsole wenn die Abbrbuchsbestimmung zutrifft
        System.out.println("n = " + n);
    }

}
