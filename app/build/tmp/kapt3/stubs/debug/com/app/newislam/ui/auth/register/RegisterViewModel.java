package com.app.newislam.ui.auth.register;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/app/newislam/ui/auth/register/RegisterViewModel;", "Lcom/app/newislam/manager/base/BaseViewModel;", "()V", "navigateToLogin", "Landroidx/lifecycle/MutableLiveData;", "", "getNavigateToLogin", "()Landroidx/lifecycle/MutableLiveData;", "registrationRepository", "Lcom/app/newislam/repository/auth/RegistrationRepository;", "getRegistrationRepository", "()Lcom/app/newislam/repository/auth/RegistrationRepository;", "registrationRepository$delegate", "Lkotlin/Lazy;", "resource", "Lcom/app/newislam/manager/connection/Resource;", "Lcom/app/newislam/model/entities/User;", "getResource", "createNewUser", "", "registrationRequest", "Lcom/app/newislam/model/requests/auth/register/RegistrationRequest;", "goToLogin", "reset", "app_debug"})
public final class RegisterViewModel extends com.app.newislam.manager.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy registrationRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> resource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> navigateToLogin = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.repository.auth.RegistrationRepository getRegistrationRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> getResource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNavigateToLogin() {
        return null;
    }
    
    public final void createNewUser(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.register.RegistrationRequest registrationRequest) {
    }
    
    public final void goToLogin() {
    }
    
    public final void reset() {
    }
    
    public RegisterViewModel() {
        super();
    }
}