package org.example;

import org.example.decoding.Dictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

public class DataMappingTest {
     private DataMapping dataMapping;

    @BeforeEach
    public void setUp() {
        dataMapping = new DataMapping();
    }

    @Test
    public void getValue_WithExistingKey_ReturnsCorrectValue() {
        // Arrange
        Dictionary key = Dictionary.KEY_22;

        // Act
        String value = dataMapping.getValue(key);

        // Assert
        assertEquals("b", value);
    }

    @Test
    public void getValue_WithKeyContainingMultipleDigits_ReturnsCorrectValue() {
        // Arrange
        Dictionary key = Dictionary.KEY_555;

        // Act
        String value = dataMapping.getValue(key);

        // Assert
        assertEquals("l", value);
    }

    @Test
    public void getValue_WithKeyContainingSingleDigit_ReturnsCorrectValue() {
        // Arrange
        Dictionary key = Dictionary.KEY_9;

        // Act
        String value = dataMapping.getValue(key);

        // Assert
        assertEquals("w", value);
    }

    @Test
    public void containsKey_WithExistingKey_ReturnsTrue() {
        // Arrange
        Dictionary key = Dictionary.KEY_666;

        // Act
        boolean result = dataMapping.containsKey(key);

        // Assert
        assertTrue(result);
    }


}
