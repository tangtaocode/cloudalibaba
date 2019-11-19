package tang.tao.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tang.tao.common.api.example.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

	@Reference(version = "1.0.0")
	private UserService userService;
	@SentinelResource("getUserName")
	@RequestMapping("/getUserName")
	public String getUserName() {
		return userService.getUserName();
	}

}
