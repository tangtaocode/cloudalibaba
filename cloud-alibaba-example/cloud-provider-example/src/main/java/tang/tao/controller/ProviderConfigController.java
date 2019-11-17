package tang.tao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/example")
@RestController
@RefreshScope
public class ProviderConfigController {

	@Value("${provider.example:19910507}")
	private String date;

	@RequestMapping("/config")
	public String config() {
		return date;
	}

}
