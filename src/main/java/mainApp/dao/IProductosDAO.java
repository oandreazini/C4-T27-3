package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer> {

}
