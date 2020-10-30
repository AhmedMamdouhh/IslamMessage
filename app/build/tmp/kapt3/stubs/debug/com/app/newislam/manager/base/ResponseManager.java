package com.app.newislam.manager.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u00c2\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c2\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c2\u0003J/\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\nJ\b\u0010\u0019\u001a\u00020\fH\u0002J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0006\u0010\u001c\u001a\u00020\fJ\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\fJ\u0006\u0010\u001f\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\fJ\b\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020\fH\u0002J\u001a\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010&\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\t\u0010\'\u001a\u00020\u0016H\u00d6\u0001R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/app/newislam/manager/base/ResponseManager;", "", "resource", "Lcom/app/newislam/manager/connection/Resource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "currentUser", "Lcom/app/newislam/model/entities/User;", "(Lcom/app/newislam/manager/connection/Resource;Landroid/content/SharedPreferences;Lcom/app/newislam/model/entities/User;)V", "responseManager", "Landroidx/lifecycle/MutableLiveData;", "authenticated", "", "component1", "component2", "component3", "copy", "equals", "", "other", "failed", "message", "", "getCurrentUser", "getResponseManager", "getSavedUser", "hashCode", "", "hideLoading", "isAuthenticated", "loading", "logout", "noConnection", "removeUser", "saveUser", "setResponseObject", "status", "Lcom/app/newislam/manager/connection/Resource$ResourceStatus;", "success", "toString", "app_debug"})
public final class ResponseManager {
    private final androidx.lifecycle.MutableLiveData<com.app.newislam.manager.connection.Resource<java.lang.Object>> responseManager = null;
    private final com.app.newislam.manager.connection.Resource<java.lang.Object> resource = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    private com.app.newislam.model.entities.User currentUser;
    
    public final boolean isAuthenticated() {
        return false;
    }
    
    public final void authenticated(@org.jetbrains.annotations.NotNull()
    com.app.newislam.model.entities.User currentUser) {
    }
    
    public final void loading() {
    }
    
    public final void hideLoading() {
    }
    
    public final void success(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void failed(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void noConnection() {
    }
    
    public final void logout() {
    }
    
    private final void setResponseObject(com.app.newislam.manager.connection.Resource.ResourceStatus status, java.lang.String message) {
    }
    
    private final void getSavedUser() {
    }
    
    private final void saveUser() {
    }
    
    private final void removeUser() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.newislam.manager.connection.Resource<java.lang.Object>> getResponseManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.newislam.model.entities.User getCurrentUser() {
        return null;
    }
    
    public ResponseManager(@org.jetbrains.annotations.NotNull()
    com.app.newislam.manager.connection.Resource<java.lang.Object> resource, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    com.app.newislam.model.entities.User currentUser) {
        super();
    }
    
    private final com.app.newislam.manager.connection.Resource<java.lang.Object> component1() {
        return null;
    }
    
    private final android.content.SharedPreferences component2() {
        return null;
    }
    
    private final com.app.newislam.model.entities.User component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.newislam.manager.base.ResponseManager copy(@org.jetbrains.annotations.NotNull()
    com.app.newislam.manager.connection.Resource<java.lang.Object> resource, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    com.app.newislam.model.entities.User currentUser) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}