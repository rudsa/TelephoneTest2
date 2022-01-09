package module;

public class TelephoneDisplay implements Display{

    private String contents = "";

    public void setContents(String contents){
        this.contents = contents;
        show();
    }

    @Override
    public void show() {
        System.out.println("********************");
        System.out.println(this.contents);
        System.out.println("********************");
    }

    @Override
    public void clear() {
        this.contents = "";
        System.out.println("********************");
        System.out.println("Display Clear" + this.contents);
        System.out.println("********************");
    }
}
