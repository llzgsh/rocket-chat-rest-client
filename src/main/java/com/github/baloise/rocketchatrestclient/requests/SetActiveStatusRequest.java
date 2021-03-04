package com.github.baloise.rocketchatrestclient.requests;

public class SetActiveStatusRequest {

    private boolean activeStatus;
    private String userId;

    public SetActiveStatusRequest(boolean activeStatus, String userId) {
        this.activeStatus = activeStatus;
        this.userId = userId;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
