package com.github.baloise.rocketchatrestclient;

import java.io.IOException;

import com.github.baloise.rocketchatrestclient.model.User;
import com.github.baloise.rocketchatrestclient.requests.*;

public class RocketChatRestApiV1Users {
    private static final String USER_ID_PARAM_KEY = "userId";
    private RocketChatClientCallBuilder callBuilder;

    protected RocketChatRestApiV1Users(RocketChatClientCallBuilder callBuilder) {
        this.callBuilder = callBuilder;
    }
    
    /**
     * Gets the first number of users from the Rocket.Chat server, the amount
     * depends on what the server has configured to return as the default count
     * with the default being 50.
     *
     * @return an array of {@link User}s
     * @throws IOException
     *             is thrown if there was a problem connecting, including if the
     *             result wasn't successful
     */
    public User[] list() throws IOException {
        RocketChatClientResponse res = this.callBuilder.buildCall(RocketChatRestApiV1.UsersList);

        if (!res.isSuccessful())
            throw new IOException("The call to get the Users was unsuccessful: \"" + res.getError() + "\"");

        if (!res.hasUsers())
            throw new IOException("Get User Information failed to retrieve the users.");

        return res.getUsers();
    }

    /**
     * Retrieves a {@link User} from the Rocket.Chat server.
     *
     * @param userId
     *            of the user to retrieve
     * @return an instance of the {@link User}
     * @throws IOException
     *             is thrown if there was a problem connecting, including if the
     *             result wasn't successful or there is no user
     */
    public User getInfo(String userId) throws IOException {
        RocketChatClientResponse res = this.callBuilder.buildCall(RocketChatRestApiV1.UsersInfo, new RocketChatQueryParams(USER_ID_PARAM_KEY, userId));

        if (!res.isSuccessful())
            throw new IOException("The call to get the User's Information was unsuccessful: \"" + res.getError() + "\"");

        if (!res.hasUser())
            throw new IOException("Get User Information failed to retrieve a user.");

        return res.getUser();
    }


    public User create(CreateUserRequest createUserRequest) throws IOException {
        RocketChatClientResponse res = this.callBuilder.buildCall(RocketChatRestApiV1.UsersCreate, null, createUserRequest);

        if (!res.isSuccessful())
            throw new IOException("The call to create the User's was unsuccessful: \"" + res.getError() + "\"");

        if (!res.hasUser())
            throw new IOException("Get User Information failed to retrieve a user.");

        return res.getUser();
    }

    public String createAuthToken(UserIdRequest userIdRequest) throws IOException {
        RocketChatClientResponse res = this.callBuilder.buildCall(RocketChatRestApiV1.UsersCreateToken, null, userIdRequest);

        if (!res.isSuccessful())
            throw new IOException("The call to create the User's was unsuccessful: \"" + res.getError() + "\"");

        if (!res.hasAuthData())
            throw new IOException("Get User Information failed to retrieve a user.");

        return res.getData().getAuthToken();
    }

    public void setActiveStatus(SetActiveStatusRequest setActiveStatusRequest) throws IOException {
        RocketChatClientResponse res = this.callBuilder.buildCall(RocketChatRestApiV1.UsersSetActiveStatus, null, setActiveStatusRequest);

        if (!res.isSuccessful())
            throw new IOException("The call to Set Active Status was unsuccessful: \"" + res.getError() + "\"");

    }

    public void update(UpdateUserRequest updateUserRequest) throws IOException {
        RocketChatClientResponse res = this.callBuilder.buildCall(RocketChatRestApiV1.UsersUpdate, null, updateUserRequest);

        if (!res.isSuccessful())
            throw new IOException("The call to Set Active Status was unsuccessful: \"" + res.getError() + "\"");

    }

    public void delete(DeleteUserRequest deleteUserRequest) throws IOException {
        RocketChatClientResponse res = this.callBuilder.buildCall(RocketChatRestApiV1.UsersDelete, null, deleteUserRequest);

        if (!res.isSuccessful())
            throw new IOException("The call to Set Active Status was unsuccessful: \"" + res.getError() + "\"");

    }
}
