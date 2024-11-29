//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        int n, i, iMin;
        
        System.out.println("Quanti atleti ci sono in gara?");
        n = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline rimasto
        
        String[] nomi = new String[n];
        String[] nazionali = new String[n];
        float[] tempi = new float[n];
        
        for (i = 0; i <= n - 1; i++) {
            System.out.println("nome " + (i + 1) + "° atleta: ");
            nomi[i] = scanner.nextLine();
            
            System.out.println("Nazionale " + (i + 1) + "° atleta: ");
            nazionali[i] = scanner.nextLine();
            
            System.out.println("Tempo " + (i + 1) + "° atleta: ");
            tempi[i] = scanner.nextFloat();
            scanner.nextLine(); // Consuma il newline dopo il float
        }
        
        System.out.println("Informazioni inserite");
        for (i = 0; i <= n - 1; i++) {
            System.out.println((i + 1) + "° atleta: " + nomi[i] + 
                             "; nazionale: " + nazionali[i] + 
                             "; tempo: " + tempi[i]);
        }
        
        System.out.println("Ricerca dell'atleta vincitore");
        float min;
        iMin = 0;
        min = tempi[0];
        
        for (i = 0; i < tempi.length; i++) {
            if (tempi[i] < min) {
                iMin = i;
                min = tempi[i];
            }
        }
        
        System.out.println("Atleta vincitore: " + nomi[iMin] + 
                          "; nazionale: " + nazionali[iMin] + 
                          "; tempo: " + tempi[iMin]);

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md