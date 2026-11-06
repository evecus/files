package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.Comment;
import com.github.mytv.dv.model.CommentListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lb5 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public Object K;
    public Object L;
    public final /* synthetic */ Object M;
    public Object N;
    public final /* synthetic */ Object O;
    public Object P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb5(kq5 kq5Var, Aweme aweme, t43 t43Var, t43 t43Var2, s33 s33Var, t43 t43Var3, hk3 hk3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = kq5Var;
        this.L = aweme;
        this.M = t43Var;
        this.N = t43Var2;
        this.O = s33Var;
        this.P = t43Var3;
        this.Q = hk3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.Q;
        Object obj3 = this.O;
        Object obj4 = this.M;
        switch (b) {
            case 0:
                return new lb5((mb5) obj4, (List) obj3, (String) obj2, fj0Var);
            default:
                return new lb5((kq5) this.K, (Aweme) this.L, (t43) obj4, (t43) this.N, (s33) obj3, (t43) this.P, (hk3) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((lb5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        o53 o53Var;
        List list;
        String str;
        Object obj2;
        wd5 wd5Var;
        Object obj3;
        g73 g73Var;
        Object obj4;
        ys3 ys3Var;
        int i;
        ArrayList arrayList;
        int i2;
        uj3 uj3Var;
        long j;
        Object d;
        byte b = this.I;
        wd5 wd5Var2 = wd5.a;
        Object obj5 = this.Q;
        Object obj6 = this.O;
        el0 el0Var = el0.I;
        Object obj7 = this.M;
        switch (b) {
            case 0:
                mb5 mb5Var = (mb5) obj7;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    jb5 jb5Var = mb5.Companion;
                    Context context = mb5Var.a;
                    context.getClass();
                    jb5Var.getClass();
                    if (!jb5.a(context)) {
                        return wd5Var2;
                    }
                    o53Var = mb5Var.b;
                    list = (List) obj6;
                    str = (String) obj5;
                    this.K = o53Var;
                    this.L = mb5Var;
                    this.N = list;
                    this.P = str;
                    this.J = true;
                    if (o53Var.e(this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.P;
                    list = (List) this.N;
                    mb5Var = (mb5) this.L;
                    o53 o53Var2 = (o53) this.K;
                    mu0.V(obj);
                    o53Var = o53Var2;
                }
                try {
                    try {
                        g73Var = new g73((Object) mb5Var.a, (byte) 8);
                        List k = g73Var.k();
                        k.getClass();
                        Iterator it = k.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                try {
                                    obj4 = it.next();
                                    if (j42.c(((ys3) obj4).a.getAsString("internal_provider_id"), str)) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    obj2 = null;
                                    o53Var.g(obj2);
                                    throw th;
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        ys3Var = (ys3) obj4;
                    } catch (Exception e) {
                        e = e;
                        wd5Var = wd5Var2;
                    }
                    if (ys3Var == null) {
                        wd5Var = wd5Var2;
                        obj3 = null;
                        o53Var.g(obj3);
                        return wd5Var;
                    }
                    long b2 = ys3Var.b();
                    List l1 = o70.l1(list, 30);
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    for (Object obj8 : l1) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p70.A0();
                            throw null;
                        }
                        Aweme aweme = (Aweme) obj8;
                        at3 a = mb5.a(b2, i3, aweme);
                        uj3 uj3Var2 = a != null ? new uj3(aweme.getAwemeId(), a) : null;
                        if (uj3Var2 != null) {
                            arrayList2.add(uj3Var2);
                        }
                        i3 = i4;
                    }
                    ArrayList arrayList3 = new ArrayList(p70.J(arrayList2, 10));
                    int size = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj9 = arrayList2.get(i5);
                        i5++;
                        arrayList3.add((String) ((uj3) obj9).I);
                    }
                    Set u1 = o70.u1(arrayList3);
                    ArrayList c = mb5Var.c(b2);
                    int size2 = c.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj10 = c.get(i6);
                        i6++;
                        at3 at3Var = (at3) obj10;
                        String asString = at3Var.a.getAsString("internal_provider_id");
                        if (asString != null && u1.contains(asString)) {
                            wd5Var = wd5Var2;
                            wd5Var2 = wd5Var;
                        }
                        Long asLong = at3Var.a.getAsLong("_id");
                        long longValue = asLong == null ? -1L : asLong.longValue();
                        wd5Var = wd5Var2;
                        if (Build.VERSION.SDK_INT >= 26) {
                            try {
                                ((Context) g73Var.J).getContentResolver().delete(ContentUris.withAppendedId(ob5.a, longValue), null, null);
                            } catch (Exception e2) {
                                e = e2;
                                Log.w("TvChannelPublisher", "同步频道 " + str + " 失败", e);
                                obj3 = null;
                                o53Var.g(obj3);
                                return wd5Var;
                            }
                        }
                        wd5Var2 = wd5Var;
                    }
                    wd5Var = wd5Var2;
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = c.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj11 = c.get(i7);
                        int i8 = i7 + 1;
                        at3 at3Var2 = (at3) obj11;
                        String asString2 = at3Var2.a.getAsString("internal_provider_id");
                        if (asString2 != null) {
                            Long asLong2 = at3Var2.a.getAsLong("_id");
                            if (asLong2 == null) {
                                arrayList = c;
                                i2 = i8;
                                j = -1;
                            } else {
                                long longValue2 = asLong2.longValue();
                                arrayList = c;
                                i2 = i8;
                                j = longValue2;
                            }
                            i = size3;
                            uj3Var = new uj3(asString2, new Long(j));
                        } else {
                            i = size3;
                            arrayList = c;
                            i2 = i8;
                            uj3Var = null;
                        }
                        if (uj3Var != null) {
                            arrayList4.add(uj3Var);
                        }
                        c = arrayList;
                        i7 = i2;
                        size3 = i;
                    }
                    ArrayList arrayList5 = c;
                    Map W = sv2.W(arrayList4);
                    int size4 = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size4) {
                        Object obj12 = arrayList2.get(i9);
                        i9++;
                        uj3 uj3Var3 = (uj3) obj12;
                        String str2 = (String) uj3Var3.I;
                        at3 at3Var3 = (at3) uj3Var3.J;
                        Long l = (Long) W.get(str2);
                        if (l == null) {
                            new Long(g73Var.u(at3Var3));
                        } else {
                            g73Var.G(l.longValue(), at3Var3);
                        }
                    }
                    Log.i("TvChannelPublisher", "synced " + str + ": channel=" + b2 + " wanted=" + arrayList2.size() + " existing=" + arrayList5.size());
                    obj3 = null;
                    o53Var.g(obj3);
                    return wd5Var;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = null;
                }
                break;
            default:
                t43 t43Var = (t43) obj7;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    ta1 ta1Var = on5.a;
                    t43Var.setValue(Boolean.TRUE);
                    kq5 kq5Var = (kq5) this.K;
                    String awemeId = ((Aweme) this.L).getAwemeId();
                    this.J = true;
                    d = kq5Var.d(0, this, awemeId);
                    if (d == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                    d = ((h54) obj).I;
                }
                t43 t43Var2 = (t43) this.N;
                s33 s33Var = (s33) obj6;
                t43 t43Var3 = (t43) this.P;
                hk3 hk3Var = (hk3) obj5;
                if (!(d instanceof g54)) {
                    CommentListResponse commentListResponse = (CommentListResponse) d;
                    List<Comment> comments = commentListResponse.getComments();
                    if (comments == null) {
                        comments = o91.I;
                    }
                    ta1 ta1Var2 = on5.a;
                    t43Var2.setValue(comments);
                    ((gk3) s33Var).i((int) commentListResponse.getCursor());
                    t43Var3.setValue(Boolean.valueOf(commentListResponse.getHasMore() == 1));
                    hk3Var.i(commentListResponse.getTotal());
                }
                Throwable a2 = h54.a(d);
                if (a2 != null) {
                    Log.e("Comments", "Failed to load: " + a2.getMessage());
                }
                ta1 ta1Var3 = on5.a;
                t43Var.setValue(Boolean.FALSE);
                return wd5Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb5(mb5 mb5Var, List list, String str, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = mb5Var;
        this.O = list;
        this.Q = str;
    }
}
