package com.cowin.vaccination.controller;

import com.cowin.vaccination.dto.GenerateOtpRequest;
import com.cowin.vaccination.dto.GenerateOtpResponse;
import com.cowin.vaccination.service.IUserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/user-auth")
public class UserAuthController {

    @Autowired
    private IUserAuthentication userAuthentication;

    @PostMapping(value = "/generate-otp.php", consumes = "application/json", produces = "application/json")
    public GenerateOtpResponse generateOtp(@RequestBody Map<String, String> otp) {
        return userAuthentication.generateOtp(otp);
    }

}
