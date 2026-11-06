package defpackage;

import android.util.Log;
import com.github.mytv.dv.model.EmojiItem;
import com.github.mytv.dv.model.EmojiListResponse;
import com.github.mytv.dv.model.EmojiUrl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ut2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ hu2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut2(hu2 hu2Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = hu2Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        hu2 hu2Var = this.K;
        switch (b) {
            case 0:
                return new ut2(hu2Var, fj0Var, (byte) 0);
            case 1:
                return new ut2(hu2Var, fj0Var, (byte) 1);
            default:
                return new ut2(hu2Var, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                return ((ut2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 1:
                return ((ut2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            default:
                ((ut2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0.I;
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object f;
        Map map;
        EmojiUrl emojiUrl;
        List<String> urlList;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        int i = 0;
        hu2 hu2Var = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (z) {
                    if (z) {
                        mu0.V(obj);
                        return wd5Var;
                    }
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                if (!((Boolean) t34.e.getValue()).booleanValue()) {
                    return wd5Var;
                }
                this.J = true;
                return hu2Var.s(this) == el0Var ? el0Var : wd5Var;
            case 1:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    kq5 kq5Var = hu2Var.g;
                    this.J = true;
                    f = kq5Var.f(this);
                    if (f == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                    f = ((h54) obj).I;
                }
                Pattern pattern = t81.a;
                if (f instanceof g54) {
                    return wd5Var;
                }
                EmojiListResponse emojiListResponse = (EmojiListResponse) f;
                emojiListResponse.getClass();
                if (emojiListResponse.getStatusCode() != 0) {
                    Log.w("EmojiManager", "表情列表接口返回错误码：" + emojiListResponse.getStatusCode());
                    return wd5Var;
                }
                List<EmojiItem> emojiList = emojiListResponse.getEmojiList();
                if (emojiList != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : emojiList) {
                        EmojiItem emojiItem = (EmojiItem) obj2;
                        if (!jx4.L(emojiItem.getDisplayName()) && (emojiUrl = emojiItem.getEmojiUrl()) != null && (urlList = emojiUrl.getUrlList()) != null && (!urlList.isEmpty())) {
                            arrayList.add(obj2);
                        }
                    }
                    int J = sv2.J(p70.J(arrayList, 10));
                    if (J < 16) {
                        J = 16;
                    }
                    map = new LinkedHashMap(J);
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        EmojiItem emojiItem2 = (EmojiItem) obj3;
                        String displayName = emojiItem2.getDisplayName();
                        EmojiUrl emojiUrl2 = emojiItem2.getEmojiUrl();
                        emojiUrl2.getClass();
                        map.put(displayName, o70.T0(emojiUrl2.getUrlList()));
                    }
                } else {
                    map = p91.I;
                }
                fw4 fw4Var = t81.b;
                fw4Var.getClass();
                fw4Var.i(null, map);
                Log.i("EmojiManager", "表情映射表加载完成：" + map.size() + " 个表情 (version=" + emojiListResponse.getVersion() + ")");
                return wd5Var;
            default:
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    n04 n04Var = hu2Var.r.i;
                    vt2 vt2Var = new vt2(hu2Var, (byte) 0);
                    this.J = true;
                    if (n04Var.I.collect(vt2Var, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z3) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                zy.n();
                return null;
        }
    }
}
