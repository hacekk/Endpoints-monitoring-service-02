package com.monitoringService.Endpointsmonitoringservice02.service;

import com.monitoringService.Endpointsmonitoringservice02.model.User;
import com.monitoringService.Endpointsmonitoringservice02.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
