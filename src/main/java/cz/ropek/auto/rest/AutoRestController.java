package cz.ropek.auto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.ropek.auto.entity.Auto;
import cz.ropek.auto.service.AutoService;

@RestController
@RequestMapping("/api")
public class AutoRestController {

	@Autowired
	private AutoService autoService;

	@GetMapping("/autos")
	public List<Auto> findAll() {
		return autoService.findAll();
	}

	@GetMapping("/autos/{autoid}")
	public Auto getAuto(@PathVariable int autoid) {

		Auto auto = autoService.findById(autoid);

		if (auto == null) {
			throw new RuntimeException("Auto id not found - " + autoid);
		}

		return auto;
	}

	@PostMapping("/autos")
	public Auto addAuto(@RequestBody Auto auto) {

		auto.setId(0);

		autoService.save(auto);

		return auto;
	}

	@PutMapping("/autos")
	public Auto updateAuto(@RequestBody Auto auto) {

		autoService.save(auto);

		return auto;
	}

	@DeleteMapping("/autos/{autoid}")
	public String deleteAuto(@PathVariable int autoid) {

		Auto auto = autoService.findById(autoid);

		if (auto == null) {
			throw new RuntimeException("Auto id not found - " + autoid);
		}

		autoService.deleteById(autoid);

		return "Deleted Auto id - " + autoid;
	}

}
