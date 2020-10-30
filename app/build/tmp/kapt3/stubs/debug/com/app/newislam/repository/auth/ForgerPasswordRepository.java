package com.app.newislam.repository.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/app/newislam/repository/auth/ForgerPasswordRepository;", "Lorg/koin/core/KoinComponent;", "()V", "api", "Lcom/app/newislam/manager/connection/Api;", "getApi", "()Lcom/app/newislam/manager/connection/Api;", "api$delegate", "Lkotlin/Lazy;", "appSchedulerProvider", "Lcom/app/newislam/manager/connection/AppSchedulerProvider;", "getAppSchedulerProvider", "()Lcom/app/newislam/manager/connection/AppSchedulerProvider;", "appSchedulerProvider$delegate", "forgetPassword", "Lio/reactivex/Flowable;", "Lcom/app/newislam/manager/connection/Resource;", "Lcom/app/newislam/model/entities/User;", "forgetPasswordRequest", "Lcom/app/newislam/model/requests/auth/password/ForgetPasswordRequest;", "app_debug"})
public final class ForgerPasswordRepository implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy api$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appSchedulerProvider$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.manager.connection.Api getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.manager.connection.AppSchedulerProvider getAppSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.app.newislam.manager.connection.Resource<com.app.newislam.model.entities.User>> forgetPassword(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgetPasswordRequest) {
        return null;
    }
    
    public ForgerPasswordRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}