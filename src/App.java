import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        //lek4 uppgift A


        System.out.println("Nedan kommer uppgiften från lek4 som handlar om Typomvandling: ");
        //Skapa en Scanner som kallas Scanner för att kunna läsa inmatning från användaren.
        Scanner scanner = new Scanner(System.in);

        // Be användaren mata in två heltal
        System.out.print("Ange det första heltalet: ");
        int tal1 = scanner.nextInt();
  
        System.out.print("Ange det andra heltalet: ");
        int tal2 = scanner.nextInt();
  
        // Beräkna kvoten som ett decimaltal genom att använda typomvandling
        double kvot = (double) tal1 / tal2;
  
        // Skriv ut resultatet både som ett decimaltal och ett heltal
        System.out.println("Kvoten som decimaltal: " + kvot);
        System.out.println("Kvoten som heltal: " + (int) kvot);



        //LEKTION 4 UPPGIFT B
        System.out.println("Nedan kommer uppgift B: ");



        // Be användaren mata in ett substantiv i singular
         System.out.println("Ange ett substantiv i singular: ");
         String singularSubstantiv = scanner.nextLine();
 
         // Be användaren mata in en pluraländelse
         System.out.print("Ange pluraländelsen: ");
         String pluralAndelse = scanner.nextLine();
 
         // Skapa pluralformen genom att lägga till pluraländelsen
         String pluralSubstantiv = singularSubstantiv + pluralAndelse;
 
         // Skriv ut substantivet både i singular och pluralform
         System.out.println("Substantivet i singular: " + singularSubstantiv);
         System.out.println("Substantivet i plural: " + pluralSubstantiv);
 
        

    }
}
