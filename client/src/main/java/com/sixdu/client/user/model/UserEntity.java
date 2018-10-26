package com.sixdu.client.user.model;

import lombok.*;
import lombok.extern.java.Log;

import java.util.*;

/**
 * @author HONGTO
 */
@Data
@Log
@ToString(includeFieldNames=true)
public class UserEntity {

    private String id = UUID.randomUUID().toString();

    private String username;

    private String password;
}
