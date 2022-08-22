package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Ventas;

public interface IVentasDAO extends JpaRepository<Ventas, Integer> {

}
