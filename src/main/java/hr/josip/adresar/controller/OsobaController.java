package hr.josip.adresar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hr.josip.adresar.model.Osoba;
import hr.josip.adresar.service.OsobaService;

@RestController
public class OsobaController {

	@Autowired
	OsobaService osobaService;

	@GetMapping("/osoba")
	private List<Osoba> getAllOsoba() {
		return osobaService.getAllOsoba();
	}

	@GetMapping("/osoba/{ID_osoba}")
	private Osoba getOsoba(@PathVariable("ID_osoba") int ID_osoba) {
		return osobaService.getOsobaById(ID_osoba);
	}

	@DeleteMapping("/osoba/{ID_osoba}")
	private void deleteOsoba(@PathVariable("ID_osoba") int ID_osoba) {
		osobaService.delete(ID_osoba);
	}

	@PostMapping("/osoba")
	private int saveOsoba(@RequestBody Osoba osoba) {
		osobaService.saveOrUpdate(osoba);
		return osoba.getID_osoba();
	}

}
