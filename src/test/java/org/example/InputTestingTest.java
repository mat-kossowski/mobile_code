package org.example;

import org.example.tests.InputTesting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class InputTestingTest {
     private InputTesting inputTesting;

    @BeforeEach
    public void setUp() {
        inputTesting = new InputTesting("");
    }

    @Test
    public void validateTheInput_WithValidDigitsOnly_ReturnsTrue() {
        // Arrange
        String input = "12345";
        inputTesting = new InputTesting(input);

        // Act
        boolean result = inputTesting.validateTheInput();

        // Assert
        assertTrue(result);
    }

    @Test
    public void validateTheInput_WithInvalidCharacter_ReturnsFalse() {
        // Arrange
        String input = "12a45";
        inputTesting = new InputTesting(input);

        // Act
        boolean result = inputTesting.validateTheInput();

        // Assert
        assertFalse(result);
    }

    @Test
    public void validateTheInput_WithEmptyInput_ReturnsFalse() {
        // Arrange
        String input = "";
        inputTesting = new InputTesting(input);

        // Act
        boolean result = inputTesting.validateTheInput();

        // Assert
        assertFalse(result);
    }

    @Test
    public void validateTheInput_WithNullInput_ReturnsFalse() {
        // Arrange
        inputTesting = new InputTesting(null);

        // Act
        boolean result = inputTesting.validateTheInput();

        // Assert
        assertFalse(result);
    }

    @Test
    public void validateTheInput_WithOnlySpaces_ReturnsTrue() {
        // Arrange
        String input = "     ";
        inputTesting = new InputTesting(input);

        // Act
        boolean result = inputTesting.validateTheInput();

        // Assert
        assertTrue(result);
    }

    @Test
    public void validateTheInput_WithMixedDigitsAndSpaces_ReturnsTrue() {
        // Arrange
        String input = "12 345  67";
        inputTesting = new InputTesting(input);

        // Act
        boolean result = inputTesting.validateTheInput();

        // Assert
        assertTrue(result);
    }

    @Test
    public void validateTheInput_WithSpecialCharacters_ReturnsFalse() {
        // Arrange
        String input = "12@45";
        inputTesting = new InputTesting(input);

        // Act
        boolean result = inputTesting.validateTheInput();

        // Assert
        assertFalse(result);
    }
}
