package Tienda_EliasViquez.demo.dao;

import Tienda_EliasViquez.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria, Long> {
    
}
