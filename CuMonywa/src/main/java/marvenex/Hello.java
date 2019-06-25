package marvenex;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(){
		
		return "index";
	}
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(){
		System.out.println("\n>>> Iam GET");
		return "registration";
	}
	

	
	@RequestMapping(value ="/userdatashow", method = RequestMethod.POST)
	public String registrationPOST(String name,Model model){
		System.out.println("\n>>> Iam POST = "+name);
		model.addAttribute("UserName", name);
		return "showData";
}
}
