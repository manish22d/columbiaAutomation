package com.columbia.stepdef.authentication;

import com.columbia.builder.Request;
import com.columbia.constants.Endpoints;
import com.columbia.constants.Method;
import com.columbia.core.HttpOperation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class AuthenticationStep {
    @Autowired
    HttpOperation httpOperation;
    @Value("${api.uri}")
    private String api_base_uri;

    @Value("${api.basepath}")
    private String api_base_path;
    @Value("${api.auth.type}")
    private String authType;

    @Value("${api.logging}")
    private boolean logging;
    Request request;
    @Given("user want to send request with invalid credential")
    public void userWantToCreateRequestWithInvalidCredential() {
        request = Request.builder()
                .api_base_uri(api_base_uri).api_base_path(api_base_path)
                .authType(authType).username(RandomStringUtils.randomAlphabetic(5)).password(RandomStringUtils.randomAlphabetic(5))
                .logging(logging)
                .endPoint(Endpoints.BOOKS)
                .method(Method.GET)
                .build();
        return ;
    }

    @When("user triggers get request with invalid credential")
    public void userTriggersGetRequestWithInvalidCredential() {
        httpOperation.execute(request);
    }
}
