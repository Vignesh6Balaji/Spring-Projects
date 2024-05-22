package com.bootjpa.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.bootjpa.Repo.AlienRepo;
import com.bootjpa.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	
	  @RequestMapping("/") 
	  public String alien() { 
		  return "alien.jsp"; 
	  }
	 
	
	@PostMapping("addAlien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien); 
		return alien;
	}
	
	@GetMapping("getAlien")
	public ModelAndView getAlien(@RequestParam int aId) {
		ModelAndView mv=new ModelAndView("showalien.jsp");
		Alien alien=repo.findById(aId).orElse(new Alien());
		mv.addObject(alien);
		/*
		 * System.out.println(repo.findByaName("Vignesh"));
		 * System.out.println(repo.findByaIdGreaterThan(aId));
		 */
		return mv;
	}
	
	@GetMapping(path = "getAliens", produces = {"application/xml","application/json"})
	public List<Alien> getAliens() {
		return repo.findAll();
	}
	
	@GetMapping("/aliens/{aId}")
	public Optional<Alien> aliens(@PathVariable("aId") int aId) {
		return repo.findById(aId);
	}

    @PutMapping("/updateAlien")
    public Alien updateAlien(@RequestBody Alien alien) {
    	repo.save(alien);
    	return alien;
    }

	@DeleteMapping("/deleteAlien/{aId}")
    public String deleteAlien(@PathVariable int aId) {
    	Optional<Alien> optional = repo.findById(aId);
    	if(optional.isPresent()) {
    		Alien alien = optional.get();
    		repo.delete(alien);
    	}
    	return "Alien deleted";
    }
}
