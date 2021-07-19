package hr.josip.adresar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hr.josip.adresar.model.Mjesto;

import hr.josip.adresar.service.MjestoService;

@RestController
public class MjestoController {

	@Autowired
	MjestoService mjestoService;

	@GetMapping("/mjesto")
	private List<Mjesto> getAllMjesto() {
		return mjestoService.getAllMjesto();
	}

	@GetMapping("/mjesto/{postanskiBr}")
	private Mjesto getMjesto(@PathVariable("postanskiBr") int postanskiBr) {
		return mjestoService.getMjestoByPostanskiBr(postanskiBr);
	}

	@DeleteMapping("/mjesto/{postanskiBr}")
	private void deleteMjesto(@PathVariable("postanskiBr") int postanskiBr) {
		mjestoService.delete(postanskiBr);
	}

	@PostMapping("/mjesto")
	private int saveMjesto(@RequestBody Mjesto mjesto) {
		mjestoService.saveOrUpdate(mjesto);
		return mjesto.getPostanskiBr();
	}
	//--

}
