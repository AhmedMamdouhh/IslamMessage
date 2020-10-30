package com.app.newislam.manager.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/app/newislam/manager/utilities/Validation;", "", "()V", "isEmail", "", "str", "", "isNullOrEmpty", "string", "", "isPassword", "password", "isPasswordMatch", "confirmPassword", "isPhone", "app_debug"})
public final class Validation {
    public static final com.app.newislam.manager.utilities.Validation INSTANCE = null;
    
    public final boolean isEmail(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence str) {
        return false;
    }
    
    public final boolean isPhone(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence str) {
        return false;
    }
    
    public final boolean isPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    public final boolean isPasswordMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPassword) {
        return false;
    }
    
    public final boolean isNullOrEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.String string) {
        return false;
    }
    
    private Validation() {
        super();
    }
}