package study.clean.architecture.account.application.port.in;

import study.clean.architecture.account.domain.Account.AccountId;
import study.clean.architecture.account.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(AccountId accountId);

}