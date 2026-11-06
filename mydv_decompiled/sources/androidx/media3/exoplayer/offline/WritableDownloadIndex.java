package androidx.media3.exoplayer.offline;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download);

    void removeDownload(String str);

    void setDownloadingStatesToQueued();

    void setStatesToRemoving();

    void setStopReason(int i);

    void setStopReason(String str, int i);
}
