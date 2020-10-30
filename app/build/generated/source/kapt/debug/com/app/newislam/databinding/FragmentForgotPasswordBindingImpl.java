package com.app.newislam.databinding;
import com.app.newislam.R;
import com.app.newislam.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentForgotPasswordBindingImpl extends FragmentForgotPasswordBinding implements com.app.newislam.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.tv_enter_mail, 5);
        sViewsWithIds.put(R.id.tv_email, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of forgotPassRequest.email
            //         is forgotPassRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // forgotPassRequest.email
            java.lang.String forgotPassRequestEmail = null;
            // forgotPassRequest != null
            boolean forgotPassRequestJavaLangObjectNull = false;
            // forgotPassRequest
            com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgotPassRequest = mForgotPassRequest;



            forgotPassRequestJavaLangObjectNull = (forgotPassRequest) != (null);
            if (forgotPassRequestJavaLangObjectNull) {




                forgotPassRequest.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentForgotPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentForgotPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (android.view.View) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            );
        this.btnSendEmail.setTag(null);
        this.etEmail.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.app.newislam.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.app.newislam.ui.auth.password.ForgotPasswordViewModel) variable);
        }
        else if (BR.forgotPassRequest == variableId) {
            setForgotPassRequest((com.app.newislam.model.requests.auth.password.ForgetPasswordRequest) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.app.newislam.ui.auth.password.ForgotPasswordViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setForgotPassRequest(@Nullable com.app.newislam.model.requests.auth.password.ForgetPasswordRequest ForgotPassRequest) {
        updateRegistration(1, ForgotPassRequest);
        this.mForgotPassRequest = ForgotPassRequest;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.forgotPassRequest);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeForgotPassRequestPasswordError((com.app.newislam.model.requests.auth.password.PasswordError) object, fieldId);
            case 1 :
                return onChangeForgotPassRequest((com.app.newislam.model.requests.auth.password.ForgetPasswordRequest) object, fieldId);
        }
        return false;
    }
    private boolean onChangeForgotPassRequestPasswordError(com.app.newislam.model.requests.auth.password.PasswordError ForgotPassRequestPasswordError, int fieldId) {
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
        return false;
    }
    private boolean onChangeForgotPassRequest(com.app.newislam.model.requests.auth.password.ForgetPasswordRequest ForgotPassRequest, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String forgotPassRequestEmail = null;
        java.lang.String forgotPassRequestPasswordErrorEmailError = null;
        com.app.newislam.model.requests.auth.password.PasswordError forgotPassRequestPasswordError = null;
        com.app.newislam.ui.auth.password.ForgotPasswordViewModel viewModel = mViewModel;
        com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgotPassRequest = mForgotPassRequest;

        if ((dirtyFlags & 0x3bL) != 0) {


            if ((dirtyFlags & 0x32L) != 0) {

                    if (forgotPassRequest != null) {
                        // read forgotPassRequest.email
                        forgotPassRequestEmail = forgotPassRequest.getEmail();
                    }
            }
            if ((dirtyFlags & 0x2bL) != 0) {

                    if (forgotPassRequest != null) {
                        // read forgotPassRequest.passwordError
                        forgotPassRequestPasswordError = forgotPassRequest.getPasswordError();
                    }
                    updateRegistration(0, forgotPassRequestPasswordError);


                    if (forgotPassRequestPasswordError != null) {
                        // read forgotPassRequest.passwordError.emailError
                        forgotPassRequestPasswordErrorEmailError = forgotPassRequestPasswordError.getEmailError();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnSendEmail.setOnClickListener(mCallback8);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x2bL) != 0) {
            // api target 1

            this.etEmail.setError(forgotPassRequestPasswordErrorEmailError);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, forgotPassRequestEmail);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.app.newislam.ui.auth.password.ForgotPasswordViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;
        // forgotPassRequest
        com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgotPassRequest = mForgotPassRequest;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.forgetPassword(forgotPassRequest);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): forgotPassRequest.passwordError
        flag 1 (0x2L): forgotPassRequest
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): forgotPassRequest.passwordError.emailError
        flag 4 (0x5L): forgotPassRequest.email
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}