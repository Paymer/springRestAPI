package com.restApi.springRestAPI;

import lombok.Getter;
public record Greeting(long id, @Getter String content) { }
