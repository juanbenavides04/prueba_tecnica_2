package spring.boot.rest.bci.servce;

import java.util.List;

import spring.boot.rest.bci.entity.Usuario;



public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
	
	public Usuario findById(Long id);
	


}
