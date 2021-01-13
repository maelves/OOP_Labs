import java.util.List;

public interface AppService<T> {
    T create(T entity) throws ValidationFailedException;
    List<T> search(String key);
    boolean delete(T entity) throws ProductNotFoundException;
}