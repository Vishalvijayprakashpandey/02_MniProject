package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.EligibilityDetails;
import in.ashokit.repo.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	private EligibilityDetailsRepo repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		EligibilityDetails  entity3 = new EligibilityDetails();
		entity3.setEligId(1);
		entity3.setName("Vishal");
		entity3.setMobile(8696999284l);
		entity3.setGender('m');
		entity3.setSsn(8486969l);
		entity3.setPlanName("SNAP");
		entity3.setPlanStatuses("Approved");
		
		repo.save(entity3);
		
		EligibilityDetails  entity2 = new EligibilityDetails();
		entity2.setEligId(2);
		entity2.setName("Chetna");
		entity2.setMobile(959432864l);
		entity2.setGender('f');
		entity2.setSsn(56443546l);
		entity2.setPlanName("CCAP");
		entity2.setPlanStatuses("Deneid");
		
		repo.save(entity2);
		
		EligibilityDetails  entity4= new EligibilityDetails();
		entity4.setEligId(1);
		entity4.setName("Nimesh");
		entity4.setMobile(82374132002l);
		entity4.setGender('m');
		entity4.setSsn(85665644654321l);
		entity4.setPlanName("Medicaid");
		entity4.setPlanStatuses("Closed");
		
		repo.save(entity4);
	}

}