package estudodecaso;

public class modelagemCarro {
    String modelo, marcha;
    double velocidade, aceleracao;
    
    public modelagemCarro(){
        modelo = "modelo A";
        marcha = "Neutro";
        velocidade = 0.0;
        aceleracao = 0.0;
    }
    
    public void detalhesCarro(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Marcha do carro: " + marcha);
        System.out.println("Velocidde do carro: " + velocidade);
        System.out.println("Aceleraçao do carro: " + aceleracao);
    }
    public void ligarCarro(){
        System.out.println("Carro ligado, motor roncando");
    }
    public void desligarCarro(){
        System.out.println("Carro desligado");
    }
    public void acelerar(){
        System.out.println("O carro esta acelerando");
    }
    public void desacelerar(){
        System.out.println("O carro esta desacelerando");
    }
    public void direcao(String direcao){
        if (direcao == "direita"){
            System.out.println("O carro está virando para a direita");
        }
        else if (direcao == "esquerda"){
            System.out.println("O carro está virando para a esquerda");
        }
        else {
            System.out.println("O carro está em linha reta");
        }
    }
    public void marcha (String marcha){
        if (marcha == "cima"){
            System.out.println("A marcha esta para cima");
        }
        else if (marcha == "baixo"){
            System.out.println("A marcha esta para baixo");
        }
        else {
            System.out.println("A marcha esta no neutro");
        }
    }
    
   
}
