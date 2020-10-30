package com.app.newislam.model.requests.auth.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/app/newislam/model/requests/auth/register/RegistrationRequest;", "Landroidx/databinding/BaseObservable;", "registerErrors", "Lcom/app/newislam/model/requests/auth/register/RegisterErrors;", "(Lcom/app/newislam/model/requests/auth/register/RegisterErrors;)V", "_email", "", "_fullName", "_lastName", "_password", "value", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "fullName", "getFullName", "setFullName", "password", "getPassword", "setPassword", "getRegisterErrors", "()Lcom/app/newislam/model/requests/auth/register/RegisterErrors;", "app_debug"})
public final class RegistrationRequest extends androidx.databinding.BaseObservable {
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String _email = "";
    @com.google.gson.annotations.SerializedName(value = "firstName")
    private java.lang.String _fullName = "";
    @com.google.gson.annotations.SerializedName(value = "lastName")
    private java.lang.String _lastName = "";
    @com.google.gson.annotations.SerializedName(value = "password")
    private java.lang.String _password = "";
    @org.jetbrains.annotations.NotNull()
    private final com.app.newislam.model.requests.auth.register.RegisterErrors registerErrors = null;
    
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
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final void setFullName(@org.jetbrains.annotations.NotNull()
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
    public final com.app.newislam.model.requests.auth.register.RegisterErrors getRegisterErrors() {
        return null;
    }
    
    public RegistrationRequest(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.register.RegisterErrors registerErrors) {
        super();
    }
}