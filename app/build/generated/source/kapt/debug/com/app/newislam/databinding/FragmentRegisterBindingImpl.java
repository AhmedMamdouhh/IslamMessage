package com.app.newislam.databinding;
import com.app.newislam.R;
import com.app.newislam.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements com.app.newislam.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 9);
        sViewsWithIds.put(R.id.loadingView, 10);
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
    private final android.widget.EditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
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
            com.app.newislam.model.requests.auth.register.RegistrationRequest userObject = mUserObject;
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
            // Inverse of userObject.fullName
            //         is userObject.setFullName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // userObject
            com.app.newislam.model.requests.auth.register.RegistrationRequest userObject = mUserObject;
            // userObject != null
            boolean userObjectJavaLangObjectNull = false;
            // userObject.fullName
            java.lang.String userObjectFullName = null;



            userObjectJavaLangObjectNull = (userObject) != (null);
            if (userObjectJavaLangObjectNull) {




                userObject.setFullName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of userObject.password
            //         is userObject.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // userObject.password
            java.lang.String userObjectPassword = null;
            // userObject
            com.app.newislam.model.requests.auth.register.RegistrationRequest userObject = mUserObject;
            // userObject != null
            boolean userObjectJavaLangObjectNull = false;



            userObjectJavaLangObjectNull = (userObject) != (null);
            if (userObjectJavaLangObjectNull) {




                userObject.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[7]
            , (android.widget.LinearLayout) bindings[8]
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (android.view.View) bindings[9]
            );
        this.btnRegister.setTag(null);
        this.layoutAskRegister.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.app.newislam.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.app.newislam.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setUserObject((com.app.newislam.model.requests.auth.register.RegistrationRequest) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.app.newislam.ui.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserObject(@Nullable com.app.newislam.model.requests.auth.register.RegistrationRequest UserObject) {
        updateRegistration(1, UserObject);
        this.mUserObject = UserObject;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.userObject);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.app.newislam.ui.auth.register.RegisterViewModel ViewModel) {
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
                return onChangeUserObjectRegisterErrors((com.app.newislam.model.requests.auth.register.RegisterErrors) object, fieldId);
            case 1 :
                return onChangeUserObject((com.app.newislam.model.requests.auth.register.RegistrationRequest) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserObjectRegisterErrors(com.app.newislam.model.requests.auth.register.RegisterErrors UserObjectRegisterErrors, int fieldId) {
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
        else if (fieldId == BR.fullNameError) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.passwordError) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserObject(com.app.newislam.model.requests.auth.register.RegistrationRequest UserObject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.fullName) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        com.app.newislam.model.requests.auth.register.RegisterErrors userObjectRegisterErrors = null;
        java.lang.String userObjectRegisterErrorsEmailError = null;
        java.lang.String userObjectEmail = null;
        java.lang.String userObjectPassword = null;
        com.app.newislam.model.requests.auth.register.RegistrationRequest userObject = mUserObject;
        java.lang.String userObjectRegisterErrorsFullNameError = null;
        java.lang.String userObjectFullName = null;
        java.lang.String userObjectRegisterErrorsPasswordError = null;
        com.app.newislam.ui.auth.register.RegisterViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fbL) != 0) {


            if ((dirtyFlags & 0x23bL) != 0) {

                    if (userObject != null) {
                        // read userObject.registerErrors
                        userObjectRegisterErrors = userObject.getRegisterErrors();
                    }
                    updateRegistration(0, userObjectRegisterErrors);

                if ((dirtyFlags & 0x20bL) != 0) {

                        if (userObjectRegisterErrors != null) {
                            // read userObject.registerErrors.emailError
                            userObjectRegisterErrorsEmailError = userObjectRegisterErrors.getEmailError();
                        }
                }
                if ((dirtyFlags & 0x213L) != 0) {

                        if (userObjectRegisterErrors != null) {
                            // read userObject.registerErrors.fullNameError
                            userObjectRegisterErrorsFullNameError = userObjectRegisterErrors.getFullNameError();
                        }
                }
                if ((dirtyFlags & 0x223L) != 0) {

                        if (userObjectRegisterErrors != null) {
                            // read userObject.registerErrors.passwordError
                            userObjectRegisterErrorsPasswordError = userObjectRegisterErrors.getPasswordError();
                        }
                }
            }
            if ((dirtyFlags & 0x242L) != 0) {

                    if (userObject != null) {
                        // read userObject.email
                        userObjectEmail = userObject.getEmail();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (userObject != null) {
                        // read userObject.password
                        userObjectPassword = userObject.getPassword();
                    }
            }
            if ((dirtyFlags & 0x282L) != 0) {

                    if (userObject != null) {
                        // read userObject.fullName
                        userObjectFullName = userObject.getFullName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.btnRegister.setOnClickListener(mCallback7);
            this.layoutAskRegister.setOnClickListener(mCallback8);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x20bL) != 0) {
            // api target 1

            this.mboundView1.setError(userObjectRegisterErrorsEmailError);
        }
        if ((dirtyFlags & 0x242L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, userObjectEmail);
        }
        if ((dirtyFlags & 0x213L) != 0) {
            // api target 1

            this.mboundView3.setError(userObjectRegisterErrorsFullNameError);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userObjectFullName);
        }
        if ((dirtyFlags & 0x223L) != 0) {
            // api target 1

            this.mboundView5.setError(userObjectRegisterErrorsPasswordError);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userObjectPassword);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // userObject
                com.app.newislam.model.requests.auth.register.RegistrationRequest userObject = mUserObject;
                // viewModel
                com.app.newislam.ui.auth.register.RegisterViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.createNewUser(userObject);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.app.newislam.ui.auth.register.RegisterViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.goToLogin();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): userObject.registerErrors
        flag 1 (0x2L): userObject
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): userObject.registerErrors.emailError
        flag 4 (0x5L): userObject.registerErrors.fullNameError
        flag 5 (0x6L): userObject.registerErrors.passwordError
        flag 6 (0x7L): userObject.email
        flag 7 (0x8L): userObject.fullName
        flag 8 (0x9L): userObject.password
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}