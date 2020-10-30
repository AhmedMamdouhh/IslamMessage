package com.app.newislam.databinding;
import com.app.newislam.R;
import com.app.newislam.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.app.newislam.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.loadingView, 8);
        sViewsWithIds.put(R.id.layout_ask_register, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of userObject.email
            //         is userObject.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // userObject.email
            java.lang.String userObjectEmail = null;
            // userObject
            com.app.newislam.model.requests.auth.login.LoginRequest userObject = mUserObject;
            // userObject != null
            boolean userObjectJavaLangObjectNull = false;



            userObjectJavaLangObjectNull = (userObject) != (null);
            if (userObjectJavaLangObjectNull) {




                userObject.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of userObject.password
            //         is userObject.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // userObject.password
            java.lang.String userObjectPassword = null;
            // userObject
            com.app.newislam.model.requests.auth.login.LoginRequest userObject = mUserObject;
            // userObject != null
            boolean userObjectJavaLangObjectNull = false;



            userObjectJavaLangObjectNull = (userObject) != (null);
            if (userObjectJavaLangObjectNull) {




                userObject.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[6]
            , (android.widget.LinearLayout) bindings[9]
            , (com.airbnb.lottie.LottieAnimationView) bindings[8]
            , (android.view.View) bindings[7]
            , (android.widget.TextView) bindings[5]
            );
        this.btnLogin.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.tvForgotPassword.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.app.newislam.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.app.newislam.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.userObject == variableId) {
            setUserObject((com.app.newislam.model.requests.auth.login.LoginRequest) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.app.newislam.ui.auth.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserObject(@Nullable com.app.newislam.model.requests.auth.login.LoginRequest UserObject) {
        updateRegistration(1, UserObject);
        this.mUserObject = UserObject;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.userObject);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.app.newislam.ui.auth.login.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserObjectLoginErrors((com.app.newislam.model.requests.auth.login.LoginErrors) object, fieldId);
            case 1 :
                return onChangeUserObject((com.app.newislam.model.requests.auth.login.LoginRequest) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserObjectLoginErrors(com.app.newislam.model.requests.auth.login.LoginErrors UserObjectLoginErrors, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.emailError) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.passwordError) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserObject(com.app.newislam.model.requests.auth.login.LoginRequest UserObject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String userObjectLoginErrorsEmailError = null;
        java.lang.String userObjectEmail = null;
        java.lang.String userObjectPassword = null;
        com.app.newislam.model.requests.auth.login.LoginErrors userObjectLoginErrors = null;
        com.app.newislam.model.requests.auth.login.LoginRequest userObject = mUserObject;
        java.lang.String userObjectLoginErrorsPasswordError = null;
        com.app.newislam.ui.auth.login.LoginViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfbL) != 0) {


            if ((dirtyFlags & 0xa2L) != 0) {

                    if (userObject != null) {
                        // read userObject.email
                        userObjectEmail = userObject.getEmail();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (userObject != null) {
                        // read userObject.password
                        userObjectPassword = userObject.getPassword();
                    }
            }
            if ((dirtyFlags & 0x9bL) != 0) {

                    if (userObject != null) {
                        // read userObject.loginErrors
                        userObjectLoginErrors = userObject.getLoginErrors();
                    }
                    updateRegistration(0, userObjectLoginErrors);

                if ((dirtyFlags & 0x8bL) != 0) {

                        if (userObjectLoginErrors != null) {
                            // read userObject.loginErrors.emailError
                            userObjectLoginErrorsEmailError = userObjectLoginErrors.getEmailError();
                        }
                }
                if ((dirtyFlags & 0x93L) != 0) {

                        if (userObjectLoginErrors != null) {
                            // read userObject.loginErrors.passwordError
                            userObjectLoginErrorsPasswordError = userObjectLoginErrors.getPasswordError();
                        }
                }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            this.tvForgotPassword.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x8bL) != 0) {
            // api target 1

            this.mboundView1.setError(userObjectLoginErrorsEmailError);
        }
        if ((dirtyFlags & 0xa2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, userObjectEmail);
        }
        if ((dirtyFlags & 0x93L) != 0) {
            // api target 1

            this.mboundView3.setError(userObjectLoginErrorsPasswordError);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userObjectPassword);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.app.newislam.ui.auth.login.LoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.goToForgotPassword();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // userObject
                com.app.newislam.model.requests.auth.login.LoginRequest userObject = mUserObject;
                // viewModel
                com.app.newislam.ui.auth.login.LoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.getLoginData(userObject);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userObject.loginErrors
        flag 1 (0x2L): userObject
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): userObject.loginErrors.emailError
        flag 4 (0x5L): userObject.loginErrors.passwordError
        flag 5 (0x6L): userObject.email
        flag 6 (0x7L): userObject.password
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}