package hr.josip.adresar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.josip.adresar.model.Broj;
import hr.josip.adresar.repository.BrojRepository;

@Service
public class BrojService {

	@Autowired
	BrojRepository brojRepository;

	public List<Broj> getAllBroj() {
		List<Broj> brojevi = new ArrayList<Broj>();
		brojRepository.findAll().forEach(broj -> brojevi.add(broj));
		return brojevi;
	}

	public Broj getBrojByBroj(String broj) {
		return brojRepository.findById(broj).get();
	}

	public void saveOrUpdate(Broj broj) {
		brojRepository.save(broj);
	}

	public void delete(String broj) {
		brojRepository.deleteById(broj);
	}

}
