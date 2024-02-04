/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldrin.pos.data.dao;

import com.aldrin.pos.model.UserAccount;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author ALDRIN B. C.
 */
public interface UserAccountDAO {

    public Long getMaxId();

//    add User
    public void addUserAccount(UserAccount userAccount);

//    update User
    public void updateUserAccount(UserAccount userAccount);

//    delete User
    public void deleteUserAccount(UserAccount userAccount);

//    list of the User
    public List<UserAccount> selectUserAccount();

    public UserAccount loginUserAccount(UserAccount userAccount);

    public Boolean changePassword(UserAccount userAccount);

    public UserAccount findPhotoByUserAccountId(UserAccount userAccount);

    public void comboBoxUserAccount();
}
