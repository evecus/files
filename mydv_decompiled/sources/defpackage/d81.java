package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d81 implements es0 {
    public final /* synthetic */ li2 I;

    public d81(EmojiCompatInitializer emojiCompatInitializer, li2 li2Var) {
        this.I = li2Var;
    }

    @Override // defpackage.es0
    public final void onResume(vi2 vi2Var) {
        (Build.VERSION.SDK_INT >= 28 ? qf0.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new f81(), 500L);
        this.I.b(this);
    }

    @Override // defpackage.es0
    public final void onCreate(vi2 vi2Var) {
    }

    @Override // defpackage.es0
    public final void onDestroy(vi2 vi2Var) {
    }

    @Override // defpackage.es0
    public final void onPause(vi2 vi2Var) {
    }

    @Override // defpackage.es0
    public final void onStart(vi2 vi2Var) {
    }

    @Override // defpackage.es0
    public final void onStop(vi2 vi2Var) {
    }
}
