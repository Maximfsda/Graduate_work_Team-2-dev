package com.example.graduate_work_team2.service;

import com.example.graduate_work_team2.entity.User;

/**
 * Интерфейс сервиса для авторизации пользователя
 *
 * @author Одокиенко Екатерина
 */
public interface AuthorizationService {

    /**
     * @param userName - логин/email пользователя
     * @param password - пароль пользователя для входа в личный кабинет
     * @return
     */
    boolean login(String userName, String password);



}
