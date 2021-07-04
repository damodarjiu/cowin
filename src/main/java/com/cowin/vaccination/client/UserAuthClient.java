package com.cowin.vaccination.client;

import com.cowin.vaccination.dto.GenerateOtpRequest;
import com.cowin.vaccination.dto.GenerateOtpResponse;
import com.cowin.vaccination.util.RestInvocationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Component
public class UserAuthClient {

    @Value("${auth.otp.base-url}")
    private String otpBaseUrl;

    @Value("${auth.otp.root-url}")
    private String otpRootUrl;

    @Autowired
    RestInvocationUtil invocation;

    public GenerateOtpResponse generateOtp(Map<String, String> otpRequest) {
        String url = otpRootUrl + otpBaseUrl;
        return invocation.postForObject(url,  otpRequest, GenerateOtpResponse.class);
    }
}
