public class SmartTv {
    boolean isOn = false;
    int volume = 25;
    int channel = 1;

    public void TurnOn(){
        isOn = true;
    }

    public void TurnOff(){
        isOn = false;
    }

    public void upVolume(){
        if(volume < 100)
            volume++;
    }

    public void downVolume(){
        if(volume > 0);
    }

    public void upChannel(){
        if(channel == 250)
            channel = 1;
        else
            channel++;
    }

    public void downChannel(){
        if(channel == 1)
            channel = 250;
        else
            channel--;
    }

    public void chooseChannel(int channel){
        this.channel = channel;
    }


}