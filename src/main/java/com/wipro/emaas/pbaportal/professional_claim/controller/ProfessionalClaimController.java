package com.wipro.emaas.pbaportal.professional_claim.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.emaas.pbaportal.professional_claim.model.Claim;
import com.wipro.emaas.pbaportal.professional_claim.service.ProfessionalClaimService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RestController
@AllArgsConstructor
@Getter
@Setter
@RequestMapping("/api/claims/professional")
public class ProfessionalClaimController {
	
private final ProfessionalClaimService professionalClaimService;
	
	@GetMapping("")
	private List<Claim> findAll() {
		
		return professionalClaimService.findAll();
	}


	@GetMapping("/{id}")
	private Claim findById(@PathVariable String id) {
		return professionalClaimService.findById(id);
	}
	
	@PostMapping(path="", consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	private String create(@RequestBody Claim claim) {
		System.out.println(claim.toString());
		return professionalClaimService.create(claim);
	}
	
	@PutMapping("/{id}")
	private Claim update(@PathVariable Integer id, @RequestBody Claim claim) {
		return professionalClaimService.update(id, claim);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	private void delete(@PathVariable Integer id) {
		professionalClaimService.delete(id);
	}
	
}
