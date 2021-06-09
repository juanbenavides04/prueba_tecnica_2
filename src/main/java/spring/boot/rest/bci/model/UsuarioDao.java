package spring.boot.rest.bci.model;

import org.springframework.data.repository.CrudRepository;

import spring.boot.rest.bci.entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long>{
	
	public  Usuario findByNameAndPassword(String name, String password);
	public  Usuario findByName(String name);
}
