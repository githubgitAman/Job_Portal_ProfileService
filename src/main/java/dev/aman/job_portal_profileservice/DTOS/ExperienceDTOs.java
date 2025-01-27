package dev.aman.job_portal_profileservice.DTOS;

import lombok.Data;
import java.time.LocalDateTime;


@Data
public class ExperienceDTOs {
    private String title;
    private String companyName;
    private String location;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;
}
