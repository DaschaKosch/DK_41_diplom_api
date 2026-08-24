package tests;

import models.login.*;
import models.registration.RegistrationBodyModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.*;

public class LoginTests extends TestBase {

    TestData td = new TestData();

    @DisplayName("Успешная авторизация пользователя")
    @Test
    public void successfulLoginTest() {

        api.registration.registerUser(new RegistrationBodyModel(td.username, td.password));
        SuccessfulLoginResponseRecordsModel response = api.login.login(
                new LoginBodyRecordsModel(td.username, td.password)
        );

        step("Проверка бизнес-логики: валидация access и refresh токенов", () -> {
            String expectedTokenPath = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
            assertThat(response.access()).isNotEmpty();
            assertThat(response.refresh()).isNotEmpty();
            assertThat(response.access()).startsWith(expectedTokenPath);
            assertThat(response.refresh()).startsWith(expectedTokenPath);
            assertThat(response.access()).isNotEqualTo(response.refresh());
        });
    }

    @DisplayName("Неуспешная авторизация (неверный пароль): негативный тест")
    @Test
    public void wrongCredentialsLoginTest() {

        WrongCredentialsLoginResponseRecordsModel response = api.login.loginWithWrongPassword(
                new LoginBodyRecordsModel(td.username, td.wrongPassword)
        );
        step("Проверка бизнес-логики: валидация ошибки неверных учетных данных", () -> {
            assertThat(response.detail()).isEqualTo(EXPECTED_ERROR_INVALID_USERNAME_OR_PASSWORD);
        });
    }

    @DisplayName("Обновление токена без refresh: негативный тест")
    @Test
    public void emptyRefreshTokenLoginTest() {

        EmptyRefreshTokenLoginResponseModel response = api.login.refreshWithoutToken(
                new EmptyRefreshTokenLoginBodyModel()
        );

        step("Проверка бизнес-логики: валидация ошибки отсутствия refresh-токена", () -> {
            assertThat(response.refresh().get(0)).isEqualTo(EXPECTED_REQUIRED_FIELD);
        });
    }

    @DisplayName("Обновление токена с невалидным refresh: негативный тест")
    @Test
    public void wrongRefreshTokenLoginTest() {

        WrongRefreshTokenLoginResponseModel response = api.login.refreshWithInvalidToken(
                new WrongRefreshTokenLoginBodyModel(td.invalidToken)
        );

        step("Проверка бизнес-логики: валидация ошибки невалидного refresh-токена", () -> {
            assertThat(response.detail()).isEqualTo(EXPECTED_ERROR_VALID_TOKEN);
            assertThat(response.code()).isEqualTo(EXPECTED_TOKEN_NOT_VALID_CODE);
        });
    }

}
