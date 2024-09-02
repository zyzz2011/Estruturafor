import java.util.Scanner;

public class Main {
  public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
 // Fazer um programa que lê um valor inteiro N é depois N números inteiros. Ao final mostra a soma dos N numeros lidos.
 System.out.println("Digite quantos números serão somados:");
 int N = sc.nextInt();
 int soma = 0;
  for (int i = N; i > 0; i-- ){
  System.out.println(" O número a ser somado:");
    int y = sc.nextInt();
    soma += y;
  }
// for(int i = 0; i < 5;i++ ) {
// System.out.println(i);
  
// }
// for(int j = 4; j >= 0; j--){
  System.out.println(j);
 }
  //for( início ; condição ; incremento ) {
  //comandos
  //}
 sc.close();
  }
}