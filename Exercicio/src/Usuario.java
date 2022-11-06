public class Usuario {
  
  public static void main(String[] args) throws Exception {
    
    SmartTV smartTv = new SmartTV();

    System.out.println("Tv Ligada? " + smartTv.on);
    System.out.println("Volume? " + smartTv.volume);
    System.out.println("Canal? " + smartTv.channel);

    smartTv.turnOn();

    System.out.println("Tv Ligada? " + smartTv.on);

    smartTv.increaseVolume();

    System.out.println("Volume? " + smartTv.volume);

    smartTv.decreaseVolume();

    System.out.println("Volume? " + smartTv.volume);

    smartTv.increaseVolume();
    smartTv.increaseVolume();
    smartTv.increaseVolume();
    smartTv.increaseVolume();
    smartTv.increaseVolume();

    System.out.println("Volume? " + smartTv.volume);

    smartTv.channelup();
    smartTv.channelup();

    System.out.println("Canal? " + smartTv.channel);

    smartTv.channelDown();

    System.out.println("Canal? " + smartTv.channel);

    smartTv.setChannel(10);

    System.out.println("Canal? " + smartTv.channel);
  }


}
