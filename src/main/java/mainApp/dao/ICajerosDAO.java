package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Cajeros;

public interface ICajerosDAO extends JpaRepository<Cajeros, Integer> {

}
