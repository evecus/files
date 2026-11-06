package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import defpackage.dy1;
import defpackage.r7;
import defpackage.s83;
import defpackage.sp0;
import defpackage.sy1;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HlsRedundantGroup {
    public static final int AUDIO_RENDITION = 2;
    public static final int SUBTITLE_RENDITION = 3;
    public static final int VARIANT = 0;
    public static final int VIDEO_RENDITION = 1;
    private String currentPathwayId;
    public final GroupKey groupKey;
    private final List<Integer> indicesInMultivariantPlaylist;
    private final HashMap<String, Uri> pathwayIdToPlaylistUrl;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Factory {
        private final Map<String, String> audioGroupIdToPathwayId;
        private dy1 audioRenditionRedundantGroupList;
        private final boolean contentSteeringEnabled;
        private final HlsMultivariantPlaylist multivariantPlaylist;
        private final Map<String, String> subtitleGroupIdToPathwayId;
        private dy1 subtitleRenditionRedundantGroupList;
        private dy1 variantRedundantGroupList;
        private final Map<String, String> videoGroupIdToPathwayId;
        private dy1 videoRenditionRedundantGroupList;

        public Factory(HlsMultivariantPlaylist hlsMultivariantPlaylist) {
            this.multivariantPlaylist = hlsMultivariantPlaylist;
            this.contentSteeringEnabled = hlsMultivariantPlaylist.contentSteeringInfo != null;
            this.videoGroupIdToPathwayId = new HashMap();
            this.audioGroupIdToPathwayId = new HashMap();
            this.subtitleGroupIdToPathwayId = new HashMap();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v8 java.lang.String, still in use, count: 2, list:
              (r1v8 java.lang.String) from 0x003a: IF  (r1v8 java.lang.String) == (null java.lang.String)  -> B:6:0x0021 A[HIDDEN] (LINE:59)
              (r1v8 java.lang.String) from 0x003d: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v8 java.lang.String) binds: [B:16:0x003f, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"variantRedundantGroupList"})
        private defpackage.dy1 createAndValidateRenditionRedundantGroupList(java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition> r10, java.util.Map<java.lang.String, java.lang.String> r11) {
            /*
                r9 = this;
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.HashMap r7 = new java.util.HashMap
                r7.<init>()
                r0 = 0
                r3 = r0
            L11:
                int r0 = r10.size()
                if (r3 >= r0) goto L4b
                java.lang.Object r0 = r10.get(r3)
                androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist$Rendition r0 = (androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition) r0
                android.net.Uri r1 = r0.url
                if (r1 != 0) goto L23
            L21:
                r0 = r9
                goto L47
            L23:
                androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup$GroupKey r5 = new androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup$GroupKey
                androidx.media3.common.Format r1 = r0.format
                java.lang.String r2 = r0.stableRenditionId
                java.lang.String r8 = r0.name
                r5.<init>(r1, r2, r8)
                boolean r1 = r9.contentSteeringEnabled
                if (r1 == 0) goto L3f
                java.lang.String r1 = r0.groupId
                java.lang.Object r1 = r11.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L3d
                goto L21
            L3d:
                r2 = r1
                goto L41
            L3f:
                r1 = 0
                goto L3d
            L41:
                android.net.Uri r1 = r0.url
                r0 = r9
                r0.propagateRedundantGroupList(r1, r2, r3, r4, r5, r6, r7)
            L47:
                int r3 = r3 + 1
                r9 = r0
                goto L11
            L4b:
                r0 = r9
                r0.validateRenditionRedundantGroupList(r4)
                dy1 r9 = defpackage.dy1.p(r4)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.HlsRedundantGroup.Factory.createAndValidateRenditionRedundantGroupList(java.util.List, java.util.Map):dy1");
        }

        @EnsuresNonNull({"variantRedundantGroupList"})
        private void ensureVariantRedundantGroupListCreated() {
            if (this.variantRedundantGroupList == null) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                int i = 0;
                while (i < this.multivariantPlaylist.variants.size()) {
                    HlsMultivariantPlaylist.Variant variant = this.multivariantPlaylist.variants.get(i);
                    Factory factory = this;
                    String propagateRedundantGroupList = factory.propagateRedundantGroupList(variant.url, variant.pathwayId, i, arrayList, new GroupKey(variant.format, variant.stableVariantId), hashMap, hashMap2);
                    if (factory.contentSteeringEnabled) {
                        String str = variant.videoGroupId;
                        if (str != null) {
                            updateGroupIdToPathwayIdMapping(factory.videoGroupIdToPathwayId, str, propagateRedundantGroupList);
                        }
                        String str2 = variant.audioGroupId;
                        if (str2 != null) {
                            updateGroupIdToPathwayIdMapping(factory.audioGroupIdToPathwayId, str2, propagateRedundantGroupList);
                        }
                        String str3 = variant.subtitleGroupId;
                        if (str3 != null) {
                            updateGroupIdToPathwayIdMapping(factory.subtitleGroupIdToPathwayId, str3, propagateRedundantGroupList);
                        }
                    }
                    i++;
                    this = factory;
                }
                Factory factory2 = this;
                factory2.variantRedundantGroupList = dy1.p(arrayList);
                factory2.validateVariantRedundantGroupList();
            }
        }

        private String propagateRedundantGroupList(Uri uri, String str, int i, List<HlsRedundantGroup> list, GroupKey groupKey, Map<GroupKey, Integer> map, Map<GroupKey, Integer> map2) {
            int i2;
            String str2;
            Integer num = map.get(groupKey);
            int i3 = 1;
            if (num == null) {
                if (str == null) {
                    map2.put(groupKey, 1);
                    str = ".";
                } else {
                    map2.put(groupKey, 0);
                }
                HlsRedundantGroup hlsRedundantGroup = new HlsRedundantGroup(groupKey, str, uri, i);
                map.put(groupKey, Integer.valueOf(list.size()));
                list.add(hlsRedundantGroup);
                return str;
            }
            if (str == null) {
                Integer num2 = map2.get(groupKey);
                num2.getClass();
                int intValue = num2.intValue();
                if (this.contentSteeringEnabled && intValue >= 1) {
                    throw ParserException.createForMalformedManifest("At most one playlist URL within an HlsRedundantGroup can have an undefined pathway when Content Steering is enabled", null);
                }
                int i4 = intValue + 1;
                if (i4 <= 1) {
                    sp0.m(i4, "invalid count: %s", i4 >= 0);
                    str2 = i4 == 0 ? "" : ".";
                } else {
                    long j = i4;
                    int i5 = (int) j;
                    if (i5 != j) {
                        throw new ArrayIndexOutOfBoundsException(r7.A("Required array size too large: ", j));
                    }
                    char[] cArr = new char[i5];
                    ".".getChars(0, 1, cArr, 0);
                    while (true) {
                        i2 = i5 - i3;
                        if (i3 >= i2) {
                            break;
                        }
                        System.arraycopy(cArr, 0, cArr, i3, i3);
                        i3 <<= 1;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i2);
                    str2 = new String(cArr);
                }
                map2.put(groupKey, Integer.valueOf(i4));
                str = str2;
            }
            HlsRedundantGroup hlsRedundantGroup2 = list.get(num.intValue());
            Uri playlistUrl = hlsRedundantGroup2.getPlaylistUrl(str);
            if (playlistUrl == null || uri.equals(playlistUrl)) {
                hlsRedundantGroup2.put(str, uri, i);
                return str;
            }
            throw ParserException.createForMalformedManifest("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }

        private static void updateGroupIdToPathwayIdMapping(Map<String, String> map, String str, String str2) {
            if (!map.containsKey(str) || str2.equals(map.get(str))) {
                map.put(str, str2);
                return;
            }
            throw ParserException.createForMalformedManifest("The group ID " + str + " is associated with more than one pathway from variants", null);
        }

        @RequiresNonNull({"variantRedundantGroupList"})
        private void validateRenditionRedundantGroupList(List<HlsRedundantGroup> list) {
            if (this.contentSteeringEnabled) {
                HlsRedundantGroup hlsRedundantGroup = (HlsRedundantGroup) this.variantRedundantGroupList.get(0);
                hlsRedundantGroup.getClass();
                sy1 allPathwayIds = hlsRedundantGroup.getAllPathwayIds();
                for (int i = 0; i < list.size(); i++) {
                    if (!list.get(i).getAllPathwayIds().equals(allPathwayIds)) {
                        throw ParserException.createForMalformedManifest("The set of available pathway IDs of a rendition redundant group is inconsistent with variant redundant groups", null);
                    }
                }
            }
        }

        @RequiresNonNull({"variantRedundantGroupList"})
        private void validateVariantRedundantGroupList() {
            if (this.contentSteeringEnabled) {
                HlsRedundantGroup hlsRedundantGroup = (HlsRedundantGroup) this.variantRedundantGroupList.get(0);
                hlsRedundantGroup.getClass();
                sy1 allPathwayIds = hlsRedundantGroup.getAllPathwayIds();
                for (int i = 1; i < this.variantRedundantGroupList.size(); i++) {
                    if (!((HlsRedundantGroup) this.variantRedundantGroupList.get(i)).getAllPathwayIds().equals(allPathwayIds)) {
                        throw ParserException.createForMalformedManifest("The set of available pathway IDs is inconsistent among variant redundant groups", null);
                    }
                }
            }
        }

        public dy1 createRenditionRedundantGroupList(int i) {
            ensureVariantRedundantGroupListCreated();
            if (i == 1) {
                dy1 dy1Var = this.videoRenditionRedundantGroupList;
                if (dy1Var != null) {
                    return dy1Var;
                }
                dy1 createAndValidateRenditionRedundantGroupList = createAndValidateRenditionRedundantGroupList(this.multivariantPlaylist.videos, this.videoGroupIdToPathwayId);
                this.videoRenditionRedundantGroupList = createAndValidateRenditionRedundantGroupList;
                return createAndValidateRenditionRedundantGroupList;
            }
            if (i == 2) {
                dy1 dy1Var2 = this.audioRenditionRedundantGroupList;
                if (dy1Var2 != null) {
                    return dy1Var2;
                }
                dy1 createAndValidateRenditionRedundantGroupList2 = createAndValidateRenditionRedundantGroupList(this.multivariantPlaylist.audios, this.audioGroupIdToPathwayId);
                this.audioRenditionRedundantGroupList = createAndValidateRenditionRedundantGroupList2;
                return createAndValidateRenditionRedundantGroupList2;
            }
            if (i != 3) {
                s83.t("Invalid type for creating rendition redundant group list");
                return null;
            }
            dy1 dy1Var3 = this.subtitleRenditionRedundantGroupList;
            if (dy1Var3 != null) {
                return dy1Var3;
            }
            dy1 createAndValidateRenditionRedundantGroupList3 = createAndValidateRenditionRedundantGroupList(this.multivariantPlaylist.subtitles, this.subtitleGroupIdToPathwayId);
            this.subtitleRenditionRedundantGroupList = createAndValidateRenditionRedundantGroupList3;
            return createAndValidateRenditionRedundantGroupList3;
        }

        public dy1 createVariantRedundantGroupList() {
            ensureVariantRedundantGroupListCreated();
            return this.variantRedundantGroupList;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public HlsRedundantGroup(GroupKey groupKey, String str, Uri uri, int i) {
        this.groupKey = groupKey;
        HashMap<String, Uri> hashMap = new HashMap<>();
        this.pathwayIdToPlaylistUrl = hashMap;
        hashMap.put(str, uri);
        this.currentPathwayId = str;
        ArrayList arrayList = new ArrayList();
        this.indicesInMultivariantPlaylist = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public sy1 getAllPathwayIds() {
        return sy1.o(this.pathwayIdToPlaylistUrl.keySet());
    }

    public sy1 getAllPlaylistUrls() {
        return sy1.o(this.pathwayIdToPlaylistUrl.values());
    }

    public String getCurrentPathwayId() {
        return this.currentPathwayId;
    }

    public Uri getCurrentPlaylistUrl() {
        Uri uri = this.pathwayIdToPlaylistUrl.get(this.currentPathwayId);
        uri.getClass();
        return uri;
    }

    public dy1 getIndicesInMultivariantPlaylist() {
        return dy1.p(this.indicesInMultivariantPlaylist);
    }

    public Uri getPlaylistUrl(String str) {
        return this.pathwayIdToPlaylistUrl.get(str);
    }

    public void put(String str, Uri uri, int i) {
        this.pathwayIdToPlaylistUrl.put(str, uri);
        if (i != -1) {
            this.indicesInMultivariantPlaylist.add(Integer.valueOf(i));
        }
    }

    public void setCurrentPathwayId(String str) {
        sp0.z(this.pathwayIdToPlaylistUrl.containsKey(str));
        this.currentPathwayId = str;
    }

    public int size() {
        return this.pathwayIdToPlaylistUrl.size();
    }

    public void put(String str, Uri uri) {
        put(str, uri, -1);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class GroupKey {
        public final Format format;
        public final String name;
        public final String stableId;

        public GroupKey(Format format, String str, String str2) {
            this.format = format.buildUpon().setId((String) null).setMetadata(null).build();
            this.stableId = str;
            this.name = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupKey)) {
                return false;
            }
            GroupKey groupKey = (GroupKey) obj;
            return Objects.equals(this.format, groupKey.format) && Objects.equals(this.stableId, groupKey.stableId) && Objects.equals(this.name, groupKey.name);
        }

        public int hashCode() {
            return Objects.hash(this.format, this.stableId, this.name);
        }

        public GroupKey(Format format, String str) {
            this(format, str, null);
        }
    }

    public HlsRedundantGroup(GroupKey groupKey, String str, Uri uri) {
        this(groupKey, str, uri, -1);
    }
}
