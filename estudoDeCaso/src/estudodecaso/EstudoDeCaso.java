package estudodecaso;
import java.util.Scanner;

public class EstudoDeCaso {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        modelagemCarro carro = new modelagemCarro();
        
        System.out.println("\nDetalhes do Carro:");
        carro.detalhesCarro();
        
        carro.ligarCarro();
        carro.acelerar();
        carro.desacelerar();
        String direcao = "direita";
        carro.direcao(direcao);
        direcao = "esquerda";
        carro.direcao(direcao);
        direcao = "outro";
        carro.direcao(direcao);
        
        String marcha = "cima";
        carro.marcha(marcha);
        marcha = "baixo";
        carro.marcha(marcha);
        marcha = "neutro";
        carro.marcha(marcha);
        
        modelagemTV TV = new modelagemTV(110);
        modelagemTV TV2 = new modelagemTV(220);
        System.out.printf("Informe o tamanho da sua tv: ");
        int tamanho = teclado.nextInt();
        TV.ligar();
        TV.consumoEnergia(tamanho);
        TV2.ligar();
        TV2.consumoEnergia(tamanho);
        
        TV.aumentarVolume();
        TV.diminuirVolume();
        TV.subindoCanal();
        TV.descendoCanal();
        TV.desligar();
    }   
}