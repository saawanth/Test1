/**
 * 
 */
package com.seti.service;
import com.seti.dto.UserDTO;
import java.util.List;

import com.seti.model.User;

public interface UserService {

    User getUserDetails(Long id);
    
    void saveUser(UserDTO user);

}
