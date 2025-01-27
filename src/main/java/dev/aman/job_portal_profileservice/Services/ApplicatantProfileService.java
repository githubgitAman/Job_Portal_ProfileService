package dev.aman.job_portal_profileservice.Services;

import dev.aman.job_portal_profileservice.DTOS.ProfileDTOs;
import dev.aman.job_portal_profileservice.Models.Profile;
import org.springframework.stereotype.Service;

@Service("Applicants")
public class ApplicatantProfileService implements ProfileService{

    @Override
    public Long createProfile(String email) {
        Profile profile = new Profile();
        profile.setEmail(email);



        return 0L;
    }
}
