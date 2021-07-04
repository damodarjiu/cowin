package com.cowin.vaccination.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class GenerateOtpRequest {
    private String mobile;
}
