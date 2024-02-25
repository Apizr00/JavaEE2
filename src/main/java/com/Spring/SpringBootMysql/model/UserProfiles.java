package com.Spring.SpringBootMysql.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "user_profiles")
public class UserProfiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private Long user_id;

    @NotBlank
    private String first_name;

    @NotBlank
    private String last_name;

    @NotBlank
    private String bio;

    @NotBlank
    private String avatar_url;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUser_Id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getUser_Id() {
        return user_id;
    }

    public void setFirst_Name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_Name() {
        return first_name;
    }

    public void setLast_Name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_Name() {
        return last_name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

}
