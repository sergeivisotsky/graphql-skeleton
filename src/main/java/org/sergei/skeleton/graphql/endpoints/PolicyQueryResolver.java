package org.sergei.skeleton.graphql.endpoints;

import java.math.BigDecimal;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.sergei.skeleton.graphql.dto.Policy;
import org.springframework.stereotype.Component;

/**
 * @author Sergei Visotsky
 */
@Component
public class PolicyQueryResolver implements GraphQLQueryResolver {

    public Policy getPolicySummaryByNumber(String number) {
        Policy policy = new Policy();
        policy.setPolicyNumber("T123");
        policy.setPremium(new BigDecimal(123));
        return policy;
    }
}
