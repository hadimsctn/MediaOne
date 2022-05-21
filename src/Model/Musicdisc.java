package Model;

public class Musicdisc extends Product{
    private String singerinformation;
    private String kindofmusic;
    private int debutyear;
    private String album;

    public Musicdisc(int price, int purchaseprice, int amount, String singerinformation, String kindofmusic, int debutyear, String album) {
        super(price, purchaseprice, amount);
        this.singerinformation = singerinformation;
        this.kindofmusic = kindofmusic;
        this.debutyear = debutyear;
        this.album = album;
    }

    public String getSingerinformation() {
        return singerinformation;
    }

    public void setSingerinformation(String singerinformation) {
        this.singerinformation = singerinformation;
    }

    public String getKindofmusic() {
        return kindofmusic;
    }

    public void setKindofmusic(String kindofmusic) {
        this.kindofmusic = kindofmusic;
    }

    public int getDebutyear() {
        return debutyear;
    }

    public void setDebutyear(int debutyear) {
        this.debutyear = debutyear;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
