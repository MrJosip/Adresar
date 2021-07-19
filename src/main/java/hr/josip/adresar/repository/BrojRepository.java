package hr.josip.adresar.repository;

import org.springframework.data.repository.CrudRepository;

import hr.josip.adresar.model.Broj;

public interface BrojRepository extends CrudRepository<Broj, String>
{

}
