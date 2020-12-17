package pe.edu.upeu.exa3.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exa3.dao.ProductoDao;
import pe.edu.upeu.exa3.entity.Producto;
import pe.edu.upeu.exa3.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService{
	@Autowired
	private ProductoDao productoDao;
	@Override
	public int create(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}
}