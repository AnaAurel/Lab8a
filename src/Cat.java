/**
 * Created by condor on 18/11/16.
 * FastTrackIT, 2015
 */
public class Cat extends Animal {
    public void sound() {
        System.out.println("cat");
        new MakeASound().playMP3("cat.wav");


    }
}
