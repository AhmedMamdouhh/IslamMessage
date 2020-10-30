package com.app.newislam.repository.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u0018R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/app/newislam/repository/auth/RegistrationRepository;", "Lorg/koin/core/KoinComponent;", "()V", "api", "Lcom/app/newislam/manager/connection/Api;", "getApi", "()Lcom/app/newislam/manager/connection/Api;", "api$delegate", "Lkotlin/Lazy;", "appSchedulerProvider", "Lcom/app/newislam/manager/connection/AppSchedulerProvider;", "getAppSchedulerProvider", "()Lcom/app/newislam/manager/connection/AppSchedulerProvider;", "appSchedulerProvider$delegate", "composit", "Lio/reactivex/disposables/CompositeDisposable;", "getComposit", "()Lio/reactivex/disposables/CompositeDisposable;", "composit$delegate", "createNewUser", "Lio/reactivex/Flowable;", "Lcom/app/newislam/manager/connection/Resource;", "", "registrationRequest", "Lcom/app/newislam/model/requests/auth/register/RegistrationRequest;", "app_debug"})
public final class RegistrationRepository implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy api$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appSchedulerProvider$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy composit$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.manager.connection.Api getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.manager.connection.AppSchedulerProvider getAppSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getComposit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.app.newislam.manager.connection.Resource<java.lang.Object>> createNewUser(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.requests.auth.register.RegistrationRequest registrationRequest) {
        return null;
    }
    
    public RegistrationRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}