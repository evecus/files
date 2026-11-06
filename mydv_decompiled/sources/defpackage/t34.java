package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class t34 {
    public static final OkHttpClient a;
    public static final fw4 b;
    public static final fw4 c;
    public static final fw4 d;
    public static final fw4 e;
    public static final fw4 f;
    public static final List g;
    public static final q34 h;
    public static SharedPreferences i;

    static {
        ne5 ne5Var = oe5.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        oe5.a(builder);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = builder.connectTimeout(10L, timeUnit).readTimeout(15L, timeUnit).followRedirects(true).build();
        b = o7.c(null);
        Boolean bool = Boolean.FALSE;
        c = o7.c(bool);
        d = o7.c(null);
        e = o7.c(bool);
        f = o7.c(bool);
        g = p70.k0(dq.h1(new String[]{"aHR0cHM6Ly9yYXcuZ2l0aHVidXNlcmNvbnRlbnQuY29t", "L215dHYtYW5kcm9pZC9teURWL3JlZnMvaGVhZHMvbWFpbi9hcGkvcmVtb3RlX2NvbmZpZy5qc29u"}, "", new u73((byte) 17), 30), dq.h1(new String[]{"aHR0cHM6Ly9naC1wcm94eS5vcmcvaHR0cHM6Ly9yYXcuZ2l0aHVidXNlcmNvbnRlbnQuY29t", "L215dHYtYW5kcm9pZC9teURWL3JlZnMvaGVhZHMvbWFpbi9hcGkvcmVtb3RlX2NvbmZpZy5qc29u"}, "", new u73((byte) 17), 30));
        h = new q34("用户许可协议", "欢迎使用 myDV！\n\n在使用本应用之前，请仔细阅读以下协议：\n\n1. 本应用仅供个人学习和研究使用，请勿用于商业用途。\n\n2. 本应用所有内容均来自互联网，本应用不提供任何内容存储服务。\n\n3. 使用本应用即表示您同意遵守相关法律法规，不得利用本应用从事违法活动。\n\n4. 本应用不承担因使用本应用而产生的任何法律责任。\n\n5. 本应用保留随时修改本协议的权利，修改后的协议将在应用内公布。\n\n点击\"同意\"按钮即表示您已阅读并同意以上协议。", null, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (defpackage.jx4.L(r7) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.r34 a(java.lang.String r20, java.lang.String r21) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r20
            r0.<init>(r1)
            java.lang.String r1 = "license"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 != 0) goto L14
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L14:
            q34 r2 = defpackage.t34.h
            java.lang.String r3 = r2.a
            java.lang.String r4 = "title"
            java.lang.String r3 = r1.optString(r4, r3)
            r3.getClass()
            java.lang.String r5 = r2.b
            java.lang.String r6 = "content"
            java.lang.String r5 = r1.optString(r6, r5)
            r5.getClass()
            java.lang.String r7 = "url"
            boolean r8 = r1.isNull(r7)
            r9 = 0
            if (r8 == 0) goto L37
        L35:
            r7 = r9
            goto L44
        L37:
            java.lang.String r7 = r1.optString(r7)
            r7.getClass()
            boolean r8 = defpackage.jx4.L(r7)
            if (r8 != 0) goto L35
        L44:
            int r2 = r2.d
            java.lang.String r8 = "version"
            int r1 = r1.optInt(r8, r2)
            q34 r2 = new q34
            r2.<init>(r3, r5, r7, r1)
            java.lang.String r1 = "announcement"
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            if (r0 == 0) goto Lb8
            java.lang.String r1 = "enabled"
            r3 = 0
            boolean r1 = r0.optBoolean(r1, r3)
            if (r1 == 0) goto Lb8
            p34 r10 = new p34
            java.lang.String r1 = "id"
            java.lang.String r5 = "default"
            java.lang.String r11 = r0.optString(r1, r5)
            r11.getClass()
            java.lang.String r1 = "公告"
            java.lang.String r12 = r0.optString(r4, r1)
            r12.getClass()
            java.lang.String r1 = ""
            java.lang.String r13 = r0.optString(r6, r1)
            r13.getClass()
            java.lang.String r1 = "isForced"
            boolean r14 = r0.optBoolean(r1, r3)
            java.lang.String r1 = "confirmText"
            java.lang.String r4 = "确定"
            java.lang.String r15 = r0.optString(r1, r4)
            r15.getClass()
            java.lang.String r1 = "cancelText"
            java.lang.String r4 = "取消"
            java.lang.String r16 = r0.optString(r1, r4)
            r16.getClass()
            java.lang.String r1 = "showCancel"
            r4 = 1
            boolean r17 = r0.optBoolean(r1, r4)
            int r18 = r0.optInt(r8, r4)
            java.lang.String r1 = "showEveryTime"
            boolean r19 = r0.optBoolean(r1, r3)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = defpackage.jx4.L(r13)
            if (r0 != 0) goto Lb8
            r9 = r10
        Lb8:
            r34 r0 = new r34
            r1 = r21
            r0.<init>(r2, r9, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t34.a(java.lang.String, java.lang.String):r34");
    }
}
