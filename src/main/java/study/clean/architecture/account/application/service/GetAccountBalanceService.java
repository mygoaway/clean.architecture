package study.clean.architecture.account.application.service;

import lombok.RequiredArgsConstructor;
import study.clean.architecture.account.application.port.in.GetAccountBalanceQuery;
import study.clean.architecture.account.application.port.out.LoadAccountPort;
import study.clean.architecture.account.domain.Account;
import study.clean.architecture.account.domain.Account.AccountId;
import study.clean.architecture.account.domain.Money;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}
