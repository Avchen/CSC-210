package Chapter9;

/**
 * Created by averychen on 3/29/17.
 */
public class TV {

    int channel;
    int volumeLevel;
    boolean tvSwitch;

    public TV(){
        this.channel = 1;
        this.volumeLevel = 5;
        this.tvSwitch = true;
    }

    public TV(int channel1, int volume, boolean newSwitch) {
        this.channel = channel1;
        this.volumeLevel = volume;
        this.tvSwitch = newSwitch;
    }

    public void turnOn() {

        this.tvSwitch = true;
    }

    public void turnOff() {

        this.tvSwitch = false;
    }

    public void setChannel(int newChannel){

        this.channel = newChannel;
    }

    public void channelDown(){

        this.channel--;
    }

    public void channelUp(){

        this.channel++;
    }

    public void volumeUp(){

        this.volumeLevel = this.volumeLevel+1;
    }

    public void volumeDown(){

        this.volumeLevel = this.volumeLevel-1;
    }
}

class TestTV {

    public static void main (String[] args) {

        TV tv1 = new TV();

        System.out.println(tv1.volumeLevel);

        TV tv2 = new TV(5,10,true);

        System.out.println(tv2.channel);

        System.out.println("Channel is set to 9");

        tv2.setChannel(9);

        System.out.println(tv2.channel);

        tv2.volumeUp();

        System.out.println(tv2.volumeLevel);
    }
}
