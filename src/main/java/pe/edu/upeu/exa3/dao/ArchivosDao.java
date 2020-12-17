package pe.edu.upeu.exa3.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.exa3.entity.Archivos;

public interface ArchivosDao {
	int create(Archivos a);
	int update(Archivos a);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
}
