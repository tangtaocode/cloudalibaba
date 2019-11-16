package tang.tao.service;

import org.apache.dubbo.config.annotation.Service;
import tang.tao.common.api.example.UserService;

@Service(version = "1.0.0",protocol = "dubbo")
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "tangtao";
    }

    @Override
    public String getIdCard() {
        return "123645789646";
    }
}
