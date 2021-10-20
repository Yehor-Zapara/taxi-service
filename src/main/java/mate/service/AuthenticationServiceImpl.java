package mate.service;

import java.util.Optional;
import mate.dao.DriverDao;
import mate.exception.AuthenticationException;
import mate.lib.Inject;
import mate.lib.Service;
import mate.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger LOGGER = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverDao driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driverOptional = driverService.findByLogin(login);
        if (driverOptional.isEmpty() || !driverOptional.get().getPassword().equals(password)) {
            LOGGER.info("User with login {} failed authentication", login);
            throw new AuthenticationException("Login or password was incorrect");
        }
        LOGGER.info("User with login {} was successfully authenticated", login);
        return driverOptional.get();
    }
}
