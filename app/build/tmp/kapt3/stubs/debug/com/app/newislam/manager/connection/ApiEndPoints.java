package com.app.newislam.manager.connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/app/newislam/manager/connection/ApiEndPoints;", "", "()V", "BASE_URL", "", "FORGET_PASSWORD", "LOGIN", "REGISTER", "USERS", "app_debug"})
public final class ApiEndPoints {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://174.138.103.162:4000/Api/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USERS = "Users/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN = "http://174.138.103.162:4000/Api/Users/Login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGISTER = "http://174.138.103.162:4000/Api/Users/Register";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORGET_PASSWORD = "http://174.138.103.162:4000/Api/Users/Reset";
    public static final com.app.newislam.manager.connection.ApiEndPoints INSTANCE = null;
    
    private ApiEndPoints() {
        super();
    }
}