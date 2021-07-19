package hr.josip.adresar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.josip.adresar.model.Mjesto;

import hr.josip.adresar.repository.MjestoRepository;

@Service
public class MjestoService {

	@Autowired
	MjestoRepository mjestoRepository;

	public List<Mjesto> getAllMjesto() {
		List<Mjesto> mjesta = new ArrayList<Mjesto>();
		mjestoRepository.findAll().forEach(mjesto -> mjesta.add(mjesto));
		return mjesta;
	}

	public Mjesto getMjestoByPostanskiBr(int postanskiBr) {
		return mjestoRepository.findById(postanskiBr).get();
	}

	public void saveOrUpdate(Mjesto mjesto) {
		mjestoRepository.save(mjesto);
	}

	public void delete(int postanskiBr) {
		mjestoRepository.deleteById(postanskiBr);
	}

}
