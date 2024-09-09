package com.wipro.emaas.pbaportal.professional_claim.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ServiceLineItem {
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	private String placeOfServiceCode;
	private String serviceCode;
	private String serviceFee;
	private String serviceUnitCount;
	private String renderingProviderFirstName;
	private String renderingProviderLastName;
	private String otherRenderingProviderId;
	private DiagnosisCodePointer diagnosisCodePointers;

}
