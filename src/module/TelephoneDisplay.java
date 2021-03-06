package module;

public class TelephoneDisplay implements Display{

    private String contents = "";

    public void setContents(String contents){
        this.contents = contents;
    }

    @Override
    public void show() {
        System.out.println("********************");
        System.out.println(this.contents);
        System.out.println("********************");
    }

    public void clear() {
        this.contents = "";
        System.out.println("********************");
        System.out.println("Display Clear" + this.contents);
        System.out.println("********************");
    }
}
