public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Is the tv on? " + smartTv.isOn);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        
        smartTv.chooseChannel(250);
        
        System.out.println("Channel: " + smartTv.channel);
        

        smartTv.upChannel();

        System.out.println("Channel: " + smartTv.channel);
        
    
    }
}
