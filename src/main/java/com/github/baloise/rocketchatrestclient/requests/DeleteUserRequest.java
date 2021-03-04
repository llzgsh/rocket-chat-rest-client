package com.github.baloise.rocketchatrestclient.requests;

public class DeleteUserRequest {

    private String username;

    public DeleteUserRequest(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
