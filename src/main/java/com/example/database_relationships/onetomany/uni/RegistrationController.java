package com.example.database_relationships.onetomany.uni;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public List<Registration> allRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/{id}")
    public Registration getRegistration(@PathVariable int id) {
        return registrationService.getRegistration(id);
    }

    @PostMapping
    public Registration getRegistration(@RequestBody Registration registration) {
        return registrationService.addRegistration(registration);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable int id) {
        registrationService.deleteRegistration(id);
    }

}
