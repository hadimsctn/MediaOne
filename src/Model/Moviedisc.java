package Model;

public class Moviedisc extends Product {
    private String director;
    private String writer;
    private String[] actor= new String[100];
    private int debutyear;
    private String production;

    public Moviedisc(int price, int purchaseprice, int amount, String director, String writer, String[] actor, int debutyear, String production) {
        super(price, purchaseprice, amount);
        this.director = director;
        this.writer = writer;
        this.actor = actor;
        this.debutyear = debutyear;
        this.production = production;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public int getDebutyear() {
        return debutyear;
    }

    public void setDebutyear(int debutyear) {
        this.debutyear = debutyear;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }
}
