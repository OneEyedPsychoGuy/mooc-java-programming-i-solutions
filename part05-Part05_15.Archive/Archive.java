public class Archive {    
    private String id;
    private String title;

    public Archive(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Archive && this.id.equals(((Archive) obj).id);
    }

    @Override
    public String toString() {
        return this.id + ": " + this.title;
    }
}