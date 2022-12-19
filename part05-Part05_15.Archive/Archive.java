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
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }

        if(!(compared instanceof Archive)) {
            return false;
        }

        Archive comparedArchive = (Archive) compared;

        return this.id.equals(comparedArchive.id);
    }

    @Override
    public String toString() {
        return this.id + ": " + this.title;
    }
}