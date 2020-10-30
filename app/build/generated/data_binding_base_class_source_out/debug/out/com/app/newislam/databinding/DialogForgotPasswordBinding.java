// Generated by data binding compiler. Do not edit!
package com.app.newislam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.newislam.R;
import com.app.newislam.model.requests.auth.password.ForgetPasswordRequest;
import com.app.newislam.ui.auth.password.ForgotPasswordViewModel;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogForgotPasswordBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout ablCoinsToolbar;

  @NonNull
  public final NestedScrollView bottomSheet;

  @NonNull
  public final ImageButton cancelBtn;

  @NonNull
  public final EditText etForgotEmail;

  @NonNull
  public final TextView nameToolbar;

  @Bindable
  protected ForgetPasswordRequest mForgotPassRequest;

  @Bindable
  protected ForgotPasswordViewModel mViewModel;

  protected DialogForgotPasswordBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout ablCoinsToolbar, NestedScrollView bottomSheet, ImageButton cancelBtn,
      EditText etForgotEmail, TextView nameToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ablCoinsToolbar = ablCoinsToolbar;
    this.bottomSheet = bottomSheet;
    this.cancelBtn = cancelBtn;
    this.etForgotEmail = etForgotEmail;
    this.nameToolbar = nameToolbar;
  }

  public abstract void setForgotPassRequest(@Nullable ForgetPasswordRequest forgotPassRequest);

  @Nullable
  public ForgetPasswordRequest getForgotPassRequest() {
    return mForgotPassRequest;
  }

  public abstract void setViewModel(@Nullable ForgotPasswordViewModel viewModel);

  @Nullable
  public ForgotPasswordViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DialogForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_forgot_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogForgotPasswordBinding>inflateInternal(inflater, R.layout.dialog_forgot_password, root, attachToRoot, component);
  }

  @NonNull
  public static DialogForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_forgot_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogForgotPasswordBinding>inflateInternal(inflater, R.layout.dialog_forgot_password, null, false, component);
  }

  public static DialogForgotPasswordBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static DialogForgotPasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogForgotPasswordBinding)bind(component, view, R.layout.dialog_forgot_password);
  }
}