public class book {
    private int id;
    private String title;
    private String author;
    private String category;
    private String publisher;
    private int year;
    public  book(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public book(int id, String title, String author, String category, String publisher, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publisher=publisher;
        this.year=year;

    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", category='" + category + '\'' +
                ", publiser='" + publisher+
                ", year='" + year+'\''+'}';




    }
}
