package defpackage;

import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.DataModelKt;
import com.github.mytv.dv.model.MixPlaylistPagination;
import com.github.mytv.dv.model.UserWorksResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yw3 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ gx3 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ int L;
    public final /* synthetic */ int M;
    public final /* synthetic */ boolean N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw3(gx3 gx3Var, String str, int i, int i2, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = gx3Var;
        this.K = str;
        this.L = i;
        this.M = i2;
        this.N = z;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new yw3(this.J, this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((yw3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object q;
        rv4 rv4Var;
        rv4 rv4Var2;
        Map map;
        int i;
        int longValue;
        String awemeId;
        boolean z = this.I;
        int i2 = this.L;
        gx3 gx3Var = this.J;
        boolean z2 = true;
        if (!z) {
            mu0.V(obj);
            try {
                this.I = true;
                q = gx3Var.b.q(this.K, i2, false, this);
                el0 el0Var = el0.I;
                if (q == el0Var) {
                    return el0Var;
                }
            } catch (Throwable th) {
                th = th;
                rv4Var = null;
                gx3Var.d1 = rv4Var;
                throw th;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                mu0.V(obj);
                q = ((h54) obj).I;
            } catch (Throwable th2) {
                th = th2;
                rv4Var = null;
                gx3Var.d1 = rv4Var;
                throw th;
            }
        }
        String str = this.K;
        int i3 = this.M;
        boolean z3 = this.N;
        if (q instanceof g54) {
            rv4Var2 = null;
        } else {
            UserWorksResponse userWorksResponse = (UserWorksResponse) q;
            tw3 tw3Var = (tw3) o70.b1((List) gx3Var.Z0.getValue());
            if (tw3Var != null) {
                List list = tw3Var.a;
                MixPlaylistPagination mixPlaylistPagination = tw3Var.d;
                if (mixPlaylistPagination != null && j42.c(mixPlaylistPagination.getMixId(), str)) {
                    List<Aweme> awemeList = userWorksResponse.getAwemeList();
                    if (awemeList == null) {
                        awemeList = o91.I;
                    }
                    List<Aweme> filterPrimaryPlayableAwemes = DataModelKt.filterPrimaryPlayableAwemes(awemeList);
                    Map<Integer, List<Aweme>> pages = mixPlaylistPagination.getPages();
                    Integer num = new Integer(i2);
                    pages.getClass();
                    if (pages.isEmpty()) {
                        map = Collections.singletonMap(num, filterPrimaryPlayableAwemes);
                        map.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(pages);
                        linkedHashMap.put(num, filterPrimaryPlayableAwemes);
                        map = linkedHashMap;
                    }
                    List j1 = o70.j1(map.keySet());
                    ArrayList arrayList = new ArrayList();
                    Iterator it = j1.iterator();
                    while (it.hasNext()) {
                        boolean z4 = z2;
                        u70.I0(arrayList, (Iterable) sv2.E(new Integer(((Number) it.next()).intValue()), map));
                        z2 = z4;
                    }
                    boolean z5 = z2;
                    Aweme aweme = (Aweme) o70.V0(i3, list);
                    if (z3) {
                        if (aweme != null && (awemeId = aweme.getAwemeId()) != null) {
                            if (awemeId.length() <= 0) {
                                awemeId = null;
                            }
                            if (awemeId != null) {
                                int size = arrayList.size();
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    if (i4 >= size) {
                                        i5 = -1;
                                        break;
                                    }
                                    Object obj2 = arrayList.get(i4);
                                    i4++;
                                    if (j42.c(((Aweme) obj2).getAwemeId(), awemeId)) {
                                        break;
                                    }
                                    i5++;
                                }
                                Integer num2 = new Integer(i5);
                                if (num2.intValue() < 0) {
                                    num2 = null;
                                }
                                if (num2 != null) {
                                    i = num2.intValue();
                                }
                            }
                        }
                        i = i3 + (arrayList.size() - list.size());
                    } else {
                        i = tw3Var.b;
                    }
                    if (z3) {
                        longValue = mixPlaylistPagination.getNextCursor();
                    } else {
                        Long cursor = userWorksResponse.getCursor();
                        longValue = cursor != null ? (int) cursor.longValue() : awemeList.size() + i2;
                    }
                    int i6 = longValue;
                    boolean hasMore = z3 ? mixPlaylistPagination.getHasMore() : (!userWorksResponse.getHasMore() || filterPrimaryPlayableAwemes.isEmpty()) ? false : z5;
                    int size2 = arrayList.size() - 1;
                    if (size2 < 0) {
                        size2 = 0;
                    }
                    tw3 a = tw3.a(tw3Var, arrayList, ut0.r(i, 0, size2), MixPlaylistPagination.copy$default(mixPlaylistPagination, null, map, i6, hasMore, 1, null), 20);
                    fw4 fw4Var = gx3Var.Z0;
                    fw4Var.i(null, o70.g1(o70.R0((List) fw4Var.getValue()), a));
                }
            }
            rv4Var2 = null;
        }
        gx3Var.d1 = rv4Var2;
        return wd5.a;
    }
}
