package hr.josip.adresar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hr.josip.adresar.model.Broj;

import hr.josip.adresar.service.BrojService;

@RestController
public class BrojController {

	@Autowired
	BrojService brojService;

	@GetMapping("/broj")
	private List<Broj> getAllBroj() {
		return brojService.getAllBroj();
	}

	@GetMapping("/broj/{broj}")
	private Broj getBroj(@PathVariable("broj") String broj) {
		return brojService.getBrojByBroj(broj);
	}

	@DeleteMapping("/broj/{broj}")
	private void deleteBroj(@PathVariable("broj") String broj) {
		brojService.delete(broj);
	}

	@PostMapping("/broj")
	private String saveBroj(@RequestBody Broj broj) {
		brojService.saveOrUpdate(broj);
		return broj.getBroj();
	}
}
