package com.example.blog.Controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

//import com.example.blog.model.Book;
import com.example.blog.repository.BookRepository;
@ConditionalOnProperty(prefix = "azure", value = "9ec57533-cbc1-43fd-9e10-3579b719e953")
@RestController
public class BookController {
	@Autowired
	   @PreAuthorize("hasRole('Group1')")
	   @GetMapping("/")
	   public String helloWorld() {
	      return "Hello World!";
	   }
//	@GetMapping("/hi")
//	   public String hello() {
//	      return "Hello World!";
//	   }
//
//    @GetMapping("/")
//    public String index(Model model, OAuth2AuthenticationToken authentication) {
//        final OAuth2AuthorizedClient authorizedClient =
//                this.authorizedClientService.loadAuthorizedClient(
//                        authentication.getAuthorizedClientRegistrationId(),
//                        authentication.getName());
//        model.addAttribute("userName", authentication.getName());
//        model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());
//        return "index";
//    }
}
