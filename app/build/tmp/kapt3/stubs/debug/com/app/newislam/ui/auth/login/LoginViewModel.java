package com.app.newislam.ui.auth.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001b\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lcom/app/newislam/ui/auth/login/LoginViewModel;", "Lcom/app/newislam/manager/base/BaseViewModel;", "Lorg/koin/core/KoinComponent;", "()V", "loginRepository", "Lcom/app/newislam/repository/auth/LoginRepository;", "getLoginRepository", "()Lcom/app/newislam/repository/auth/LoginRepository;", "loginRepository$delegate", "Lkotlin/Lazy;", "navigateToForgotPassword", "Landroidx/lifecycle/MutableLiveData;", "", "getNavigateToForgotPassword", "()Landroidx/lifecycle/MutableLiveData;", "resource", "Lcom/app/newislam/manager/connection/Resource;", "Lcom/app/newislam/model/entities/User;", "getResource", "user", "getUser", "()Lcom/app/newislam/model/entities/User;", "user$delegate", "getLoginData", "", "loginRequest", "Lcom/app/newislam/model/requests/auth/login/LoginRequest;", "onForgotPasswordClicked", "onLoginClicked", "validateLoginRequest", "app_debug"})
public final class LoginViewModel extends com.app.newislam.manager.base.BaseViewModel implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loginRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy user$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> resource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> navigateToForgotPassword = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.repository.auth.LoginRepository getLoginRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.model.entities.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> getResource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNavigateToForgotPassword() {
        return null;
    }
    
    public final void onForgotPasswordClicked() {
    }
    
    public final void onLoginClicked(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.login.LoginRequest loginRequest) {
    }
    
    private final void getLoginData(com.app.newislam.model.requests.auth.login.LoginRequest loginRequest) {
    }
    
    private final boolean validateLoginRequest(com.app.newislam.model.requests.auth.login.LoginRequest loginRequest) {
        return false;
    }
    
    public LoginViewModel() {
        super();
    }
}