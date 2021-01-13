abstract class AbstractEntity {
    long  id;

    public AbstractEntity(long id) {
        this.id = id;
    }

    public AbstractEntity() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}