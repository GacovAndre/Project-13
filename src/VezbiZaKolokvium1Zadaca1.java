import java.util.Scanner;
public class VezbiZaKolokvium1Zadaca1 {
public static void main(String[] args) {
int f; // Vrednost na temperatura izrazena vo stepeni Ferenhajtovi
int c; // Vrednost na temperatura izrazena vo stepeni Celzijusovi
       // Vlez na podatoci preku tastatura
Scanner var = new Scanner(System.in);
System.out.print("Vnesete Celziusovi stepeni: ");
c = var.nextInt();
       //  Formula za presmetka na stepeni Celozjusovi vo Farenhajtovi
f = 9*c/5 + 32;
      // Prikaz na rezultat na ekran
System.out.println(c + " stepeni Celziusovi = ");
System.out.println(f + " Farenhajtovi stepeni");
}
}