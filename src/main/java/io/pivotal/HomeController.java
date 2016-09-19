package io.pivotal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by cdelashmutt on 9/18/16.
 */
@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Map<String,Object> model) {
		model.put("foo", "bar");
		return "index";
	}
}
