package com.app.newislam.ui.auth.password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0002J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010,\u001a\u00020\u0019H\u0016J\u001a\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\'2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0006\u0010/\u001a\u00020\u0019R\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00060"}, d2 = {"Lcom/app/newislam/ui/auth/password/ForgotPasswordSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "forgetPasswordRequest", "Lcom/app/newislam/model/requests/auth/password/ForgetPasswordRequest;", "getForgetPasswordRequest", "()Lcom/app/newislam/model/requests/auth/password/ForgetPasswordRequest;", "forgetPasswordRequest$delegate", "Lkotlin/Lazy;", "forgotPasswordBinding", "Lcom/app/newislam/databinding/DialogForgotPasswordBinding;", "forgotPasswordViewModel", "Lcom/app/newislam/ui/auth/password/ForgotPasswordViewModel;", "getForgotPasswordViewModel", "()Lcom/app/newislam/ui/auth/password/ForgotPasswordViewModel;", "forgotPasswordViewModel$delegate", "loadingBar", "Landroid/app/Dialog;", "getLoadingBar", "()Landroid/app/Dialog;", "setLoadingBar", "(Landroid/app/Dialog;)V", "failedMessage", "", "message", "", "hideProgress", "initializeProgress", "noConnection", "observeCloseClick", "observeError", "observeResponse", "observeSuccess", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "showProgress", "app_debug"})
public final class ForgotPasswordSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.app.newislam.databinding.DialogForgotPasswordBinding forgotPasswordBinding;
    private final kotlin.Lazy forgotPasswordViewModel$delegate = null;
    private final kotlin.Lazy forgetPasswordRequest$delegate = null;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog loadingBar;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.newislam.ui.auth.password.ForgotPasswordViewModel getForgotPasswordViewModel() {
        return null;
    }
    
    private final com.app.newislam.model.requests.auth.password.ForgetPasswordRequest getForgetPasswordRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.app.Dialog getLoadingBar() {
        return null;
    }
    
    protected final void setLoadingBar(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeError() {
    }
    
    private final void observeSuccess() {
    }
    
    private final void observeCloseClick() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    public void observeResponse() {
    }
    
    public final void failedMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void noConnection() {
    }
    
    private final void initializeProgress() {
    }
    
    public final void showProgress() {
    }
    
    public final void hideProgress() {
    }
    
    public ForgotPasswordSheet() {
        super();
    }
}