package E1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import com.example.NotificationService;

public class PasswordValidatorTest {
  @Test
  public void PasswordValidator() {
    String password = "grgareargeW";
    // arrange
    NotificationService notificationService = mock(NotificationService.class);
    // arrange
    PasswordValidator validator = new PasswordValidator(notificationService);

    // Act
    boolean result = validator.isValidPassword(password);

    // Assert
    assertTrue(result);

    // verificacion de que notification hace lo que se espera
    verify(notificationService).sendNotification("Todo correcto");

  }

}
