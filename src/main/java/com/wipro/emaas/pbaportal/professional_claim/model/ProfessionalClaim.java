package com.wipro.emaas.pbaportal.professional_claim.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ProfessionalClaim {
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date receiptDate;
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
	
	private Date entryDate;
	private SubscriberInformation subscriberInformation;;
	private MemberInformation memberInformation;
	private MemberAuthorization memberAuthorization;
	private ReferringPractitionerInformation referringPractitionerInformation;
	

	private SupplierInformations supplierInformationList;
	
	private DiagnosisCode diagnosisCodes;
	
	private ServiceLineItems serviceLineItems;


}
