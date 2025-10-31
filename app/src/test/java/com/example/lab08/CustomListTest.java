package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "Alberta");
        list.delete(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    void testDeleteException() {
        CustomList list = new CustomList();
        City toronto = new City("Toronto", "Ontario");

        // Verify that deleting a city not in the list throws an exception
        assertThrows(IllegalArgumentException.class, () -> {
            list.delete(toronto);
        });
    }

    @Test
    void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        City vancouver = new City("Vancouver", "British Columbia");
        list.addCity(vancouver);
        assertEquals(1, list.countCities());
    }


}
