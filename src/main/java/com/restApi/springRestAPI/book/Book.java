package com.restApi.springRestAPI.book;

import lombok.Getter;
public record Book ( @Getter String title, @Getter String author, @Getter String content){ }
