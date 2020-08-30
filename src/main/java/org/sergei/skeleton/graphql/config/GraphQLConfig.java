package org.sergei.skeleton.graphql.config;

import java.math.BigDecimal;

import graphql.schema.Coercing;
import graphql.schema.CoercingParseLiteralException;
import graphql.schema.CoercingParseValueException;
import graphql.schema.CoercingSerializeException;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * GraphQL configuration.
 *
 * @author Sergei Visotsky
 */
@Configuration
@ComponentScan({
        "org.sergei.skeleton.graphql.*"
})
public class GraphQLConfig {

    @Bean
    public GraphQLScalarType bigDecimal() {
        return GraphQLScalarType.newScalar()
                .name("BigDecimal")
                .description("Custom BigDecimal scalar")
                .coercing(new Coercing<BigDecimal, String>() {
                    public String serialize(Object o) throws CoercingSerializeException {
                        return null;
                    }

                    public BigDecimal parseValue(Object o) throws CoercingParseValueException {
                        return new BigDecimal(String.valueOf(o));
                    }

                    public BigDecimal parseLiteral(Object o) throws CoercingParseLiteralException {
                        return null;
                    }
                })
                .build();
    }

}
