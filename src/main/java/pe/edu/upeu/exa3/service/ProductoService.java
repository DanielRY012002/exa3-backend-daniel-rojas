package pe.edu.upeu.exa3.service;
import java.util.Map;
import pe.edu.upeu.exa3.entity.Producto;
public interface ProductoService {
	int create(Producto p);
	int update(Producto p);
	int update(int id);
	int delete(int id);
    Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
