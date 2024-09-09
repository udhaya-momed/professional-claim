package com.wipro.emaas.pbaportal.professional_claim.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class RestClientConfiguration {
	
	private final String BASE_URL = "http://emaas-claims-exp-api.us-e2.cloudhub.io/api/claims";
	
	@Bean
	public RestClient getRestClient() {
		return RestClient.builder()
				.baseUrl(BASE_URL)
				.defaultHeaders(httpHeaders -> {
		              httpHeaders.set("Content-Type", "application/json");
		              httpHeaders.set("client_id", "f86b9a8f79764a67a8b475c7a3adca38");
		              httpHeaders.set("client_secret", "6555c9501bd6417fAf4A84d051855abc");
		            })
				.build();
	}

}
