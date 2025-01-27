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
        profile.setJobTitle(ProfileDTOs.getJobTitle());


        return 0L;
    }
}
