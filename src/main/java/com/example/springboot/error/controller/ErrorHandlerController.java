package com.example.springboot.error.controller;

import com.example.springboot.error.errors.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ErrorHandlerController {
    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticError(ArithmeticException exception, Model model) {
        model.addAttribute("error", "Arithmetic error");
        model.addAttribute("message", exception.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/generic";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatError(NumberFormatException exception, Model model) {
        model.addAttribute("error", "Error: Format number invalid");
        model.addAttribute("message", exception.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/number-format";
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String userNotFoundError(UserNotFoundException exception, Model model) {
        model.addAttribute("error", "Error: User not found");
        model.addAttribute("message", exception.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/user";
    }
}
