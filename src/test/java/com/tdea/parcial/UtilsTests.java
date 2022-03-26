package com.tdea.parcial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UtilsTests {

    @Test
    public void horadiatransformartextoNigth() {
        int hora = 4;
        String result = Utils.getTimeOfDay(hora);
        assertEquals("Night", result);
    }
    @Test
    public void horadiatransformartextoMorning() {
        int hora = 8;
        String result = Utils.getTimeOfDay(hora);
        assertEquals("Morning", result);
    }
    @Test
    public void horadiatransformartextoAfternoon() {
        int hora = 16;
        String result = Utils.getTimeOfDay(hora);
        assertEquals("Afternoon", result);
    }
    @Test
    public void horadiatransformartextoEvening() {
        int hora = 22;
        String result = Utils.getTimeOfDay(hora);
        assertEquals("Evening", result);
    }
    @Test
    public void horadiatransformartextoInvalido() {
        int hora = 28;
        boolean result = Utils.isValidHour(hora);
        assertFalse(result);
    }


    }


