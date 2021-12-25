package mappers;

import domain.User;
import javax.annotation.processing.Generated;
import model.UserCommand;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-25T19:40:49+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.5 (JetBrains s.r.o)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}
