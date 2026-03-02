package ma.enset.tp2_springmvc.repository;

import ma.enset.tp2_springmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
