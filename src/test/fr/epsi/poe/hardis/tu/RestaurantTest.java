package fr.epsi.poe.hardis.tu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by medda on 28/02/2017.
 */
class RestaurantTest {


    public static final String STRING_N = "00336123456789";

    @Test
    public void testThatRestaurantIsOpenByDefault() {
        // Arrange
        Restaurant restaurant = new Restaurant();
        // Act
        boolean verifie = restaurant.isOuvert();
        // Assert
        Assertions.assertTrue(verifie);
    }

    @Test
    public  void conflit () {

            }

    @Test
    public void testThatValidPhoneNumberIsCorrectlySaved() {
        Restaurant restaurant = new Restaurant();
        String number = STRING_N;
        restaurant.setNumeroDeTelephone(number);
        Assertions.assertEquals(number, restaurant.getNumeroDeTelephone(), "");
    }

    @Test
    public void testThatInValidPhoneNumberIsNotSaved() {
        Restaurant restaurant = new Restaurant();
        String number = "006123456789";
        restaurant.setNumeroDeTelephone(number);
        Assertions.assertNotEquals(number, restaurant.getNumeroDeTelephone(), "");
    }

    @Test
    public void testThatRestaurantIsNotOpen() {
        // Arrange
        Restaurant restaurant = new Restaurant();
        // Act
        boolean verifie = restaurant.isOuvert();
        // Assert
        Assertions.assertFalse(verifie);
    }
}