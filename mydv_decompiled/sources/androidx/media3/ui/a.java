package androidx.media3.ui;

import android.view.View;
import androidx.media3.ui.PlayerControlView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ a(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                ((PlayerControlView.AudioTrackSelectionAdapter) obj).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 1:
                ((PlayerControlView.SettingViewHolder) obj).lambda$new$0(view);
                break;
            default:
                ((PlayerControlView.TextTrackSelectionAdapter) obj).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
        }
    }
}
