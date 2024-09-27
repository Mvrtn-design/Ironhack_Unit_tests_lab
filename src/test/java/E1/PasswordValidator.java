package E1;

import com.example.NotificationService;

public class PasswordValidator {
    private NotificationService notificationService;

    public PasswordValidator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public boolean isValidPassword(String password) {
        // The password must be at least 8 characters long.
        // The password must contain at least one uppercase letter.

        if (password.matches(".*[A-Z].*") && password.length() >= 8) {
            notificationService.sendNotification("Todo correcto");
            return true;
        }
        return false;

    }

}
