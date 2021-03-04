package com.github.baloise.rocketchatrestclient.requests;

public class UpdateUserRequest {

    private String userId;
    private Data data;

    public UpdateUserRequest(String userId, Data data) {
        this.userId = userId;
        this.data = data;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Data getData() {
        return data;
    }

    public void setDate(Data data) {
        this.data = data;
    }

    public static class Data{
        private String email;
        private String name;
        private String password;
        private String username;
        private Boolean active;
        private String[] roles;
        private Boolean joinDefaultChannels;
        private Boolean requirePasswordChange;
        private Boolean sendWelcomeEmail;
        private Boolean verified;


        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

        public String[] getRoles() {
            return roles;
        }

        public void setRoles(String[] roles) {
            this.roles = roles;
        }

        public Boolean getJoinDefaultChannels() {
            return joinDefaultChannels;
        }

        public void setJoinDefaultChannels(Boolean joinDefaultChannels) {
            this.joinDefaultChannels = joinDefaultChannels;
        }

        public Boolean getRequirePasswordChange() {
            return requirePasswordChange;
        }

        public void setRequirePasswordChange(Boolean requirePasswordChange) {
            this.requirePasswordChange = requirePasswordChange;
        }

        public Boolean getSendWelcomeEmail() {
            return sendWelcomeEmail;
        }

        public void setSendWelcomeEmail(Boolean sendWelcomeEmail) {
            this.sendWelcomeEmail = sendWelcomeEmail;
        }

        public Boolean getVerified() {
            return verified;
        }

        public void setVerified(Boolean verified) {
            this.verified = verified;
        }
    }
}
