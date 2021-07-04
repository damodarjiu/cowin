package com.cowin.vaccination.service;

import com.cowin.vaccination.dto.GenerateOtpRequest;
import com.cowin.vaccination.dto.GenerateOtpResponse;

import java.util.Map;

public interface IUserAuthentication {


    GenerateOtpResponse generateOtp(Map<String, String> otp);
}
