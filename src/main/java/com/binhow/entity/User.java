package com.binhow.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private int userId;
    private String userName;
    private Boolean userGender;
    private String userPassword;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date userBirth;
    private String userTel;
    private String userEmail;
    private String userPhoto;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date userRegistrationTime;
}
