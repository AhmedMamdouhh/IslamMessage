package com.app.newislam.manager.connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\nJ\u0018\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\f\"\u0004\b\u0000\u0010\nJ\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\u000e\"\u0004\b\u0000\u0010\nJ\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\u0010\"\u0004\b\u0000\u0010\nJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/app/newislam/manager/connection/AppSchedulerProvider;", "", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "ioToMainCompletableScheduler", "Lio/reactivex/CompletableTransformer;", "ioToMainFlowableScheduler", "Lio/reactivex/FlowableTransformer;", "T", "ioToMainMaybeScheduler", "Lio/reactivex/MaybeTransformer;", "ioToMainObservableScheduler", "Lio/reactivex/ObservableTransformer;", "ioToMainSingleScheduler", "Lio/reactivex/SingleTransformer;", "ui", "app_debug"})
public final class AppSchedulerProvider {
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> ioToMainObservableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.SingleTransformer<T, T> ioToMainSingleScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.CompletableTransformer ioToMainCompletableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.FlowableTransformer<T, T> ioToMainFlowableScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.MaybeTransformer<T, T> ioToMainMaybeScheduler() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.Scheduler ui() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler computation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler io() {
        return null;
    }
    
    public AppSchedulerProvider() {
        super();
    }
}