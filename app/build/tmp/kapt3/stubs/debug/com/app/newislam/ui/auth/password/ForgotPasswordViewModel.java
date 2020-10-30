package com.app.newislam.ui.auth.password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0006\u0010$\u001a\u00020 J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\'H\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00180\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u001b\u0010\u001b\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006("}, d2 = {"Lcom/app/newislam/ui/auth/password/ForgotPasswordViewModel;", "Lcom/app/newislam/manager/base/BaseViewModel;", "()V", "closeClick", "Landroidx/lifecycle/LiveData;", "", "getCloseClick", "()Landroidx/lifecycle/LiveData;", "forgerPasswordRepository", "Lcom/app/newislam/repository/auth/ForgerPasswordRepository;", "getForgerPasswordRepository", "()Lcom/app/newislam/repository/auth/ForgerPasswordRepository;", "forgerPasswordRepository$delegate", "Lkotlin/Lazy;", "observSucces", "Landroidx/lifecycle/MutableLiveData;", "getObservSucces", "()Landroidx/lifecycle/MutableLiveData;", "setObservSucces", "(Landroidx/lifecycle/MutableLiveData;)V", "observeCloseClick", "getObserveCloseClick", "setObserveCloseClick", "resource", "Lcom/app/newislam/manager/connection/Resource;", "Lcom/app/newislam/model/entities/User;", "getResource", "user", "getUser", "()Lcom/app/newislam/model/entities/User;", "user$delegate", "forgetPassword", "", "forgetPasswordRequest", "Lcom/app/newislam/model/requests/auth/password/ForgetPasswordRequest;", "getRepositoryData", "onCloseClicked", "validateForgotPassword", "email", "", "app_debug"})
public final class ForgotPasswordViewModel extends com.app.newislam.manager.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy forgerPasswordRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy user$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> resource = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> observeCloseClick;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> observSucces;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getObserveCloseClick() {
        return null;
    }
    
    public final void setObserveCloseClick(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getObservSucces() {
        return null;
    }
    
    public final void setObservSucces(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void forgetPassword(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgetPasswordRequest) {
    }
    
    private final boolean validateForgotPassword(java.lang.String email) {
        return false;
    }
    
    public final void getRepositoryData(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgetPasswordRequest) {
    }
    
    public final void onCloseClicked() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCloseClick() {
        return null;
    }
    
    public ForgotPasswordViewModel() {
        super();
    }
}