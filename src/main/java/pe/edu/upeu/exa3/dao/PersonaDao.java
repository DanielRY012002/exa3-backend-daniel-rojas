package pe.edu.upeu.exa3.dao;
import java.util.Map;
import pe.edu.upeu.exa3.entity.Persona;
public interface PersonaDao {
	int create(Persona r);
	int update(Persona r);
	int update(int id);
	int delete(int id);
	Persona read(int id);
	Map<String, Object> readAll();
}