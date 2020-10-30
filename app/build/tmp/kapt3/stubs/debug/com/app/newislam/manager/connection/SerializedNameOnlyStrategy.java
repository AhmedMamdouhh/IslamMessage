package com.app.newislam.manager.connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/app/newislam/manager/connection/SerializedNameOnlyStrategy;", "Lcom/google/gson/ExclusionStrategy;", "()V", "shouldSkipClass", "", "clazz", "Ljava/lang/Class;", "shouldSkipField", "f", "Lcom/google/gson/FieldAttributes;", "app_debug"})
public final class SerializedNameOnlyStrategy implements com.google.gson.ExclusionStrategy {
    
    @java.lang.Override()
    public boolean shouldSkipField(@org.jetbrains.annotations.NotNull()
    com.google.gson.FieldAttributes f) {
        return false;
    }
    
    @java.lang.Override()
    public boolean shouldSkipClass(@org.jetbrains.annotations.Nullable()
    java.lang.Class<?> clazz) {
        return false;
    }
    
    public SerializedNameOnlyStrategy() {
        super();
    }
}