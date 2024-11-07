package Tienda_EliasViquez.demo.dao;

import Tienda_EliasViquez.demo.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto, Long> {
    
}
