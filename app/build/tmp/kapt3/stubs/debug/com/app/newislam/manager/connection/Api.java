package com.app.newislam.manager.connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/app/newislam/manager/connection/Api;", "", "createNewUser", "Lio/reactivex/Flowable;", "Lcom/app/newislam/manager/connection/Resource;", "registrationRequest", "Lcom/app/newislam/model/requests/auth/register/RegistrationRequest;", "forgetPassword", "Lcom/app/newislam/model/entities/User;", "forgetPasswordRequest", "Lcom/app/newislam/model/requests/auth/password/ForgetPasswordRequest;", "userLogin", "loginRequest", "Lcom/app/newislam/model/requests/auth/login/LoginRequest;", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "http://174.138.103.162:4000/Api/Users/Login")
    public abstract io.reactivex.Flowable<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> userLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.app.newislam.model.requests.auth.login.LoginRequest loginRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "http://174.138.103.162:4000/Api/Users/Register")
    public abstract io.reactivex.Flowable<com.app.newislam.manager.connection.Resource<java.lang.Object>> createNewUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.app.newislam.model.requests.auth.register.RegistrationRequest registrationRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "http://174.138.103.162:4000/Api/Users/Reset")
    public abstract io.reactivex.Flowable<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> forgetPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgetPasswordRequest);
}