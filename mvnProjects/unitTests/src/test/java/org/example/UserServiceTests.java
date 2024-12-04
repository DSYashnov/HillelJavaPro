package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class UserServiceTests {

    @Test
    void getFullName () {
        User user = new User();
        user.setName("name");
        assertEquals ("name name", new UserCalculator().calculatorFullName(user.getName()));
    }

    @Test
    void getFullName_mock () {
        UserCalculator uc = mock(UserCalculator.class);
        User user = new User();
        user.setName("name");
        when(uc.calculatorFullName(eq("name"))).thenReturn("mock name");
        when(uc.calculatorFullName(eq("Stanislav"))).thenReturn("mock Stanislav");
        assertEquals ("mock name", uc.calculatorFullName(user.getName()));
        user.setName("Stanislav");
        assertEquals ("mock Stanislav", uc.calculatorFullName(user.getName()));

        when(uc.calculatorFullName(any())).thenReturn("mock name").thenReturn("mock ivan");
        assertEquals ("mock name", uc.calculatorFullName(user.getName()));
        assertEquals ("mock ivan", uc.calculatorFullName(user.getName()));


        verify(uc, times(4)).calculatorFullName(any());
        verify(uc, times(1)).calculatorFullName("name");
        verify(uc, times(3)).calculatorFullName("Stanislav");
    }

}
