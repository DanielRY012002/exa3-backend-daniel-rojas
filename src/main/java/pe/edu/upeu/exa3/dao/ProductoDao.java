package pe.edu.upeu.exa3.dao;
import java.util.Map;
import pe.edu.upeu.exa3.entity.Producto;
public interface ProductoDao {
	int create(Producto r);
	int update(Producto r);
	int update(int id);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}