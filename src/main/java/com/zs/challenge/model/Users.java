package com.zs.challenge;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "zsw_user")
public class Users {

    @Id
    @Basic
    @Column(name = "id", nullable = false)
    private BigInteger id;

    @Basic
    @Column(name = "login", nullable = false)
    private String login;

    @Basic
    @Column(name = "password_hash", nullable = false)
    private String first_name;

    @Basic
    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Basic
    @Column(name = "email", nullable = false)
    private String email;

    @Basic
    @Column(name = "image_url", nullable = false)
    private String image_url;

    @Basic
    @Column(name = "activated", nullable = false)
    private Boolean activated;

    @Basic
    @Column(name = "lang_key", nullable = false)
    private String lang_key;

    @Basic
    @Column(name = "activation_key", nullable = false)
    private String activation_key;

    @Basic
    @Column(name = "reset_key", nullable = false)
    private String reset_key;

    @Basic
    @Column(name = "created_by", nullable = false)
    private String created_by;

    @Basic
    @Column(name = "reset_date", nullable = false)
    private Date reset_date;

    @Basic
    @Column(name = "last_modified_by", nullable = false)
    private String last_modified_by;

    @Basic
    @Column(name = "last_modified", nullable = false)
    private Date last_modified;

    @Basic
    @Column(name = "is_deleted", nullable = false)
    private Boolean is_deleted;










}
