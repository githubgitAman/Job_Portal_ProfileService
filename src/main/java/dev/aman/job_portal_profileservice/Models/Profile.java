package dev.aman.job_portal_profileservice.Models;

import com.fasterxml.jackson.databind.ser.Serializers;
import dev.aman.job_portal_profileservice.DTOS.CertificateDTOs;
import dev.aman.job_portal_profileservice.DTOS.ExperienceDTOs;
import dev.aman.job_portal_profileservice.DTOS.ProfileDTOs;
import jakarta.persistence.*;
import lombok.Data;

import java.security.cert.Certificate;
import java.util.List;

@Data
@Entity
public class Profile extends BaseModel {

    private String email;
    private String jobTitle;
    private String jobDescription;
    private String companyName;
    private String location;
    private String about;
    private List<String> skills;

    private List<ExperienceDTOs> experiences;
    @OneToMany
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

    public ProfileDTOs profileToProfileDTOs(){
        ProfileDTOs profileDTOs = new ProfileDTOs();
        profileDTOs.setEmail(this.email);
        profileDTOs.setJobTitle(this.jobTitle);
        profileDTOs.setJobDescription(this.jobDescription);
        profileDTOs.setCompanyName(this.companyName);
        profileDTOs.setLocation(this.location);
        profileDTOs.setAbout(this.about);
        profileDTOs.setSkills(this.skills);
        profileDTOs.setExperiences(this.experiences);
        profileDTOs.setCertificates(this.certificates);
        return profileDTOs;
    }
}
