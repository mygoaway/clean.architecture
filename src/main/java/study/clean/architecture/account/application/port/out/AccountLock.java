package study.clean.architecture.account.application.port.out;

import study.clean.architecture.account.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);

}
