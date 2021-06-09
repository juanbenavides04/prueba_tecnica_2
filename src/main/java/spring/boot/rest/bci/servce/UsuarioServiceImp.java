package spring.boot.rest.bci.servce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.rest.bci.entity.Usuario;
import spring.boot.rest.bci.model.UsuarioDao;

@Service
public class UsuarioServiceImp implements IUsuarioService{
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	public void delete(Long id) {

		usuarioDao.deleteById(id);
		
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).orElse(null);
	}


	

}
