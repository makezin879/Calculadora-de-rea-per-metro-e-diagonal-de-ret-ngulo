package main;
import java.util.Scanner;
import operacoes.Engineer;

public class Triangulo {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    Engineer engineer= new Engineer();

    System.out.println("entre com a largura do tringulo");
    engineer.altura= sc.nextDouble();

    System.out.println("entre com a altura do triangulo");
    engineer.largura= sc.nextDouble();

    System.out.println("A area do triangulo é: "+engineer.area()
    +"O perimetro é: "+engineer.perimetro()
    +"A diagonal é: "+engineer.diagonal()
    );
    sc.close();
    }
    

}
