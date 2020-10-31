package com.app.newislam.manager.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/app/newislam/manager/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "baseViewModel", "Lcom/app/newislam/manager/base/BaseViewModel;", "getBaseViewModel", "()Lcom/app/newislam/manager/base/BaseViewModel;", "baseViewModel$delegate", "Lkotlin/Lazy;", "loadingBar", "Landroid/app/Dialog;", "getLoadingBar", "()Landroid/app/Dialog;", "setLoadingBar", "(Landroid/app/Dialog;)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "failedMessage", "", "message", "", "hideProgress", "initializeProgress", "noConnection", "observeResponse", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showProgress", "successMessage", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog loadingBar;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy baseViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final android.app.Dialog getLoadingBar() {
        return null;
    }
    
    protected final void setLoadingBar(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.manager.base.BaseViewModel getBaseViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void observeResponse() {
    }
    
    private final void successMessage(java.lang.String message) {
    }
    
    private final void failedMessage(java.lang.String message) {
    }
    
    private final void noConnection() {
    }
    
    private final void initializeProgress() {
    }
    
    private final void showProgress() {
    }
    
    private final void hideProgress() {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    public BaseActivity() {
        super();
    }
}