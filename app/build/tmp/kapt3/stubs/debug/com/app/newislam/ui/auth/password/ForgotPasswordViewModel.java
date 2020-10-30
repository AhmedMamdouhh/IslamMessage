package com.app.newislam.ui.auth.password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/app/newislam/ui/auth/password/ForgotPasswordViewModel;", "Lcom/app/newislam/manager/base/BaseViewModel;", "()V", "forgerPasswordRepository", "Lcom/app/newislam/repository/auth/ForgerPasswordRepository;", "getForgerPasswordRepository", "()Lcom/app/newislam/repository/auth/ForgerPasswordRepository;", "forgerPasswordRepository$delegate", "Lkotlin/Lazy;", "resource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/newislam/manager/connection/Resource;", "Lcom/app/newislam/model/entities/User;", "getResource", "()Landroidx/lifecycle/MutableLiveData;", "user", "getUser", "()Lcom/app/newislam/model/entities/User;", "user$delegate", "forgetPassword", "", "forgetPasswordRequest", "Lcom/app/newislam/model/requests/auth/password/ForgetPasswordRequest;", "app_debug"})
public final class ForgotPasswordViewModel extends com.app.newislam.manager.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy forgerPasswordRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy user$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> resource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.repository.auth.ForgerPasswordRepository getForgerPasswordRepository() {
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
    
    public final void forgetPassword(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgetPasswordRequest) {
    }
    
    public ForgotPasswordViewModel() {
        super();
    }
}