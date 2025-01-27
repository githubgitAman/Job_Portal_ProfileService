package dev.aman.job_portal_profileservice.DTOS;

import dev.aman.job_portal_profileservice.Models.Profile;
import lombok.Data;


import java.util.List;

@Data
public class ProfileDTOs {
    private String email;
    private String jobTitle;
    private String jobDescription;
    private String companyName;
    private String location;
    private String about;
    private List<String> skills;
    private List<ExperienceDTOs> experiences;
    private List<CertificateDTOs> certificates;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<ExperienceDTOs> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<ExperienceDTOs> experiences) {
        this.experiences = experiences;
    }

    public List<CertificateDTOs> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<CertificateDTOs> certificates) {
        this.certificates = certificates;
    }

    public Profile profileDTOsToProfile(){
        Profile profile = new Profile();
        profile.setEmail(this.email);
        profile.setJobTitle(this.jobTitle);
        profile.setJobDescription(this.jobDescription);
        profile.setCompanyName(this.companyName);
        profile.setLocation(this.location);
        profile.setAbout(this.about);
        profile.setSkills(this.skills);
        profile.setExperiences(this.experiences);
        profile.setCertificates(this.certificates);
        return profile;
    }
}
