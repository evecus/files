package androidx.media3.exoplayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;

    public /* synthetic */ w(Object obj, int i, byte b) {
        this.I = b;
        this.K = obj;
        this.J = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        int i = this.J;
        Object obj = this.K;
        switch (b) {
            case 0:
                ((ExoPlayerImplInternal) obj).lambda$setScrubbingModeEnabledInternal$3(i);
                break;
            default:
                ((StreamVolumeManager) obj).lambda$new$0(i);
                break;
        }
    }
}
