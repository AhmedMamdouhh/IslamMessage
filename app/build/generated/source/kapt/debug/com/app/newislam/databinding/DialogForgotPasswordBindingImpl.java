package com.app.newislam.databinding;
import com.app.newislam.R;
import com.app.newislam.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogForgotPasswordBindingImpl extends DialogForgotPasswordBinding implements com.app.newislam.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.abl_coins_toolbar, 4);
        sViewsWithIds.put(R.id.nameToolbar, 5);
        sViewsWithIds.put(R.id.bottomSheet, 6);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etForgotEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of forgotPassRequest.email
            //         is forgotPassRequest.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etForgotEmail);
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

    public DialogForgotPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DialogForgotPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (androidx.core.widget.NestedScrollView) bindings[6]
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.cancelBtn.setTag(null);
        this.etForgotEmail.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.cardview.widget.CardView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.app.newislam.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.app.newislam.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setForgotPassRequest(@Nullable com.app.newislam.model.requests.auth.password.ForgetPasswordRequest ForgotPassRequest) {
        updateRegistration(0, ForgotPassRequest);
        this.mForgotPassRequest = ForgotPassRequest;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.forgotPassRequest);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeForgotPassRequest((com.app.newislam.model.requests.auth.password.ForgetPasswordRequest) object, fieldId);
        }
        return false;
    }
    private boolean onChangeForgotPassRequest(com.app.newislam.model.requests.auth.password.ForgetPasswordRequest ForgotPassRequest, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.app.newislam.ui.auth.password.ForgotPasswordViewModel viewModel = mViewModel;
        com.app.newislam.model.requests.auth.password.ForgetPasswordRequest forgotPassRequest = mForgotPassRequest;

        if ((dirtyFlags & 0xdL) != 0) {



                if (forgotPassRequest != null) {
                    // read forgotPassRequest.email
                    forgotPassRequestEmail = forgotPassRequest.getEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.cancelBtn.setOnClickListener(mCallback6);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etForgotEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etForgotEmailandroidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etForgotEmail, forgotPassRequestEmail);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
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
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.app.newislam.ui.auth.password.ForgotPasswordViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onCloseClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): forgotPassRequest
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): forgotPassRequest.email
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}