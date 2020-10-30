package com.app.newislam.databinding;
import com.app.newislam.R;
import com.app.newislam.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWelcomeBindingImpl extends FragmentWelcomeBinding implements com.app.newislam.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_logo, 4);
        sViewsWithIds.put(R.id.tv_welcome, 5);
        sViewsWithIds.put(R.id.tv_welcome_second, 6);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentWelcomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentWelcomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        this.btnCreateAccount.setTag(null);
        this.btnLogin.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.app.newislam.generated.callback.OnClickListener(this, 3);
        mCallback3 = new com.app.newislam.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.app.newislam.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewModel((com.app.newislam.ui.auth.welcome.WelcomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.app.newislam.ui.auth.welcome.WelcomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.app.newislam.ui.auth.welcome.WelcomeViewModel viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnCreateAccount.setOnClickListener(mCallback3);
            this.btnLogin.setOnClickListener(mCallback4);
            this.mboundView3.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.app.newislam.ui.auth.welcome.WelcomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.continueAsGuest();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.app.newislam.ui.auth.welcome.WelcomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.createNewAccount();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.app.newislam.ui.auth.welcome.WelcomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.loginUser();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}