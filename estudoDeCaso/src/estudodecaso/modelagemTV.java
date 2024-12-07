package estudodecaso;

public class modelagemTV {
    int tamanhoTela, volume, voltagem, canal;
    String marca;
    
    public modelagemTV(int voltagem){
        volume = 5;
        canal = 1;
        this.voltagem = voltagem;
        marca = "";

    }
    public void consumoEnergia(int tamanho){
        do{
            int consumo = tamanho * voltagem;
            System.out.println("O consumo da TV é de: " + consumo);
        }while (tamanho == 0);
        
    }
    public void ligar (){
        System.out.println("TV ligada");
    }
    public void aumentarVolume (){
        if (volume <= 10){
            System.out.println("Aumentando volume...");           
            volume++;
            System.out.println("Volume: " + volume);
        }
        else{
            System.out.println("Nao eh mais possivel aumentar o volume");
            
        }
        
    }
    public void diminuirVolume(){
        if (volume >= 1){
            System.out.println("Diminuindo volume...");            
            volume++;
            System.out.println("Volume: " + volume);
        }
        else{
            System.out.println("Nao eh mais possivel diminuir o volume");
        }
    }
    public void subindoCanal(){
        System.out.println("Subindo canal...");        
        canal++;
        System.out.println("Canal: " + canal);
    }
    public void descendoCanal(){
        System.out.println("Descendo canal...");
        canal++;
        System.out.println("Canal: " + canal);
    }
    public void desligar(){
        System.out.println("-------------------");
        System.out.println("Desligando...");
        System.out.println("-------------------");
    }
}
