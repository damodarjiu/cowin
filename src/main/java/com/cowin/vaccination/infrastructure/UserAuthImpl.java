package com.cowin.vaccination.infrastructure;

import com.cowin.vaccination.client.UserAuthClient;
import com.cowin.vaccination.dto.GenerateOtpRequest;
import com.cowin.vaccination.dto.GenerateOtpResponse;
import com.cowin.vaccination.service.IUserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserAuthImpl implements IUserAuthentication {
    @Autowired
    UserAuthClient userAuthClient;

    @Override
    public GenerateOtpResponse generateOtp(Map<String, String> otp) {
        return userAuthClient.generateOtp(otp);
    }
}
