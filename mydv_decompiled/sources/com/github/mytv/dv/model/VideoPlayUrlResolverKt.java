package com.github.mytv.dv.model;

import defpackage.lq5;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class VideoPlayUrlResolverKt {
    public static final String resolveFinalPlayUrl(Video video, lq5 lq5Var, Aweme aweme) {
        video.getClass();
        return VideoPlayUrlResolver.INSTANCE.resolveFinalPlayUrl(video, lq5Var, aweme);
    }

    public static /* synthetic */ String resolveFinalPlayUrl$default(Video video, lq5 lq5Var, Aweme aweme, int i, Object obj) {
        if ((i & 2) != 0) {
            lq5Var = null;
        }
        if ((i & 4) != 0) {
            aweme = null;
        }
        return resolveFinalPlayUrl(video, lq5Var, aweme);
    }

    public static final String resolveH264PlayUrl(Video video, lq5 lq5Var) {
        video.getClass();
        return VideoPlayUrlResolver.INSTANCE.resolveH264PlayUrl(video, lq5Var);
    }

    public static /* synthetic */ String resolveH264PlayUrl$default(Video video, lq5 lq5Var, int i, Object obj) {
        if ((i & 2) != 0) {
            lq5Var = null;
        }
        return resolveH264PlayUrl(video, lq5Var);
    }
}
