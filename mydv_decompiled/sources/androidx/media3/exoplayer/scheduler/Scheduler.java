package androidx.media3.exoplayer.scheduler;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface Scheduler {
    boolean cancel();

    Requirements getSupportedRequirements(Requirements requirements);

    boolean schedule(Requirements requirements, String str, String str2);
}
