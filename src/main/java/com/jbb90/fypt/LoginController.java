package com.jbb90.fypt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Handles login functionality for both students and advisors.
 * Displays the login page, processes login attempts, and toggles between student and advisor login modes.
 */
@Controller
public class LoginController {

    /**
     * Repository for student data access.
     */
    @Autowired
    private StudentRepository studentRepository;

    /**
     * Repository for advisor data access.
     */
    @Autowired
    AdvisorRepository advisorRepository;

    /**
     * Displays the login page. Shows either student or advisor login mode based on the 'advisor' query parameter.
     * If login fails, displays an error message.
     *
     * @param advisorMode true if advisor login mode, false for student login
     * @param error optional error message to display
     * @param model Spring MVC model for passing attributes to the view
     * @return the login page template
     */
    @GetMapping("/login")
    public String showLoginPage(
            @RequestParam(value = "advisor", required = false, defaultValue = "false") boolean advisorMode,
            @RequestParam(value = "error", required = false) String error,
            Model model) {
        model.addAttribute("advisorMode", advisorMode);
        if (error != null) {
            model.addAttribute("error", "Invalid email or password.");
        }
        return "login";
    }

    /**
     * Processes login form submissions. Checks credentials against the appropriate repository
     * (student or advisor) based on the advisorMode flag. Redirects to dashboard on success,
     * or returns to the login page with an error on failure.
     *
     * @param email the email entered by the user
     * @param password the password entered by the user
     * @param advisorMode true if advisor login mode, false for student login
     * @param model Spring MVC model for passing attributes to the view
     * @return redirect to dashboard on success, or login page with error on failure
     */
    @PostMapping("/do-login")
    public String processLogin(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam(value = "advisorMode", required = false, defaultValue = "false") boolean advisorMode,
            Model model) {
        boolean success = false;
        if (advisorMode) {
            // Check advisor credentials
            success = advisorRepository.findAll().stream()
                .anyMatch(a -> a.getEmail().equals(email) && a.getPassword().equals(password));
        } else {
            // Check student credentials
            System.out.println("All students in DB:");
            studentRepository.findAll().forEach(stu -> System.out.println(stu.getEmail() + " / " + stu.getPassword()));
            success = studentRepository.findAll().stream()
                .anyMatch(s -> s.getEmail().equals(email) && s.getPassword().equals(password));
        }

        if (success) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("advisorMode", advisorMode);
            model.addAttribute("error", "Invalid email or password.");
            return "login";
        }
    }
} 