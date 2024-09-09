package com.wipro.emaas.pbaportal.professional_claim.service;


import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.wipro.emaas.pbaportal.professional_claim.model.Claim;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProfessionalClaimService {
	private final RestClient client;
	
	public List<Claim> findAll() {
		
		List<Claim> claims = client.get()
				 .uri("/professional")
				.retrieve()
				.body(new ParameterizedTypeReference<List<Claim>>() {});
		
		
		return claims;
		
	}
	
	public Claim findById(String id){
		
		Claim claim = client.get()
				 .uri("/professional/{id}", id)
				.retrieve()
				.body(Claim.class);
			return claim;
	}

	public String create(Claim claim) {
		
		String response =	client.post()
				.uri("/professional")
				.contentType(MediaType.APPLICATION_JSON)
				.body(claim)
				.retrieve()
				.body(String.class);
		
			return response;
	}

	public Claim update(Integer id, Claim claim) {
		Claim response =	client.put()
				.uri("/professional/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.body(claim)
				.retrieve()
				.body(Claim.class);
		return response;
	}

	public void delete(Integer id) {
		client.delete()
			.uri("/professional/{id}", id)
			.retrieve()
			.toBodilessEntity();
	}

}
