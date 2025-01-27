package dev.aman.job_portal_profileservice.DTOS;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
public class CertificateDTOs {
    private String name;
    private String issuer;
    private LocalDateTime issuedOn;
    private String certificateId;
}
