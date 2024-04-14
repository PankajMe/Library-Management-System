public class User {

    private String name;
    private String id;
    private String bookName;
    private String bookId;

    public User(String name, String id,String bookName,String bookId) {
        this.name = name;
        this.id = id;
        this.bookId=bookId;
        this.bookName=bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookId='" + bookId + '\'' +
                '}';
    }
}
