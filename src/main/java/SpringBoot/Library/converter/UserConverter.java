package SpringBoot.Library.converter;

import SpringBoot.Library.dto.user.UserGetDto;
import SpringBoot.Library.dto.user.UserPostDto;
import SpringBoot.Library.model.User;

public class UserConverter {

    public static UserGetDto fromModelToUserDto(User user) {
        return new UserGetDto(
                user.getId(),
                user.getUserName(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail());
    }

    public static UserPostDto fromModelToUserPostDto(User user) {
        return new UserPostDto(
                user.getUserName(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail());
    }

    public static User fromUserDtoToModel(UserPostDto userPostDto) {
        return User.builder()
                .userName(userPostDto.userName())
                .firstName(userPostDto.firstName())
                .lastName(userPostDto.lastName())
                .email(userPostDto.email())
                .build();
    }

    public static User fromUserGetDtoToModel(UserGetDto userGetDto) {
        return User.builder()
                .userName(userGetDto.userName())
                .build();
    }
}
