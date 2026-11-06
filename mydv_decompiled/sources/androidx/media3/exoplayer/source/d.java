package androidx.media3.exoplayer.source;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ProgressiveMediaPeriod J;

    public /* synthetic */ d(ProgressiveMediaPeriod progressiveMediaPeriod, byte b) {
        this.I = b;
        this.J = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        ProgressiveMediaPeriod progressiveMediaPeriod = this.J;
        switch (b) {
            case 0:
                progressiveMediaPeriod.lambda$onLengthKnown$2();
                break;
            case 1:
                progressiveMediaPeriod.maybeFinishPrepare();
                break;
            default:
                progressiveMediaPeriod.lambda$new$0();
                break;
        }
    }
}
