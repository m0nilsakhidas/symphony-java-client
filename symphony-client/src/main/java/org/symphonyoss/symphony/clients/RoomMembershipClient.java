package org.symphonyoss.symphony.clients;

import org.symphonyoss.exceptions.SymException;
import org.symphonyoss.symphony.pod.model.MembershipList;

/**
 * Created by Frank Tarsillo on 6/12/2016.
 */
public interface RoomMembershipClient {

    /**
     * Provides room membership
     * @param roomStreamId
     *          - stream-id of the chat room you want to add the member to
     * @return
     *        {@link MembershipList}
     * @throws SymException Exceptions from API calls into Symphony
     */
    MembershipList getRoomMembership(String roomStreamId) throws SymException;
    
    /**
     * Call this method to add a member to a chat room. Pass in two parameters - chat-room stream-id and user-id
     * 
     * @param roomStreamId
     *            - stream-id of the chat room you want to add the member to
     * @param userId
     *            userId for the user in Symphony
     * @throws Exception
     *             throws an {@link org.symphonyoss.symphony.pod.invoker.ApiException} if there were any issues while invoking the endpoint,
     *             {@link IllegalArgumentException} if the arguments were wrong, {@link IllegalStateException} if the
     *             session-token is null
     */
    public void addMemberToRoom(String roomStreamId, long userId) throws Exception;
}