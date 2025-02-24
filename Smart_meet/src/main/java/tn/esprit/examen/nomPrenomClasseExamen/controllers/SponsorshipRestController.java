package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene.Sponsorship;
import tn.esprit.examen.nomPrenomClasseExamen.services.ISponsorshipServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("Sponsorship")
@RestController
@Tag(name="hello")


public class SponsorshipRestController {
    private final ISponsorshipServices sponsorshipServices;


    @GetMapping("/ReadAllSponsorships")
    public List<Sponsorship> getAllSponsorship() {
        return sponsorshipServices.getAllSponsorship() ;
    }

    @GetMapping("/ReadSponsorshipByID/{id}")
    public Sponsorship getSponsorshipById(@PathVariable int id)  {
        return sponsorshipServices.getSponsorshipById(id);
    }

    @PostMapping("/CreateSponsorship")
    public Sponsorship CreateSponsorship(@RequestBody Sponsorship sponsorship) {
        return sponsorshipServices. CreateSponsorship(sponsorship);
    }

    @PutMapping("/UpdateSponsorship/{id}")
    public Sponsorship updateSponsorship(@PathVariable int id,@RequestBody Sponsorship sponsorship) {
        return sponsorshipServices.updateSponsorship(id, sponsorship);
    }

    @DeleteMapping("/DeleteSession/{id}")
    public void deleteSponsorship(@PathVariable int id) {
        sponsorshipServices.deleteSponsorship(id);
    }

}
