package org.sergei.skeleton.graphql.dto;

import java.math.BigDecimal;

/**
 * @author Sergei Visotsky
 */
public class Policy {
    private String policyNumber;
    private BigDecimal premium;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }
}
