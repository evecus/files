package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.x24;
import defpackage.zx1;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class TrackSelectionUtil {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, List<? extends TrackSelection>[] listArr) {
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        List<? extends TrackSelection>[] listArr2 = listArr;
        zx1 zx1Var = new zx1(4);
        boolean z = false;
        int i = 0;
        while (i < mappedTrackInfo2.getRendererCount()) {
            TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i);
            int i2 = z ? 1 : 0;
            MappingTrackSelector.MappedTrackInfo mappedTrackInfo3 = mappedTrackInfo2;
            boolean z2 = z;
            while (i2 < trackGroups.length) {
                TrackGroup trackGroup = trackGroups.get(i2);
                boolean z3 = mappedTrackInfo3.getAdaptiveSupport(i, i2, z2) != 0 ? true : z2 ? 1 : 0;
                int i3 = trackGroup.length;
                int[] iArr = new int[i3];
                boolean[] zArr = new boolean[i3];
                int i4 = z2 ? 1 : 0;
                MappingTrackSelector.MappedTrackInfo mappedTrackInfo4 = mappedTrackInfo3;
                boolean z4 = z2;
                while (i4 < trackGroup.length) {
                    iArr[i4] = mappedTrackInfo4.getTrackSupport(i, i2, i4);
                    int length = listArr2.length;
                    boolean z5 = z4 ? 1 : 0;
                    boolean z6 = z5;
                    boolean z7 = z4;
                    for (?? r14 = z5; r14 < length; r14++) {
                        List<? extends TrackSelection> list = listArr2[r14];
                        ?? r3 = z7;
                        while (true) {
                            if (r3 < list.size()) {
                                TrackSelection trackSelection = list.get(r3);
                                if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i4) != -1) {
                                    z6 = true;
                                    break;
                                }
                                r3++;
                            }
                        }
                        listArr2 = listArr;
                        z7 = false;
                    }
                    zArr[i4] = z6;
                    i4++;
                    mappedTrackInfo4 = mappedTrackInfo;
                    listArr2 = listArr;
                    z4 = false;
                }
                zx1Var.c(new Tracks.Group(trackGroup, z3, iArr, zArr));
                i2++;
                mappedTrackInfo3 = mappedTrackInfo;
                listArr2 = listArr;
                z2 = false;
            }
            i++;
            mappedTrackInfo2 = mappedTrackInfo;
            listArr2 = listArr;
            z = false;
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i5 = 0; i5 < unmappedTrackGroups.length; i5++) {
            TrackGroup trackGroup2 = unmappedTrackGroups.get(i5);
            int[] iArr2 = new int[trackGroup2.length];
            Arrays.fill(iArr2, 0);
            zx1Var.c(new Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new Tracks(zx1Var.f());
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z = false;
        for (int i = 0; i < definitionArr.length; i++) {
            ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z) {
                    exoTrackSelectionArr[i] = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = androidx.media3.common.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = androidx.media3.common.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.TrackSelectionUtil.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i, TrackGroupArray trackGroupArray, boolean z, DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i).setRendererDisabled(i, z);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelection[] trackSelectionArr) {
        x24 x24Var;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i = 0; i < trackSelectionArr.length; i++) {
            TrackSelection trackSelection = trackSelectionArr[i];
            if (trackSelection != null) {
                x24Var = dy1.t(trackSelection);
            } else {
                ay1 ay1Var = dy1.J;
                x24Var = x24.M;
            }
            listArr[i] = x24Var;
        }
        return buildTracks(mappedTrackInfo, (List<? extends TrackSelection>[]) listArr);
    }
}
