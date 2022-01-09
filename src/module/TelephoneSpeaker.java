package module;

public class TelephoneSpeaker implements Speaker{
    @Override
    public void sound() {
        System.out.println("Ring Ring Ring~");
    }
}
