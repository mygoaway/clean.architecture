package study.clean.architecture.account.application.port.out;

import study.clean.architecture.account.domain.Account;

public interface UpdateAccountStatePort {
    void updateActivities(Account account);
}
