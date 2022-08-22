package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.MaquinasRegistradoras;

public interface IMaquinasRegistradorasDAO extends JpaRepository<MaquinasRegistradoras, Integer> {

}
