package api.log.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import api.log.repositories.UserRepository;
import api.log.models.UserModel;
import java.util.ArrayList;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getAllUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    // si existe el correo, no se puede registrar
    public UserModel saveUser(UserModel user) {
        if (userRepository.findByEmail(user.getEmail()) == null) {
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public UserModel loginUser(UserModel user) {
        return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }
    
}
