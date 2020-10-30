// Generated by data binding compiler. Do not edit!
package com.app.newislam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.app.newislam.R;
import com.app.newislam.model.requests.auth.register.RegistrationRequest;
import com.app.newislam.ui.auth.register.RegisterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRegisterBinding extends ViewDataBinding {
  @NonNull
  public final Button btnRegister;

  @NonNull
  public final LinearLayout layoutAskRegister;

  @NonNull
  public final LottieAnimationView loadingView;

  @NonNull
  public final View toolbar;

  @Bindable
  protected RegisterViewModel mViewModel;

  @Bindable
  protected RegistrationRequest mUserObject;

  protected FragmentRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnRegister, LinearLayout layoutAskRegister, LottieAnimationView loadingView,
      View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRegister = btnRegister;
    this.layoutAskRegister = layoutAskRegister;
    this.loadingView = loadingView;
    this.toolbar = toolbar;
  }

  public abstract void setViewModel(@Nullable RegisterViewModel viewModel);

  @Nullable
  public RegisterViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setUserObject(@Nullable RegistrationRequest userObject);

  @Nullable
  public RegistrationRequest getUserObject() {
    return mUserObject;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, R.layout.fragment_register, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegisterBinding>inflateInternal(inflater, R.layout.fragment_register, null, false, component);
  }

  public static FragmentRegisterBinding bind(@NonNull View view) {
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
  public static FragmentRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRegisterBinding)bind(component, view, R.layout.fragment_register);
  }
}
