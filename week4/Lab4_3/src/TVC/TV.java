package TVC;

public class TV {
    public int volume;
    public int channel;
    public TV(){
        this.volume = 30;
        this.channel = 1;
    }
    public void PowOn(){
        System.out.println("TV Turned On.");
        ShowStat();
    }
    public void Vup(){
        volume++;
        System.out.println("Volume: "+volume);
    }
    public void Vdown(){
        volume--;
        System.out.println("Volume: "+volume);
    }
    public void Chup(){
        channel++;
        System.out.println("Channel: "+channel);
    }
    public void Chdown(){
        channel--;
        System.out.println("Channel: "+channel);
    }
    public void ShowStat(){
        System.out.println("Channel: "+channel+" Volume: "+volume);
    }
}
