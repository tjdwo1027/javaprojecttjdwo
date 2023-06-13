package com.example.test.service;

import com.example.test.dto.SignInResultDto;
import com.example.test.dto.SignUpResultDto;

public interface SignService {

    SignUpResultDto signUp(String id, String password, String name, String email, String role);

    SignInResultDto signIn(String id, String password) throws RuntimeException;

}