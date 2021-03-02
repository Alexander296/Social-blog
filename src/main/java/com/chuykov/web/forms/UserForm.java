package com.chuykov.web.forms;

import lombok.Data;

@Data
public class UserForm {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
