package com.app.newislam.manager.connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b \u0018\u00002\u00020\u0001BK\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001e\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010\u00a8\u0006%"}, d2 = {"Lcom/app/newislam/manager/connection/ApiHeader;", "", "authorization", "", "countryId", "", "deviceUUID", "deviceId", "deviceToken", "languageId", "language", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "apiKey", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "getAuthorization", "setAuthorization", "getCountryId", "()Ljava/lang/Integer;", "setCountryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDeviceId", "setDeviceId", "getDeviceToken", "setDeviceToken", "deviceType", "getDeviceType", "setDeviceType", "getDeviceUUID", "setDeviceUUID", "getLanguage", "setLanguage", "getLanguageId", "setLanguageId", "app_debug"})
public final class ApiHeader {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Authorization")
    private java.lang.String authorization;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "country_id")
    private java.lang.Integer countryId = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "device-uuid")
    private java.lang.String deviceUUID = "android";
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "device-type")
    private java.lang.String deviceType = "android";
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "device-id")
    private java.lang.String deviceId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "language-id")
    private java.lang.String languageId = "1";
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "language")
    private java.lang.String language = "en";
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "device-token")
    private java.lang.String deviceToken;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "x-api-key")
    private java.lang.String apiKey = "NWRjYWY1NTYzZjkwOGVlNzNjYjliZWJiMzA4NWFlZWNjODU5ZGNjMzQ4ZDBiOThmMTE0NjczMjBmMzI5MzQxZDNkZDdkNWE4ODI5YWI3YzRkNjJjYjQwODJkODA1YmI0ZGMxNWZhMmI3YmMwODk3OTFlY2VkODQwMjUwNGU2YWI=";
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthorization() {
        return null;
    }
    
    public final void setAuthorization(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCountryId() {
        return null;
    }
    
    public final void setCountryId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceUUID() {
        return null;
    }
    
    public final void setDeviceUUID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceType() {
        return null;
    }
    
    public final void setDeviceType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceId() {
        return null;
    }
    
    public final void setDeviceId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguageId() {
        return null;
    }
    
    public final void setLanguageId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceToken() {
        return null;
    }
    
    public final void setDeviceToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiKey() {
        return null;
    }
    
    public final void setApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ApiHeader(@org.jetbrains.annotations.NotNull()
    java.lang.String authorization, int countryId, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceUUID, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceToken, @org.jetbrains.annotations.NotNull()
    java.lang.String languageId, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        super();
    }
}