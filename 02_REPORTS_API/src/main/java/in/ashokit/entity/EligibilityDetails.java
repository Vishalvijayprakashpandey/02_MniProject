package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "ELIGIBILITY_DETAILS")
public class EligibilityDetails {
	
	@Id
	private Integer eligId;
	private String name;
	private Long Mobile;
	private String email;
	private Character gender;
	private Long ssn;
	private String planName;
	private String planStatuses;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private LocalDate createDate;
	private LocalDate updateDate;
	private String createdBy;
	private String updatedBy;
	
}
