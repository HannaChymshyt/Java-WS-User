package org.example.client;

import org.example.client.generated.UserService;
import org.example.client.generated.UserServiceImplService;
import org.example.client.generated.Gender;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {

    static UserServiceImplService service;
    static UserService userService;

    @BeforeAll
    static void setup() {
        service = new UserServiceImplService();
        userService = service.getUserServiceImplPort();
    }

    @Test
    void givenUserService_whenUserBuilder_thenPhoneIsPhone() {
        assertEquals("1-587-998-2856", userService.findByName("Gloria").getPhone());
    }

    @Test
    public void givenUserService_whenUserSteward_thenAgeCorrect() {
        assertEquals(60, userService.findByName("James").getAge());
    }

    @Test
    public void givenUserService_whenUserRanger_thenGenderFEMALE() {
        assertEquals(Gender.FEMALE, userService.findByName("Georgiana").getGender());
    }

}