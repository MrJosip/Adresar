package hr.josip.adresar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.josip.adresar.model.Osoba;
import hr.josip.adresar.repository.OsobaRepository;

@Service
public class OsobaService {

	@Autowired
	OsobaRepository osobaRepository;

	public List<Osoba> getAllOsoba() {
		List<Osoba> osobe = new ArrayList<Osoba>();
		osobaRepository.findAll().forEach(osoba -> osobe.add(osoba));
		return osobe;
	}

	public Osoba getOsobaById(int ID_osoba) {
		return osobaRepository.findById(ID_osoba).get();
	}

	public void saveOrUpdate(Osoba osoba) {
		osobaRepository.save(osoba);
	}

	public void delete(int ID_osoba) {
		osobaRepository.deleteById(ID_osoba);
	}
}
