package ko.inflearnspringsecurity.form;

import ko.inflearnspringsecurity.account.Account;
import ko.inflearnspringsecurity.account.AccountContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SampleService {

    public void dashboard() {
        Account account = AccountContext.getAccount();
        System.out.println("====================");
        System.out.println(account.getUsername());

    }
}
