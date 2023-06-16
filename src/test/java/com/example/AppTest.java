package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPenjumlahan() {
        double angka1 = 5.0;
        double angka2 = 3.0;
        double expected = 8.0;

        double actual = penjumlahan(angka1, angka2);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testPengurangan() {
        double angka1 = 5.0;
        double angka2 = 3.0;
        double expected = 2.0;

        double actual = pengurangan(angka1, angka2);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testPerkalian() {
        double angka1 = 5.0;
        double angka2 = 3.0;
        double expected = 15.0;

        double actual = perkalian(angka1, angka2);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testPembagian() {
        double angka1 = 6.0;
        double angka2 = 3.0;
        double expected = 2.0;

        double actual = pembagian(angka1, angka2);

        assertEquals(expected, actual, 0.0001);
    }

    private double penjumlahan(double angka1, double angka2) {
        return angka1 + angka2;
    }

    private double pengurangan(double angka1, double angka2) {
        return angka1 - angka2;
    }

    private double perkalian(double angka1, double angka2) {
        return angka1 * angka2;
    }

    private double pembagian(double angka1, double angka2) {
        return angka1 / angka2;
    }
}
