package com.restApi.springRestAPI.greeting;

import lombok.Getter;
public record Greeting(long id, @Getter String content) { }
