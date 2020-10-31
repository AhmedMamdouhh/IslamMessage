package com.app.newislam.model.requests.auth.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/app/newislam/model/requests/auth/login/LoginRequest;", "Landroidx/databinding/BaseObservable;", "loginErrors", "Lcom/app/newislam/model/requests/auth/login/LoginErrors;", "(Lcom/app/newislam/model/requests/auth/login/LoginErrors;)V", "value", "", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getLoginErrors", "()Lcom/app/newislam/model/requests/auth/login/LoginErrors;", "password", "getPassword", "setPassword", "app_debug"})
public final class LoginRequest extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String email = "";
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "password")
    private java.lang.String password = "";
    @org.jetbrains.annotations.NotNull()
    private final com.app.newislam.model.requests.auth.login.LoginErrors loginErrors = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.model.requests.auth.login.LoginErrors getLoginErrors() {
        return null;
    }
    
    public LoginRequest(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.login.LoginErrors loginErrors) {
        super();
    }
}