package com.app.newislam.model.requests.auth.password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/app/newislam/model/requests/auth/password/ForgetPasswordRequest;", "Landroidx/databinding/BaseObservable;", "passwordError", "Lcom/app/newislam/model/requests/auth/password/PasswordError;", "(Lcom/app/newislam/model/requests/auth/password/PasswordError;)V", "_email", "", "value", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPasswordError", "()Lcom/app/newislam/model/requests/auth/password/PasswordError;", "app_debug"})
public final class ForgetPasswordRequest extends androidx.databinding.BaseObservable {
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String _email = "";
    @org.jetbrains.annotations.NotNull()
    private final com.app.newislam.model.requests.auth.password.PasswordError passwordError = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.Bindable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.model.requests.auth.password.PasswordError getPasswordError() {
        return null;
    }
    
    public ForgetPasswordRequest(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.password.PasswordError passwordError) {
        super();
    }
}