package Model;

public class Book extends Product{
    private String publishinghouse;
    private String author;
    private String bookcategory;

    public Book(int price, int purchaseprice, int amount, String publishinghouse, String author, String bookcategory) {
        super(price, purchaseprice, amount);
        this.publishinghouse = publishinghouse;
        this.author = author;
        this.bookcategory = bookcategory;
    }

    public String getPublishinghouse() {
        return publishinghouse;
    }

    public void setPublishinghouse(String publishinghouse) {
        this.publishinghouse = publishinghouse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(String bookcategory) {
        this.bookcategory = bookcategory;
    }
}
