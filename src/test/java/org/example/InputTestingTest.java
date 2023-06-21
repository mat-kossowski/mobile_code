package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class InputTestingTest {
    private InputTesting inputTesting;

    @BeforeEach
    public void setUp() {
        inputTesting = new InputTesting();
    }

    @Test
    public void testValidateTheInput_WithValidInput_ReturnsTrue() {
        // Arrange
        String input = "12345";

        // Act
        boolean result = inputTesting.validateTheInput(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testValidateTheInput_WithInvalidInput_ReturnsFalse() {
        // Arrange
        String input = "12a45";

        // Act
        boolean result = inputTesting.validateTheInput(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testValidateTheInput_WithEmptyInput_ReturnsFalse() {
        // Arrange
        String input = "";

        // Act
        boolean result = inputTesting.validateTheInput(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testValidateTheInput_WithNullInput_ReturnsFalse() {
        // Arrange
        String input = null;

        // Act
        boolean result = inputTesting.validateTheInput(input);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testValidateTheInput_WithOnlySpaces_ReturnsTrue() {
        // Arrange
        String input = "     ";

        // Act
        boolean result = inputTesting.validateTheInput(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testValidateTheInput_WithMixedDigitsAndSpaces_ReturnsTrue() {
        // Arrange
        String input = "12 345  67";

        // Act
        boolean result = inputTesting.validateTheInput(input);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testValidateTheInput_WithSpecialCharacters_ReturnsFalse() {
        // Arrange
        String input = "12@45";

        // Act
        boolean result = inputTesting.validateTheInput(input);

        // Assert
        assertFalse(result);
    }
}
