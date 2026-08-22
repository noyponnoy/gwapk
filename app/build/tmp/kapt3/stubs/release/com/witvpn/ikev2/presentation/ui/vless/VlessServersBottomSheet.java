package com.witvpn.ikev2.presentation.ui.vless;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u0007H\u0002J\u0012\u0010*\u001a\u00020+2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006,"}, d2 = {"Lcom/witvpn/ikev2/presentation/ui/vless/VlessServersBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "onServerSelected", "Lkotlin/Function1;", "Lcom/witvpn/ikev2/vless/VlessConfig;", "", "getOnServerSelected", "()Lkotlin/jvm/functions/Function1;", "setOnServerSelected", "(Lkotlin/jvm/functions/Function1;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "progressBar", "Landroid/widget/ProgressBar;", "closeButton", "Landroid/widget/ImageView;", "viewModel", "Lcom/witvpn/ikev2/presentation/ui/servers/ServersViewModel;", "getViewModel", "()Lcom/witvpn/ikev2/presentation/ui/servers/ServersViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/witvpn/ikev2/presentation/ui/vless/VlessAdapter;", "getAdapter", "()Lcom/witvpn/ikev2/presentation/ui/vless/VlessAdapter;", "adapter$delegate", "getTheme", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "loadServers", "onCreateDialog", "Landroid/app/Dialog;", "GreyWebVPN-3.0.8 [278]_release"})
public final class VlessServersBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.witvpn.ikev2.vless.VlessConfig, kotlin.Unit> onServerSelected;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.ProgressBar progressBar;
    private android.widget.ImageView closeButton;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapter$delegate = null;
    
    public VlessServersBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.witvpn.ikev2.vless.VlessConfig, kotlin.Unit> getOnServerSelected() {
        return null;
    }
    
    public final void setOnServerSelected(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.witvpn.ikev2.vless.VlessConfig, kotlin.Unit> p0) {
    }
    
    private final com.witvpn.ikev2.presentation.ui.servers.ServersViewModel getViewModel() {
        return null;
    }
    
    private final com.witvpn.ikev2.presentation.ui.vless.VlessAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadServers() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
}