package ko.inflearnspringsecurity.form;

import ko.inflearnspringsecurity.account.Account;
import ko.inflearnspringsecurity.account.AccountContext;
import ko.inflearnspringsecurity.common.SecurityLogger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SampleService {

    public void dashboard() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        System.out.println("====================");
        System.out.println(authentication);
        System.out.println(userDetails.getUsername());

    }

    @Async
    public void asyncService() {
        SecurityLogger.Log("Async Service");
        System.out.println("Async service is called.");
    }
}
