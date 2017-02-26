package com.ebanker.dao;

import com.ebanker.domain.EbankerUser;
import com.ebanker.domain.EbankerUserDetails;
import com.ebanker.domain.EbankerUserRoles;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Vladimir
 */
public interface EbankerUserDao {

    public List<EbankerUser> getListOfUsers();

    public EbankerUser findUserByUsername(String username);

    public void registerUser(EbankerUser user, EbankerUserDetails userDetails, Set<EbankerUserRoles> userRoles);

    public void removeUser(EbankerUser user);

    public EbankerUserDetails getUserDetails(String username);

    public void updateUser(EbankerUser user, EbankerUserDetails userDetails);

    public void updateUserRoles(EbankerUserRoles userRoles);

    public void removeUserRole(EbankerUser user);

    public void registerUser(EbankerUser user);

    public void updateUserDetails(String username, String photo);
}
