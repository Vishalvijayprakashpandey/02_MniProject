package in.ashokit.response;

import lombok.Data;

@Data
public class SearchResponse {
	
	private Integer eligId;
	private String name;
	private Long Mobile;
	private String email;
	private Character gender;
	private Long ssn;

}
