package pe.edu.upeu.exa3.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exa3.dao.UsuarioDao;
import pe.edu.upeu.exa3.entity.Usuario;
import pe.edu.upeu.exa3.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public Usuario validarUsuario(String nomuser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> datosUsuario(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
