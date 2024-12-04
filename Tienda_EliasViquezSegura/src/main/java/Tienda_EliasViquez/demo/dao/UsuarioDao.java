package Tienda_EliasViquez.demo.dao;

import Tienda_EliasViquez.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC MASTER
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
