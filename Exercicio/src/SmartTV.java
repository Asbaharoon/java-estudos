public class SmartTV {

    // Exemplo de classe para representar uma SmartTV onde:
    // Tenha características: ligada (boolean), canal (int) e volume (int)
    // Nossa TV poderá ligar e desligar e assim mudar o estado
    // Nossa TV umentará e dimuinuirá o volume sempre em +1 ou -1
    // Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

    // Estado inicial
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void increaseVolume() {
        volume ++;
    }

    public void decreaseVolume() {
        volume --;
    }

    public void channelup(){
        channel ++;
    }

    public void channelDown() {
        channel --;
    }

    public void setChannel(int num) {
        channel = num;
    }

}
