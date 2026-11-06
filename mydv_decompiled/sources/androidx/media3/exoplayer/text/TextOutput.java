package androidx.media3.exoplayer.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface TextOutput {
    void onCues(CueGroup cueGroup);

    @Deprecated
    void onCues(List<Cue> list);
}
