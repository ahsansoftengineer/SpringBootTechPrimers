package com.springboot.techprimerz.b_swagger;

import io.swagger.annotations.ApiModelProperty;

public class SwaggerUser {
    @ApiModelProperty("Ahsan Not Auto Generated ID")
    private int id;

    private String name;
    @ApiModelProperty("Ahsan (Male, Female, Others)")
    private String gender;

    public SwaggerUser() {
    }

    public SwaggerUser(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "SwaggerUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
