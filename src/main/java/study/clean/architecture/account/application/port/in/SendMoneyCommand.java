package study.clean.architecture.account.application.port.in;

import lombok.EqualsAndHashCode;
import lombok.Value;
import study.clean.architecture.account.domain.Account.AccountId;
import study.clean.architecture.account.domain.Money;
import study.clean.architecture.common.SelfValidating;

import javax.validation.constraints.NotNull;
@Value
@EqualsAndHashCode(callSuper = false)
public
class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull
    private final AccountId sourceAccountId;

    @NotNull
    private final AccountId targetAccountId;

    @NotNull
    private final Money money;

    public SendMoneyCommand(
            AccountId sourceAccountId,
            AccountId targetAccountId,
            Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        this.validateSelf();
    }
}
