package in.ashokit.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {
	
	private String planName;
	private String planStatus;
	private LocalDate planStarDate;
	private LocalDate planEndDate;

}
