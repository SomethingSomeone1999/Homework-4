import java.sql.SQLException;
import java.util.List;

public interface UserDAO<T> {
	boolean createTable()throws SQLException;
	boolean add(T t)throws SQLException;
	boolean update(T t)throws SQLException;
	boolean delete(String param)throws SQLException;
	T get(String param)throws SQLException;
	List<T> getAll()throws SQLException;
}
