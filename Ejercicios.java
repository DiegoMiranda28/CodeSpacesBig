import java.util.Scanner;

public class Ejercicios {

    public static void main(String[]args){
    Scanner s=new Scanner(System.in);

    //Programa de contando la vocal "A"
    int cont=0;
    String pal;
    pal=s.nextLine();

    for(int i=0;i<pal.length();i++){
    if(pal.charAt(i)=='a'){
        cont++;
    }     
    }

    System.out.println("En la frase: ["+pal+"]");
    System.out.println("Total: "+cont);
    }

}