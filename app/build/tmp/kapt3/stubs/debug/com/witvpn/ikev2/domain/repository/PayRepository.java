package com.witvpn.ikev2.domain.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0002\b\tJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\n\u00c0\u0006\u0003"}, d2 = {"Lcom/witvpn/ikev2/domain/repository/PayRepository;", "", "getPayFK2Url", "", "userID", "plan", "Lcom/witvpn/ikev2/domain/repository/PayRepository$Plan;", "(Ljava/lang/String;Lcom/witvpn/ikev2/domain/repository/PayRepository$Plan;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Plan", "GreyWebVPN-3.0.8 [278]_debug"})
public abstract interface PayRepository {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK2_SYSTEM_NAME = "fk2";
    @org.jetbrains.annotations.NotNull()
    public static final com.witvpn.ikev2.domain.repository.PayRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPayFK2Url(@org.jetbrains.annotations.NotNull()
    java.lang.String userID, @org.jetbrains.annotations.NotNull()
    com.witvpn.ikev2.domain.repository.PayRepository.Plan plan, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/witvpn/ikev2/domain/repository/PayRepository$Companion;", "", "<init>", "()V", "FK2_SYSTEM_NAME", "", "GreyWebVPN-3.0.8 [278]_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK2_SYSTEM_NAME = "fk2";
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/witvpn/ikev2/domain/repository/PayRepository$Plan;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_MONTH", "THREE_MONTH", "SIX_MONTH", "GreyWebVPN-3.0.8 [278]_debug"})
    public static enum Plan {
        /*public static final*/ ONE_MONTH /* = new ONE_MONTH() */,
        /*public static final*/ THREE_MONTH /* = new THREE_MONTH() */,
        /*public static final*/ SIX_MONTH /* = new SIX_MONTH() */;
        
        Plan() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.witvpn.ikev2.domain.repository.PayRepository.Plan> getEntries() {
            return null;
        }
    }
}