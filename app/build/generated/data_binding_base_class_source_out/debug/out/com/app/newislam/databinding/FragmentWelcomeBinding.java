// Generated by data binding compiler. Do not edit!
package com.app.newislam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.newislam.R;
import com.app.newislam.ui.auth.welcome.WelcomeViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentWelcomeBinding extends ViewDataBinding {
  @NonNull
  public final Button btnCreateAccount;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final ImageView ivLogo;

  @NonNull
  public final TextView tvWelcome;

  @NonNull
  public final TextView tvWelcomeSecond;

  @Bindable
  protected WelcomeViewModel mViewModel;

  protected FragmentWelcomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnCreateAccount, Button btnLogin, ImageView ivLogo, TextView tvWelcome,
      TextView tvWelcomeSecond) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCreateAccount = btnCreateAccount;
    this.btnLogin = btnLogin;
    this.ivLogo = ivLogo;
    this.tvWelcome = tvWelcome;
    this.tvWelcomeSecond = tvWelcomeSecond;
  }

  public abstract void setViewModel(@Nullable WelcomeViewModel viewModel);

  @Nullable
  public WelcomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentWelcomeBinding>inflateInternal(inflater, R.layout.fragment_welcome, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentWelcomeBinding>inflateInternal(inflater, R.layout.fragment_welcome, null, false, component);
  }

  public static FragmentWelcomeBinding bind(@NonNull View view) {
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
  public static FragmentWelcomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentWelcomeBinding)bind(component, view, R.layout.fragment_welcome);
  }
}
