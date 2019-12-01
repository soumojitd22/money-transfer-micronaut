package demo.api.dto;

import demo.api.constant.AppConstants;
import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Introspected
public class UserAccount {
    @Pattern(regexp = "^[1-9]\\d{9}$", message = AppConstants.MOBILE_NUM_ERROR)
    String mobileNumber;
    @Min(value = 100, message = AppConstants.INIT_MIN_AMT_ERROR)
    long accountBalance;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        UserAccount that = (UserAccount) o;
        return getMobileNumber().equals(that.getMobileNumber());
    }

    @Override
    public int hashCode() {
        return getMobileNumber().hashCode();
    }
}
