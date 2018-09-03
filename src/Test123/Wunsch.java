package Test123;

public class Wunsch {

    private int wID;
    private int uID;
    private int eID;

    private String Text;
    private boolean isW;

    public Wunsch(String t){
        this.Text = t;
        this.isW = true;
    }

    public Wunsch(int a, int b){
        this.wID = a;
        this.uID = b;
        this.isW = true;
    }

    //main constructor
    public Wunsch(int a, int b, String t){
        this.wID = a;
        this.uID = b;
        this.Text = t;
    }

    public Wunsch(int a, int b, int c){
        this.wID = a;
        this.uID = b;
        this.eID = c;
        this.isW = true;
    }

    public Wunsch(int a, int b, int c, String t){
        this.wID = a;
        this.uID = b;
        this.eID = c;
        this.Text = t;
        this.isW = true;
    }

    // wenn bestätigt
    public void isV(){
        isW = false;
    }

    public void setisW(boolean q){
        this.isW = q;
    }

    public boolean getisW(){
        return isW;
    }

    // Text

    public void setText(String t){
        this.Text = t;
    }

    public  String getText(){
        return Text;
    }

}
