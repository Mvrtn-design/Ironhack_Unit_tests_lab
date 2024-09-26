package E1;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Validator {
    @Test
    public void shouldReturnTrueForStringWithEightCharacters() {
        // Arrange
        StringValidator validator = new StringValidator();

        // Act
        boolean result = validator.hasEightCharacters("EightChar");

        // Assert
        assertTrue(result); // Test will fail because the hasEightCharacters method is not yet implemented
    }

}
