package com.pucoexamen.pruebaparcial2carlos.Controller.Mapper;

import com.pucoexamen.pruebaparcial2carlos.Controller.DTOs.Req.UserReq;
import com.pucoexamen.pruebaparcial2carlos.Controller.DTOs.Res.UserRes;
import com.pucoexamen.pruebaparcial2carlos.Model.User;

public class UserMapper {

    /*
     * public UserDTO toDto(User user) {
     * return modelMapper.map(user, UserDTO.class);
     * }
     * 
     * public User toEntity(UserDTO userDTO) {
     * return modelMapper.map(userDTO, User.class);
     * }
     */
    public static User toClient(UserReq userReq) {
        return User.builder().build();
    }

    public static UserRes toClientRS(User client) {
        return UserRes.builder().build();
    }
}
