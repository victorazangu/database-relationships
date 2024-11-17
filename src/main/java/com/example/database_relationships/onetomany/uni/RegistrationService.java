package com.example.database_relationships.onetomany.uni;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }
    public Registration getRegistration(int id) {
        return registrationRepository.findById(id).get();
    }

    public Registration addRegistration(Registration registration) {
        registration.setId(0);
        return registrationRepository.save(registration);
    }

    public void deleteRegistration(int id) {
        registrationRepository.deleteById(id);
    }
}
